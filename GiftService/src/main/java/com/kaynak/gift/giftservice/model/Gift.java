package com.kaynak.gift.giftservice.model;

public class Gift {

	String company;
	double amount;
	
	byte expireYear;
	byte expireMonth;
	byte expireDay;
	
	String expireDate;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public byte getExpireYear() {
		return expireYear;
	}
	public void setExpireYear(byte expireYear) {
		this.expireYear = expireYear;
	}
	public byte getExpireMonth() {
		return expireMonth;
	}
	public void setExpireMonth(byte expireMonth) {
		this.expireMonth = expireMonth;
	}
	public byte getExpireDay() {
		return expireDay;
	}
	public void setExpireDay(byte expireDay) {
		this.expireDay = expireDay;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	
	
}
