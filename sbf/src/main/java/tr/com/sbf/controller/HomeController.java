/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:36:16
 */

package tr.com.sbf.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import tr.com.sbf.model.User;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.DistrictsDAO;

@Controller
public class HomeController extends SbfController {

	public HomeController(CitiesDAO citiesDAO, DistrictsDAO districtDAO) {
		super(citiesDAO, districtDAO);
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/")
	public String getHomePage(@AuthenticationPrincipal User user) {
		if (isRoleOfficial()) {
			return "officialHome";
		} else {
			return "redirect:/home";
		}
	}

}
