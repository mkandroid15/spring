/**
 * @author Mehmet
 *
 * 23 Tem 2018
 *
 * 22:04:32
 */

package tr.com.sbf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import tr.com.sbf.model.Brand;
import tr.com.sbf.model.Customer;
import tr.com.sbf.repository.BrandPrices;
import tr.com.sbf.repository.BrandPricesDAO;
import tr.com.sbf.repository.BrandRepository;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.DistrictsDAO;
import tr.com.sbf.service.DemandService;

@Controller
public class BrandController extends SbfController {

	@Autowired
	private DemandService demandService;

	private final BrandPricesDAO brandPricesDAO;
	private final BrandRepository brandRepository;

	public BrandController(CitiesDAO citiesDAO, DistrictsDAO districtDAO, BrandPricesDAO brandPricesDAO,
			BrandRepository brandRepository) {
		super(citiesDAO, districtDAO);
		this.brandPricesDAO = brandPricesDAO;
		this.brandRepository = brandRepository;
	}

	@GetMapping("/brand")
	public String getBrandPage(final Model model) {
		final Brand brand = new Brand();
		brand.setPartner(getPartnerInfo());
		final Customer customer = new Customer();
		brand.setCustomer(customer);

		model.addAttribute("brand", brand);
		return "brand";
	}

	@RequestMapping(value = "/brand", method = RequestMethod.POST)
	public String saveBrandDemand(@Valid Brand brand, BindingResult bindingResult, Model model) {
		System.out.println("brand submit oldu.");
		this.brandRepository.save(brand);
		this.demandService.CreateDemand(3, brand.getId());
		// this.insuranceRepository.save(insurance);
		// this.demandService.CreateDemand(1, insurance.getId());
		return "home";
	}

	@GetMapping("/brandprice")
	public String brandPriceForm(final Model model) {
		final BrandPrices price = new BrandPrices();
		model.addAttribute("brandPrices", price);
		return "brandPrice";
	}

	@PostMapping("/brandprice")
	public ModelAndView updatePrice(final ModelAndView modelAndView, @Valid final BrandPrices brandPrices,
			final BindingResult result) {
		if (result.hasErrors()) {
			modelAndView.setViewName("brandprice");
		} else {
			this.brandPricesDAO.updateFee(brandPrices.getFeePrice(), brandPrices.getFirstPrice(),
					brandPrices.getServicePrice(), 0);
			modelAndView.setViewName("brand");
			final Brand brand = new Brand();
			modelAndView.addObject("brand", brand);
		}
		return modelAndView;
	}

}
