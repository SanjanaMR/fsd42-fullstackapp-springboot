package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;

@Entity
public class Customer {
	
	@Id@GeneratedValue
	private int custId;
	
	@Column(name="customerName", length=20)
	private String custName;
	private String country;
	private String address;
	private String gender;
	private Date dor;
	@Column(name="mobNo", unique=true)
	private String mobNo;
	@Column(name="emailId", unique=true)
	private String emailId;
	private String password;
	private String confirmPassword;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String country, String address, String gender, Date dor, String mobNo,
			String emailId, String password, String confirmPassword) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.country = country;
		this.address = address;
		this.gender = gender;
		this.dor = dor;
		this.mobNo = mobNo;
		this.emailId = emailId;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDor() {
		return dor;
	}
	public void setDor(Date dor) {
		this.dor = dor;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", country=" + country + ", address=" + address
				+ ", gender=" + gender + ", dor=" + dor + ", mobNo=" + mobNo + ", emailId=" + emailId + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}
	
	
	
	
	

}
