/**
 * @author Mehmet
 *
 * 21 Haz 2018
 *
 * 19:13:40
 */

package tr.com.sbf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import tr.com.sbf.model.PartnerSummary;
import tr.com.sbf.model.User;
import tr.com.sbf.repository.Cities;
import tr.com.sbf.repository.CitiesDAO;
import tr.com.sbf.repository.Districts;
import tr.com.sbf.repository.DistrictsDAO;
import tr.com.sbf.service.UserService;

public class SbfController {

	protected final CitiesDAO citiesDAO;
	protected final DistrictsDAO districtDAO;

	@Autowired
	protected UserService userService;

	public SbfController(CitiesDAO citiesDAO, DistrictsDAO districtDAO) {
		super();
		this.citiesDAO = citiesDAO;
		this.districtDAO = districtDAO;
	}

	protected String getCityName(int cityCode) {
		final List<Cities> list = this.citiesDAO.findAll();
		for (final Cities city : list) {
			if (city.getId() == cityCode) {
				return city.getName();
			}
		}
		return null;
	}

	protected String getDistinctName(int distinctCode, int cityCode) {
		final List<Districts> list = this.districtDAO.findBycityCode(cityCode);
		for (final Districts district : list) {
			if (district.getDistrictid() == distinctCode) {
				return district.getName();
			}
		}
		return null;
	}

	protected PartnerSummary getPartnerInfo() {
		final Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		final User user = this.userService.findByUsername(loggedInUser.getName());

		final PartnerSummary partner = new PartnerSummary();
		partner.setName(user.getAdSoyad());
		partner.setPartaj(user.getPartajNo());
		partner.setBrans("mali müşavir");
		partner.setGsm(user.getGsm());
		partner.setWorkphone(user.getIsTelefon());
		partner.setEmail(user.getEmail());
		partner.setDistrict(getDistinctName(user.getDistrictCode(), user.getCityCode()));
		partner.setCity(getCityName(user.getCityCode()));

		return partner;
	}

	protected boolean isRoleOfficial() {
		final Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
		final User user = this.userService.findByUsername(loggedInUser.getName());
		return user.getRole().getName().equals("Memur");
	}

}
