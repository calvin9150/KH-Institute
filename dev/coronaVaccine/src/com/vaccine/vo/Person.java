package com.vaccine.vo;

import java.io.Serializable;

public class Person implements Serializable{

	private static final long serialVersionUID = 4355541784491742801L;
	private String name;
	private int age;
	private String gender;
	private String shot;
	
	public Person() {}

	public Person(String name, int age, String gender, String shot) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.shot = shot;
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

	public String getShot() {
		return shot;
	}

	public void setShot(String shot) {
		this.shot = shot;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", shot=" + shot + "]";
	}
	
	
	
}
