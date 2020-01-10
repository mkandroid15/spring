/**
 * @author Mehmet
 *
 * 12 Ağu 2018
 *
 * 21:16:04
 */

package tr.com.sbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.DistrictsDAO;

@Controller
public class ManageController extends SbfController {

	public ManageController(CitiesDAO citiesDAO, DistrictsDAO districtDAO) {
		super(citiesDAO, districtDAO);
	}

	@GetMapping("/insurancedemands")
	public String getInsuranceDemands(Model model) {
		return "insuranceDemands";
	}
}
