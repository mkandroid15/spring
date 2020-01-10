/**
 * 
 */
package tr.com.sbf.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Mehmet.Kaynak
 *
 *         7 Ara 2017
 *
 *         18:33:29
 */
public interface DistrictsDAO extends CrudRepository<Districts, Integer> {

    List<Districts> findBycityCode(int cityCode);

}
