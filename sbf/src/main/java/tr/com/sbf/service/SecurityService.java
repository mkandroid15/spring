/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:53:15
 */

package tr.com.sbf.service;

public interface SecurityService {
	String findLoggedInUsername();

	void autologin(String username, String password);
}
