/**
 * @author Mehmet
 *
 * 30 Eyl 2018
 *
 * 18:19:13
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConsultingRepository extends CrudRepository<ConsultingDemand, Long> {

	@Query(value = "select c.id from demand d inner join consulting_demand c on d.detailId=c.id"
			+ " where d.id = :guid", nativeQuery = false)
	Long getConsultingById(@Param("guid") String detailId);

}
