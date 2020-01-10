/**
 * @author Mehmet
 *
 * 24 Tem 2018
 *
 * 23:18:33
 */

package tr.com.sbf.repository;

import org.springframework.data.repository.CrudRepository;

public interface BrandPricesDAO extends CrudRepository<BrandPrices, Integer> {

	void updateFee(double fee, double first, double service, int id);

}
