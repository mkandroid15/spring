/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:51:58
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.sbf.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
