package com.vaccine.vo;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 4355541784491742801L;
	private String name;
	private int age;
	private String gender;
	private String vaccination;
	
	public Person() {}

	public Person(String name, int age, String gender, String vaccination) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.vaccination = vaccination;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getvaccination() {
		return vaccination;
	}

	public void setvaccination(String vaccination) {
		this.vaccination = vaccination;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", vaccination=" + vaccination + "]";
	}
	
	
	
}
