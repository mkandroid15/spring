/**
 * @author Mehmet
 *
 * 19 Nis 2018
 *
 * 00:07:05
 */

package tr.com.sbf.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tr.com.sbf.repository.Cities;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.Districts;
import tr.com.sbf.repository.DistrictsDAO;

@org.springframework.web.bind.annotation.RestController
public class PublicController extends SbfController {

	public PublicController(CitiesDAO citiesDAO, DistrictsDAO districtDAO) {
		super(citiesDAO, districtDAO);
	}

	@RequestMapping(value = "/public/getCitiesList", method = RequestMethod.GET)
	public List<Cities> getCities() {

		// List<Cities> sortedList=new ArrayList<Cities>();

		final List<Cities> list = this.citiesDAO.findAll();
		final Cities ist = list.get(33);
		final Cities izm = list.get(34);
		final Cities ank = list.get(5);
		list.remove(ist);
		list.remove(izm);
		list.remove(ank);

		list.add(0, ist);
		list.add(1, ank);
		list.add(2, izm);

		return list;
	}

	@RequestMapping(value = "/public/getDictrictsList/{cityCode}", method = RequestMethod.GET)
	public List<Districts> getDistricts(@PathVariable("cityCode") final int cityCode) {
		return this.districtDAO.findBycityCode(cityCode);
	}

}
