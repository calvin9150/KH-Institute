package com.poly2.model.vo;

public abstract class Animal {

	private String category;
	private String name;
	private int age;
	private char gender;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public Animal(String category, String name, int age, char gender) {
		super();
		this.category = category;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
	
//	public abstract void bark();	
	
}
