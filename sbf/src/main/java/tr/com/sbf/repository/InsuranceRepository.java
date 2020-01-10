/**
 * @author Mehmet
 *
 * 12 Ağu 2018
 *
 * 16:45:29
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tr.com.sbf.model.Insurance;

public interface InsuranceRepository extends CrudRepository<Insurance, Long> {

	@Query(value = "select i.id from insurance i inner join demand d on i.id = d.detailId"
			+ " where d.id = :guid", nativeQuery = false)
	Long getInsuranceById(@Param("guid") String detailId);
}
