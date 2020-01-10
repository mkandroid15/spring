/**
 * @author Mehmet
 *
 *         17 Eyl 2018
 *
 *         15:19:58
 */

package tr.com.sbf.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import tr.com.sbf.common.SbfConstants;
import tr.com.sbf.model.ConsultingType;
import tr.com.sbf.model.Customer;
import tr.com.sbf.model.DangerState;
import tr.com.sbf.model.PartnerSummary;

@Entity(name = "consulting_demand")
public class ConsultingDemand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "id")
	private long id;

	@Transient
	PartnerSummary partner;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	private int osgbHizmet;
	private int osgbDanismanlik;
	private int periyodSaglik;
	private int egitim;
	private ConsultingType consultingType;
	private String subject;
	private String description;
	private String fileguid;
	private DangerState dangerState;
	private int personCount;
	private int naceCode;

	public int getOsgbHizmet() {
		return this.osgbHizmet;
	}

	public void setOsgbHizmet(int osgbHizmet) {
		this.osgbHizmet = osgbHizmet;
	}

	public int getOsgbDanismanlik() {
		return this.osgbDanismanlik;
	}

	public void setOsgbDanismanlik(int osgbDanismanlik) {
		this.osgbDanismanlik = osgbDanismanlik;
	}

	public int getPeriyodSaglik() {
		return this.periyodSaglik;
	}

	public void setPeriyodSaglik(int periyodSaglik) {
		this.periyodSaglik = periyodSaglik;
	}

	public int getEgitim() {
		return this.egitim;
	}

	public void setEgitim(int egitim) {
		this.egitim = egitim;
	}

	public ConsultingType getConsultingType() {
		return this.consultingType;
	}

	public void setConsultingType(ConsultingType consultingType) {
		this.consultingType = consultingType;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFileguid() {
		return this.fileguid;
	}

	public void setFileguid(String fileguid) {
		this.fileguid = fileguid;
	}

	public DangerState getDangerState() {
		return this.dangerState;
	}

	public void setDangerState(DangerState dangerState) {
		this.dangerState = dangerState;
	}

	public int getPersonCount() {
		return this.personCount;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	public int getNaceCode() {
		return this.naceCode;
	}

	public void setNaceCode(int naceCode) {
		this.naceCode = naceCode;
	}

	public PartnerSummary getPartner() {
		return this.partner;
	}

	public void setPartner(PartnerSummary partner) {
		this.partner = partner;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOsgbHizmetDesc() {
		final List<String> list = new ArrayList<String>();
		if (checkBitwaseAnd(this.osgbHizmet, 1)) {
			list.add(SbfConstants.CONSULTING_OSGB_HIZMET_1);
		}
		if (checkBitwaseAnd(this.osgbHizmet, 2)) {
			list.add(SbfConstants.CONSULTING_OSGB_HIZMET_2);
		}
		if (checkBitwaseAnd(this.osgbHizmet, 4)) {
			list.add(SbfConstants.CONSULTING_OSGB_HIZMET_4);
		}
		return String.join(", ", list);
	}

	public String getOsgbDanismanlikDesc() {
		final List<String> list = new ArrayList<String>();
		if (checkBitwaseAnd(this.osgbDanismanlik, 1)) {
			list.add(SbfConstants.CONSULTING_OSGB_DANISMANLIK_1);
		}
		if (checkBitwaseAnd(this.osgbDanismanlik, 2)) {
			list.add(SbfConstants.CONSULTING_OSGB_DANISMANLIK_2);
		}
		if (checkBitwaseAnd(this.osgbDanismanlik, 4)) {
			list.add(SbfConstants.CONSULTING_OSGB_DANISMANLIK_4);
		}
		if (checkBitwaseAnd(this.osgbDanismanlik, 8)) {
			list.add(SbfConstants.CONSULTING_OSGB_DANISMANLIK_8);
		}
		if (checkBitwaseAnd(this.osgbDanismanlik, 16)) {
			list.add(SbfConstants.CONSULTING_OSGB_DANISMANLIK_16);
		}
		return String.join(", ", list);
	}

	public String getPeriyodSaglikDesc() {
		final List<String> list = new ArrayList<String>();
		if (checkBitwaseAnd(this.periyodSaglik, 1)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_1);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 2)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_2);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 4)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_4);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 8)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_8);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 16)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_16);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 32)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_32);
		}
		if (checkBitwaseAnd(this.periyodSaglik, 64)) {
			list.add(SbfConstants.CONSULTING_PERIYOD_SAGLIK_64);
		}
		return String.join(", ", list);
	}

	public String getEgitimDesc() {
		final List<String> list = new ArrayList<String>();
		if (checkBitwaseAnd(this.egitim, 1)) {
			list.add(SbfConstants.CONSULTING_EGITIM_1);
		}
		if (checkBitwaseAnd(this.egitim, 2)) {
			list.add(SbfConstants.CONSULTING_EGITIM_2);
		}
		if (checkBitwaseAnd(this.egitim, 4)) {
			list.add(SbfConstants.CONSULTING_EGITIM_4);
		}
		if (checkBitwaseAnd(this.egitim, 8)) {
			list.add(SbfConstants.CONSULTING_EGITIM_8);
		}
		if (checkBitwaseAnd(this.egitim, 16)) {
			list.add(SbfConstants.CONSULTING_EGITIM_16);
		}
		if (checkBitwaseAnd(this.egitim, 32)) {
			list.add(SbfConstants.CONSULTING_EGITIM_32);
		}
		if (checkBitwaseAnd(this.egitim, 64)) {
			list.add(SbfConstants.CONSULTING_EGITIM_64);
		}
		if (checkBitwaseAnd(this.egitim, 128)) {
			list.add(SbfConstants.CONSULTING_EGITIM_128);
		}
		if (checkBitwaseAnd(this.egitim, 256)) {
			list.add(SbfConstants.CONSULTING_EGITIM_256);
		}
		if (checkBitwaseAnd(this.egitim, 512)) {
			list.add(SbfConstants.CONSULTING_EGITIM_512);
		}
		if (checkBitwaseAnd(this.egitim, 1024)) {
			list.add(SbfConstants.CONSULTING_EGITIM_1024);
		}
		if (checkBitwaseAnd(this.egitim, 2048)) {
			list.add(SbfConstants.CONSULTING_EGITIM_2048);
		}
		if (checkBitwaseAnd(this.egitim, 4096)) {
			list.add(SbfConstants.CONSULTING_EGITIM_4096);
		}
		if (checkBitwaseAnd(this.egitim, 8192)) {
			list.add(SbfConstants.CONSULTING_EGITIM_8192);
		}
		return String.join(", ", list);
	}

	private boolean checkBitwaseAnd(int value, int andValue) {
		return (value & andValue) == andValue;
	}

}
