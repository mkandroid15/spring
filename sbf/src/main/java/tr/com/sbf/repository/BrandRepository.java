/**
 * @author Mehmet
 *
 * 23 Eki 2018
 *
 * 21:32:34
 */

package tr.com.sbf.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tr.com.sbf.model.Brand;

public interface BrandRepository extends CrudRepository<Brand, Long> {

	@Query(value = "select b.id from demand d inner join brand b on d.detailId = b.id"
			+ " where d.id = :guid", nativeQuery = false)
	Long getBrandById(@Param("guid") String detailId);

}
