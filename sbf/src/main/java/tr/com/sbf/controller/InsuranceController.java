/**
 * @author Mehmet
 *
 * 22 Haz 2018
 *
 * 22:55:02
 */

package tr.com.sbf.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.sbf.model.Customer;
import tr.com.sbf.model.Insurance;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.DistrictsDAO;
import tr.com.sbf.repository.InsuranceRepository;
import tr.com.sbf.service.DemandService;

@Controller
public class InsuranceController extends SbfController {

	@Autowired
	private DemandService demandService;

	@Autowired
	private final InsuranceRepository insuranceRepository;

	public InsuranceController(CitiesDAO citiesDAO, DistrictsDAO districtDAO, InsuranceRepository insuranceRepository) {
		super(citiesDAO, districtDAO);
		this.insuranceRepository = insuranceRepository;
	}

	@RequestMapping("/insurance")
	public String getInsuredPage(final Model model) {
		final Insurance insurance = new Insurance();
		insurance.setPartner(getPartnerInfo());

		final Customer customer = new Customer();

		insurance.setCustomer(customer);

		model.addAttribute("insurance", insurance);

		return "insurance";
	}

	@RequestMapping(value = "/insurance", method = RequestMethod.POST)
	public String saveDemand(@Valid Insurance insurance, BindingResult bindingResult, Model model) {
		System.out.println("insured submit oldu.");
		this.insuranceRepository.save(insurance);
		this.demandService.CreateDemand(1, insurance.getId());
		return "home";
	}

}
