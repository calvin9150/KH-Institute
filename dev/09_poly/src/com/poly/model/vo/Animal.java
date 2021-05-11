package com.poly.model.vo;

public class Animal {
	private String name;
	private String category;
	private int age;
	private double weight;
	private char gender;
	private String habitat;
	
	public Animal() {}
	
	public Animal(String name, String category, int age, double weight, char gender, String habitat) {
		super();
		this.name = name;
		this.category = category;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void bark() {
		System.out.println("울음소리 구현!");
	}
	
}
