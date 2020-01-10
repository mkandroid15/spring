/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:45:01
 */

package tr.com.sbf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import tr.com.sbf.model.User;
import tr.com.sbf.service.SecurityService;
import tr.com.sbf.service.UserService;
import tr.com.sbf.validator.UserValidator;

@Controller
public class UserController implements WebMvcConfigurer {

	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;

	@Autowired
	private UserValidator userValidator;

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration(Model model) {
		System.out.println("register sayfasına gelindi");
		final User user = new User();

		model.addAttribute("user", user);

		return "register";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public String registration(@Valid User user, BindingResult bindingResult, Model model) {

		// final UserValidator userValidator = new UserValidator();
		this.userValidator.validate(user, bindingResult);

		if (bindingResult.hasErrors()) {
			return "register";
		}

		// final Set<Role> roles = new HashSet<>();
		// final Role role = new Role();
		// role.setId((long) 1);
		// roles.add(role);
		//
		// user.setRoles(roles);

		// final UserService userService = new UserServiceImpl();
		this.userService.save(user);

		// final SecurityService securityService = new SecurityServiceImpl();
		this.securityService.autologin(user.getUsername(), user.getPasswordConfirm());

		return "redirect:/home";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		System.out.println("login sayfasına gelindi..");
		if (error != null) {
			model.addAttribute("error", "Your username and password is invalid.");
		}

		if (logout != null) {
			model.addAttribute("message", "You have been logged out successfully.");
		}

		return "login";
	}

	@RequestMapping(value = { "/home" }, method = RequestMethod.GET)
	public ModelAndView welcome(Model model) {
		final Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		final String name = loggedInUser.getName();
		// final UserService userService = new UserServiceImpl();
		final User user = this.userService.findByUsername(name);
		final ModelAndView view = new ModelAndView("home");
		if (user != null) {
			view.addObject("name", user.getAdSoyad());
		}

		return view;
	}

	@RequestMapping("/user/add")
	public ModelAndView addUser() {
		return new ModelAndView("adduser", "user", new User());
	}

}
