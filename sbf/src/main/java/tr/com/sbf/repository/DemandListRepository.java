/**
 * @author Mehmet
 *
 * 31 Ağu 2018
 *
 * 21:11:21
 */

package tr.com.sbf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.com.sbf.model.Demand;
import tr.com.sbf.model.DemandItem;

public interface DemandListRepository extends JpaRepository<Demand, Long> {

	@Query(value = "SELECT new tr.com.sbf.model.DemandItem(d.id, u.adSoyad) FROM demand d "
			+ "   INNER JOIN insurance i on d.detailId = i.id INNER JOIN user u on d.userId = u.id Where d.demandType = 1", nativeQuery = false)
	List<DemandItem> findInsuranceDemands();

	@Query(value = "SELECT new tr.com.sbf.model.DemandItem(d.id, u.adSoyad) FROM demand d "
			+ "   INNER JOIN consulting_demand c on d.detailId = c.id INNER JOIN user u on d.userId = u.id Where d.demandType = 2", nativeQuery = false)
	List<DemandItem> findConsultingDemands();

	@Query(value = "SELECT new tr.com.sbf.model.DemandItem(d.id, u.adSoyad) FROM demand d "
			+ "   INNER JOIN brand b on d.detailId = b.id INNER JOIN user u on d.userId = u.id Where d.demandType = 3", nativeQuery = false)
	List<DemandItem> findBrandDemands();

}
