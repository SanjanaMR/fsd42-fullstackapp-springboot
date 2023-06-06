package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PetCare {
	
	@Id@GeneratedValue
    private int petId;
	
	private String ownerName;
	
	@Column(name = "ownerMail", unique = true)
	private String ownerMail;
	
	@Column(name = "mobNo", unique = true)
	private String mobNo;
	private String petType;
	private Date dor;
	private String petAge;
	private String petBreed;
	private String petGender;
	private int days;
	public PetCare() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetCare(int petId, String ownerName, String ownerMail, String mobNo, String petType, Date dor, String petAge,
			String petBreed, String petGender, int days) {
		super();
		this.petId = petId;
		this.ownerName = ownerName;
		this.ownerMail = ownerMail;
		this.mobNo = mobNo;
		this.petType = petType;
		this.dor = dor;
		this.petAge = petAge;
		this.petBreed = petBreed;
		this.petGender = petGender;
		this.days = days;
	}
	public int getPetId() {
		return petId;
	}
	public void setPetId(int petId) {
		this.petId = petId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerMail() {
		return ownerMail;
	}
	public void setOwnerMail(String ownerMail) {
		this.ownerMail = ownerMail;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
	}
	public Date getDor() {
		return dor;
	}
	public void setDor(Date dor) {
		this.dor = dor;
	}
	public String getPetAge() {
		return petAge;
	}
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	public String getPetBreed() {
		return petBreed;
	}
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}
	public String getPetGender() {
		return petGender;
	}
	public void setPetGender(String petGender) {
		this.petGender = petGender;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "PetCare [petId=" + petId + ", ownerName=" + ownerName + ", ownerMail=" + ownerMail + ", mobNo=" + mobNo
				+ ", petType=" + petType + ", dor=" + dor + ", petAge=" + petAge + ", petBreed=" + petBreed
				+ ", petGender=" + petGender + ", days=" + days + "]";
	}
	
	
	

}