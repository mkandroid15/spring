/**
 * @author Mehmet
 *
 * 11 Ağu 2018 
 *
 * 00:22:34
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.sbf.model.DemandTypes;

public interface DemandTypesRepository extends JpaRepository<DemandTypes, Integer> {

}
