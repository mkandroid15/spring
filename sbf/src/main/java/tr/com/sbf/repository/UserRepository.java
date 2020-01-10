/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:52:34
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.sbf.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);

}
