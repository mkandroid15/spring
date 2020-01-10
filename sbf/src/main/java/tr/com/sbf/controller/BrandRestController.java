/**
 * @author Mehmet
 *
 * 5 Ağu 2018
 *
 * 17:02:53
 */

package tr.com.sbf.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tr.com.sbf.model.BrandPriceResult;
import tr.com.sbf.repository.BrandDescription;
import tr.com.sbf.repository.BrandDescriptionDAO;
import tr.com.sbf.repository.BrandPrices;
import tr.com.sbf.repository.BrandPricesDAO;
import tr.com.sbf.repository.BrandPricesReadDAO;

@RestController
public class BrandRestController {

	private final BrandDescriptionDAO brandDescriptionDAO;
	private final BrandPricesDAO brandPricesDAO;
	private final BrandPricesReadDAO brandPricesReadDAO;

	public BrandRestController(BrandDescriptionDAO brandDescriptionDAO, BrandPricesDAO brandPricesDAO,
			BrandPricesReadDAO brandPricesReadDAO) {
		super();
		this.brandDescriptionDAO = brandDescriptionDAO;
		this.brandPricesDAO = brandPricesDAO;
		this.brandPricesReadDAO = brandPricesReadDAO;
	}

	@RequestMapping(value = "/brand/getBrandDescription/{brandId}", method = RequestMethod.GET)
	public String getBrandDescription(@PathVariable("brandId") final int brandId) {
		if (this.brandDescriptionDAO.existsById(brandId)) {
			final Optional<BrandDescription> desc = this.brandDescriptionDAO.findById(brandId);
			return desc.get().getDescrpition();
		}
		return null;
	}

	@RequestMapping(value = "/brand/getBrandPrice/{count}", method = RequestMethod.GET, produces = {
			"application/json" })
	public BrandPriceResult getBrandPrice(@PathVariable("count") final byte count) {
		if (count > 0) {
			final int l = 0;

			final Optional<BrandPrices> price = this.brandPricesReadDAO.findById(l);
			if (price.get() != null) {
				final BrandPriceResult result = new BrandPriceResult();
				double totalservice = 0;
				if (count <= 3) {
					totalservice = price.get().getFirstPrice();
				} else {
					totalservice = price.get().getServicePrice() * count;
				}
				result.setService(totalservice);
				result.setFee(price.get().getFeePrice() * count);
				final double total = result.getFee() + result.getTotal();
				result.setTotal(total);

				return result;
			}

		}
		return null;
	}

}
