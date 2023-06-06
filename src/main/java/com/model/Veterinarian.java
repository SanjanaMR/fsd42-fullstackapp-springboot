package com.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veterinarian {
	@Id@GeneratedValue
    private int Id;
	private String petType ;
	private String petBreed;
	private String petGender ;
	private String petAge ;
	private Date appointmentDate;
	private String mailAdd;
	public Veterinarian() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Veterinarian(int id, String petType, String petBreed, String petGender, String petAge, Date appointmentDate,
			String mailAdd) {
		super();
		Id = id;
		this.petType = petType;
		this.petBreed = petBreed;
		this.petGender = petGender;
		this.petAge = petAge;
		this.appointmentDate = appointmentDate;
		this.mailAdd = mailAdd;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPetType() {
		return petType;
	}
	public void setPetType(String petType) {
		this.petType = petType;
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
	public String getPetAge() {
		return petAge;
	}
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getMailAdd() {
		return mailAdd;
	}
	public void setMailAdd(String mailAdd) {
		this.mailAdd = mailAdd;
	}
	@Override
	public String toString() {
		return "Veterinarian [Id=" + Id + ", petType=" + petType + ", petBreed=" + petBreed + ", petGender=" + petGender
				+ ", petAge=" + petAge + ", appointmentDate=" + appointmentDate + ", mailAdd=" + mailAdd + "]";
	}
	
	
	


}