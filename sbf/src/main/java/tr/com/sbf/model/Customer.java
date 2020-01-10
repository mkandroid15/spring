/**
 *
 */
package tr.com.sbf.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Range;

/**
 * @author Mehmet.Kaynak
 *
 *         12 Ara 2017
 *
 *         23:22:31
 */
@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	PartnerTur partnerTuru;
	long tcKimlikNo;
	long vergiNo;
	@Range(min = 1, max = 81)
	int cityCode;
	int districtCode;
	String personName;
	String gsm;
	String workPhone;
	String email;

	public PartnerTur getPartnerTuru() {
		return this.partnerTuru;
	}

	public void setPartnerTuru(final PartnerTur partnerTuru) {
		this.partnerTuru = partnerTuru;
	}

	public long getTcKimlikNo() {
		return this.tcKimlikNo;
	}

	public void setTcKimlikNo(final long tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public long getVergiNo() {
		return this.vergiNo;
	}

	public void setVergiNo(final long vergiNo) {
		this.vergiNo = vergiNo;
	}

	public int getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(final int cityCode) {
		this.cityCode = cityCode;
	}

	public int getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(final int districtCode) {
		this.districtCode = districtCode;
	}

	public String getPersonName() {
		return this.personName;
	}

	public void setPersonName(final String personName) {
		this.personName = personName;
	}

	public String getGsm() {
		return this.gsm;
	}

	public void setGsm(final String gsm) {
		this.gsm = gsm;
	}

	public String getWorkPhone() {
		return this.workPhone;
	}

	public void setWorkPhone(final String workPhone) {
		this.workPhone = workPhone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

}
