/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 23:23:29
 */

package tr.com.sbf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import tr.com.sbf.model.Jobs;
import tr.com.sbf.model.Role;
import tr.com.sbf.model.User;
import tr.com.sbf.repository.RoleRepository;
import tr.com.sbf.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	// @Autowired
	// private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {

		final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

		final Role r = new Role();
		r.setId((long) 1);
		final Example<Role> example = Example.of(r);
		user.setRole((this.roleRepository.findAll(example).get(0)));
		user.setPartajNo(decidePartajNo(user.getMeslekTuru()));
		this.userRepository.save(user);
	}

	@Override
	public User findByUsername(String username) {
		return this.userRepository.findByUsername(username);
	}

	private int decidePartajNo(Jobs job) {
		switch (job) {
		case ARAC_SATIS_BAYII:
			break;
		case DANISMAN:
			break;
		case DERNEK:
			break;
		case EMLAK_OFISI:
			break;
		case GUMRUK_MUSAVIRI:
			break;
		case MALI_MUSAVIR:
			break;
		case SIGORTA_ACENTESI:
			break;
		case DIGER:
			break;

		default:
			break;
		}
		return 0;
	}

}
