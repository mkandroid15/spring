/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 23:23:07
 */

package tr.com.sbf.service;

import tr.com.sbf.model.User;

public interface UserService {
	void save(User user);

	User findByUsername(String username);

}
