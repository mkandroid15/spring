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
 *         18:31:28
 */
public interface CitiesDAO extends CrudRepository<Cities, Integer> {

    @Override
    List<Cities> findAll();

}
