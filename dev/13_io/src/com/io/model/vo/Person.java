package com.io.model.vo;

import java.io.Serializable;
//Á÷·ÄÈ­
public class Person implements Serializable{
	

	private static final long serialVersionUID = -1446892394112895351L;
	private String name;
	private int age;
	private char gender;
	private double height;
	
	public Person() {}

	public Person(String name, int age, char gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//alt s s s enter
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", height=" + height + "]";
	}
	
	
}
