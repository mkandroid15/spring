/**
 * @author Mehmet
 *
 * 3 Nis 2018
 *
 * 22:49:01
 */

package tr.com.sbf.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//@Table(name = "user")
@Entity(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "id")
	private Long id;

	@NotNull
	@Size(min = 6, max = 10, message = "en az 6 karakter olmalı")
	private String username;

	@NotNull
	@Size(min = 6, message = "an az 6 karakter olmalı")
	private String password;

	@Transient
	@NotNull
	@Size(min = 6, message = "an az 6 karakter olmalı")
	private String passwordConfirm;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "user_roles", joinColumns = {
			@JoinColumn(name = "user_id", referencedColumnName = "id") }, inverseJoinColumns = {
					@JoinColumn(name = "role_id", referencedColumnName = "id") })
	private Role role;

	@Size(max = 20, message = "sınırı aştınız")
	String adSoyad;

	@Size(max = 30, message = "sınırı aştınız")
	String email;

	@Size(max = 15, message = "sınırı aştınız")
	String gsm;

	@Size(max = 15, message = "sınırı aştınız")
	String isTelefon;

	long tcKimlikNo;
	@Size(max = 20, message = "sınırı aştınız")
	String unvan;

	long vergiNo;

	PartnerTur partnerTuru;

	Jobs meslekTuru;

	@Size(max = 20, message = "sınırı aştınız")
	String meslek;

	@Min(1)
	@Max(81)
	int cityCode;

	@Min(1000)
	@Max(3000)
	int districtCode;

	int partajNo;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Transient
	public String getPasswordConfirm() {
		return this.passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getAdSoyad() {
		return this.adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGsm() {
		return this.gsm;
	}

	public void setGsm(String gsm) {
		this.gsm = gsm;
	}

	public String getIsTelefon() {
		return this.isTelefon;
	}

	public void setIsTelefon(String isTelefon) {
		this.isTelefon = isTelefon;
	}

	public long getTcKimlikNo() {
		return this.tcKimlikNo;
	}

	public void setTcKimlikNo(long tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getUnvan() {
		return this.unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public long getVergiNo() {
		return this.vergiNo;
	}

	public void setVergiNo(long vergiNo) {
		this.vergiNo = vergiNo;
	}

	public PartnerTur getPartnerTuru() {
		return this.partnerTuru;
	}

	public void setPartnerTuru(PartnerTur partnerTuru) {
		this.partnerTuru = partnerTuru;
	}

	public Jobs getMeslekTuru() {
		return this.meslekTuru;
	}

	public void setMeslekTuru(Jobs meslekTuru) {
		this.meslekTuru = meslekTuru;
	}

	public String getMeslek() {
		return this.meslek;
	}

	public void setMeslek(String meslek) {
		this.meslek = meslek;
	}

	public int getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}

	public int getDistrictCode() {
		return this.districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public int getPartajNo() {
		return this.partajNo;
	}

	public void setPartajNo(int partajNo) {
		this.partajNo = partajNo;
	}

}
