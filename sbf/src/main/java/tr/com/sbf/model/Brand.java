/**
 * @author Mehmet
 *
 * 23 Tem 2018
 *
 * 21:37:39
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

@Entity(name = "brand")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "id")
	private long id;

	@Transient
	PartnerSummary partner;
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;

	private String name;

	private double fee;
	private double service;
	private double total;

	private boolean class_1;
	private boolean class_2;
	private boolean class_3;
	private boolean class_4;
	private boolean class_5;
	private boolean class_6;
	private boolean class_7;
	private boolean class_8;
	private boolean class_9;
	private boolean class_10;
	private boolean class_11;
	private boolean class_12;
	private boolean class_13;
	private boolean class_14;
	private boolean class_15;
	private boolean class_16;
	private boolean class_17;
	private boolean class_18;
	private boolean class_19;
	private boolean class_20;
	private boolean class_21;
	private boolean class_22;
	private boolean class_23;
	private boolean class_24;
	private boolean class_25;
	private boolean class_26;
	private boolean class_27;
	private boolean class_28;
	private boolean class_29;
	private boolean class_30;
	private boolean class_31;
	private boolean class_32;
	private boolean class_33;
	private boolean class_34;
	private boolean class_35;
	private boolean class_36;
	private boolean class_37;
	private boolean class_38;
	private boolean class_39;
	private boolean class_40;
	private boolean class_41;
	private boolean class_42;
	private boolean class_43;
	private boolean class_44;
	private boolean class_45;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isClass_1() {
		return this.class_1;
	}

	public void setClass_1(boolean class_1) {
		this.class_1 = class_1;
	}

	public boolean isClass_2() {
		return this.class_2;
	}

	public void setClass_2(boolean class_2) {
		this.class_2 = class_2;
	}

	public boolean isClass_3() {
		return this.class_3;
	}

	public void setClass_3(boolean class_3) {
		this.class_3 = class_3;
	}

	public boolean isClass_4() {
		return this.class_4;
	}

	public void setClass_4(boolean class_4) {
		this.class_4 = class_4;
	}

	public boolean isClass_5() {
		return this.class_5;
	}

	public void setClass_5(boolean class_5) {
		this.class_5 = class_5;
	}

	public boolean isClass_6() {
		return this.class_6;
	}

	public void setClass_6(boolean class_6) {
		this.class_6 = class_6;
	}

	public boolean isClass_7() {
		return this.class_7;
	}

	public void setClass_7(boolean class_7) {
		this.class_7 = class_7;
	}

	public boolean isClass_8() {
		return this.class_8;
	}

	public void setClass_8(boolean class_8) {
		this.class_8 = class_8;
	}

	public boolean isClass_9() {
		return this.class_9;
	}

	public void setClass_9(boolean class_9) {
		this.class_9 = class_9;
	}

	public boolean isClass_10() {
		return this.class_10;
	}

	public void setClass_10(boolean class_10) {
		this.class_10 = class_10;
	}

	public boolean isClass_11() {
		return this.class_11;
	}

	public void setClass_11(boolean class_11) {
		this.class_11 = class_11;
	}

	public boolean isClass_12() {
		return this.class_12;
	}

	public void setClass_12(boolean class_12) {
		this.class_12 = class_12;
	}

	public boolean isClass_13() {
		return this.class_13;
	}

	public void setClass_13(boolean class_13) {
		this.class_13 = class_13;
	}

	public boolean isClass_14() {
		return this.class_14;
	}

	public void setClass_14(boolean class_14) {
		this.class_14 = class_14;
	}

	public boolean isClass_15() {
		return this.class_15;
	}

	public void setClass_15(boolean class_15) {
		this.class_15 = class_15;
	}

	public boolean isClass_16() {
		return this.class_16;
	}

	public void setClass_16(boolean class_16) {
		this.class_16 = class_16;
	}

	public boolean isClass_17() {
		return this.class_17;
	}

	public void setClass_17(boolean class_17) {
		this.class_17 = class_17;
	}

	public boolean isClass_18() {
		return this.class_18;
	}

	public void setClass_18(boolean class_18) {
		this.class_18 = class_18;
	}

	public boolean isClass_19() {
		return this.class_19;
	}

	public void setClass_19(boolean class_19) {
		this.class_19 = class_19;
	}

	public boolean isClass_20() {
		return this.class_20;
	}

	public void setClass_20(boolean class_20) {
		this.class_20 = class_20;
	}

	public boolean isClass_21() {
		return this.class_21;
	}

	public void setClass_21(boolean class_21) {
		this.class_21 = class_21;
	}

	public boolean isClass_22() {
		return this.class_22;
	}

	public void setClass_22(boolean class_22) {
		this.class_22 = class_22;
	}

	public boolean isClass_23() {
		return this.class_23;
	}

	public void setClass_23(boolean class_23) {
		this.class_23 = class_23;
	}

	public boolean isClass_24() {
		return this.class_24;
	}

	public void setClass_24(boolean class_24) {
		this.class_24 = class_24;
	}

	public boolean isClass_25() {
		return this.class_25;
	}

	public void setClass_25(boolean class_25) {
		this.class_25 = class_25;
	}

	public boolean isClass_26() {
		return this.class_26;
	}

	public void setClass_26(boolean class_26) {
		this.class_26 = class_26;
	}

	public boolean isClass_27() {
		return this.class_27;
	}

	public void setClass_27(boolean class_27) {
		this.class_27 = class_27;
	}

	public boolean isClass_28() {
		return this.class_28;
	}

	public void setClass_28(boolean class_28) {
		this.class_28 = class_28;
	}

	public boolean isClass_29() {
		return this.class_29;
	}

	public void setClass_29(boolean class_29) {
		this.class_29 = class_29;
	}

	public boolean isClass_30() {
		return this.class_30;
	}

	public void setClass_30(boolean class_30) {
		this.class_30 = class_30;
	}

	public boolean isClass_31() {
		return this.class_31;
	}

	public void setClass_31(boolean class_31) {
		this.class_31 = class_31;
	}

	public boolean isClass_32() {
		return this.class_32;
	}

	public void setClass_32(boolean class_32) {
		this.class_32 = class_32;
	}

	public boolean isClass_33() {
		return this.class_33;
	}

	public void setClass_33(boolean class_33) {
		this.class_33 = class_33;
	}

	public boolean isClass_34() {
		return this.class_34;
	}

	public void setClass_34(boolean class_34) {
		this.class_34 = class_34;
	}

	public boolean isClass_35() {
		return this.class_35;
	}

	public void setClass_35(boolean class_35) {
		this.class_35 = class_35;
	}

	public boolean isClass_36() {
		return this.class_36;
	}

	public void setClass_36(boolean class_36) {
		this.class_36 = class_36;
	}

	public boolean isClass_37() {
		return this.class_37;
	}

	public void setClass_37(boolean class_37) {
		this.class_37 = class_37;
	}

	public boolean isClass_38() {
		return this.class_38;
	}

	public void setClass_38(boolean class_38) {
		this.class_38 = class_38;
	}

	public boolean isClass_39() {
		return this.class_39;
	}

	public void setClass_39(boolean class_39) {
		this.class_39 = class_39;
	}

	public boolean isClass_40() {
		return this.class_40;
	}

	public void setClass_40(boolean class_40) {
		this.class_40 = class_40;
	}

	public boolean isClass_41() {
		return this.class_41;
	}

	public void setClass_41(boolean class_41) {
		this.class_41 = class_41;
	}

	public boolean isClass_42() {
		return this.class_42;
	}

	public void setClass_42(boolean class_42) {
		this.class_42 = class_42;
	}

	public boolean isClass_43() {
		return this.class_43;
	}

	public void setClass_43(boolean class_43) {
		this.class_43 = class_43;
	}

	public boolean isClass_44() {
		return this.class_44;
	}

	public void setClass_44(boolean class_44) {
		this.class_44 = class_44;
	}

	public boolean isClass_45() {
		return this.class_45;
	}

	public void setClass_45(boolean class_45) {
		this.class_45 = class_45;
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	public double getFee() {
		return this.fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getService() {
		return this.service;
	}

	public void setService(double service) {
		this.service = service;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
