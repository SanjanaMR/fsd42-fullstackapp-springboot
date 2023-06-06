package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dog {
	@Id
	@GeneratedValue
    private int Id;
	private String age;
	private String dName;
	private String colour;
	private String size;
	private String gender;
	private double price;
	
	public Dog() {
		super();
	}

	public Dog( int Id,String age, String dName, String colour,String size, String gender, double price) {
		super();
		this.Id=Id;
		this.age = age;
		this.dName = dName;
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

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
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
		return "Dog [Id= " + Id + " , age=" + age + ", dName=" + dName + ", colour=" + colour + ", size=" + size + ", gender=" + gender
				+ ", price=" + price + "]";
	}

	
	
}