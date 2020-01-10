/**
 * @author Mehmet
 *
 * 11 Ağu 2018
 *
 * 00:19:16
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.sbf.model.Demand;

public interface DemandRepository extends JpaRepository<Demand, String> {

}
