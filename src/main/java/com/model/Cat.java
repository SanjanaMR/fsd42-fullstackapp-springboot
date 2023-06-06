package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Cat {
	@Id@GeneratedValue
	private int Id;
	private String age;
	private String cName;
	private String colour;
	private String size;
	private String gender;
	private double price;
	
	public Cat() {
		super();
	}

	public Cat( int Id,String age, String cName, String colour,String size, String gender, double price) {
		super();
		this.Id=Id;
		this.age = age;
		this.cName = cName;
		this.colour=colour;
		this.size=size;
		this.size=size;
		this.gender=gender;
		this.price = price;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Cat [Id= " + Id + " , age=" + age + ", cName=" + cName + ", colour=" + colour + ", size=" + size + ", gender=" + gender
				+ ", price=" + price + "]";
	}


}
