/**
 * @author Mehmet
 *
 * 23 Haz 2018
 *
 * 00:41:36
 */

package tr.com.sbf.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity(name = "insurance")
public class Insurance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "id")
	private long id;

	@Transient
	PartnerSummary partner;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	PolicyType selectedPolicyType;
	ProcessType processType;
	boolean payeeExist;
	String bankaFinans;
	String sube;
	int plakaIl;
	String plakaHarf;
	int plakaSayi;
	int plakaSifirIl;
	String asbisNo;
	String belgeSeri;
	int belgeSeriNo;
	String marka;
	String markaKodu;
	int modelYili;
	String motorNo;
	String saseNo;
	String policeBitisVadesi;
	String referansSigortaSirketi;
	String referansAcenteNo;
	String referansPoliceNo;

	public PartnerSummary getPartner() {
		return this.partner;
	}

	public void setPartner(final PartnerSummary partner) {
		this.partner = partner;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}

	public PolicyType getSelectedPolicyType() {
		return this.selectedPolicyType;
	}

	public void setSelectedPolicyType(final PolicyType selectedPolicyType) {
		this.selectedPolicyType = selectedPolicyType;
	}

	public ProcessType getProcessType() {
		return this.processType;
	}

	public void setProcessType(final ProcessType processType) {
		this.processType = processType;
	}

	public boolean isPayeeExist() {
		return this.payeeExist;
	}

	public void setPayeeExist(final boolean payeeExist) {
		this.payeeExist = payeeExist;
	}

	public String getBankaFinans() {
		return this.bankaFinans;
	}

	public void setBankaFinans(final String bankaFinans) {
		this.bankaFinans = bankaFinans;
	}

	public String getSube() {
		return this.sube;
	}

	public void setSube(final String sube) {
		this.sube = sube;
	}

	public int getPlakaIl() {
		return this.plakaIl;
	}

	public void setPlakaIl(final int plakaIl) {
		this.plakaIl = plakaIl;
	}

	public String getPlakaHarf() {
		return this.plakaHarf;
	}

	public void setPlakaHarf(final String plakaHarf) {
		this.plakaHarf = plakaHarf;
	}

	public int getPlakaSayi() {
		return this.plakaSayi;
	}

	public void setPlakaSayi(final int plakaSayi) {
		this.plakaSayi = plakaSayi;
	}

	public int getPlakaSifirIl() {
		return this.plakaSifirIl;
	}

	public void setPlakaSifirIl(final int plakaSifirIl) {
		this.plakaSifirIl = plakaSifirIl;
	}

	public String getAsbisNo() {
		return this.asbisNo;
	}

	public void setAsbisNo(final String asbisNo) {
		this.asbisNo = asbisNo;
	}

	public String getBelgeSeri() {
		return this.belgeSeri;
	}

	public void setBelgeSeri(final String belgeSeri) {
		this.belgeSeri = belgeSeri;
	}

	public int getBelgeSeriNo() {
		return this.belgeSeriNo;
	}

	public void setBelgeSeriNo(final int belgeSeriNo) {
		this.belgeSeriNo = belgeSeriNo;
	}

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(final String marka) {
		this.marka = marka;
	}

	public String getMarkaKodu() {
		return this.markaKodu;
	}

	public void setMarkaKodu(final String markaKodu) {
		this.markaKodu = markaKodu;
	}

	public int getModelYili() {
		return this.modelYili;
	}

	public void setModelYili(final int modelYili) {
		this.modelYili = modelYili;
	}

	public String getMotorNo() {
		return this.motorNo;
	}

	public void setMotorNo(final String motorNo) {
		this.motorNo = motorNo;
	}

	public String getSaseNo() {
		return this.saseNo;
	}

	public void setSaseNo(final String sasiNo) {
		this.saseNo = sasiNo;
	}

	public String getPoliceBitisVadesi() {
		return this.policeBitisVadesi;
	}

	public void setPoliceBitisVadesi(final String policeBitisVadesi) {
		this.policeBitisVadesi = policeBitisVadesi;
	}

	public String getReferansSigortaSirketi() {
		return this.referansSigortaSirketi;
	}

	public void setReferansSigortaSirketi(final String referansSigortaSirketi) {
		this.referansSigortaSirketi = referansSigortaSirketi;
	}

	public String getReferansAcenteNo() {
		return this.referansAcenteNo;
	}

	public void setReferansAcenteNo(final String referansAcenteNo) {
		this.referansAcenteNo = referansAcenteNo;
	}

	public String getReferansPoliceNo() {
		return this.referansPoliceNo;
	}

	public void setReferansPoliceNo(final String referansPoliceNo) {
		this.referansPoliceNo = referansPoliceNo;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
