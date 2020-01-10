/**
 * @author Mehmet
 *
 * 24 Tem 2018
 *
 * 23:19:28
 */

package tr.com.sbf.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BrandPricesDAOImpl implements BrandPricesDAO {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(BrandPrices arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends BrandPrices> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<BrandPrices> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<BrandPrices> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<BrandPrices> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BrandPrices> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends BrandPrices> Iterable<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFee(double fee, double first, double service, int id) {
		this.manager.createNamedQuery("abc", BrandPrices.class).setParameter(0, fee).setParameter(1, first)
				.setParameter(2, service).setParameter(3, id).executeUpdate();

	}

}
