package com.poly.model.vo;

public class Dog extends Animal{

	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String category, int age, double weight, char gender, String habitat) {
		super(name, category, age, weight, gender, habitat);
		// TODO Auto-generated constructor stub
	}
	
	public void barkDog() {
		System.out.println("¿Ð¿Ð¿Ð");
	}
	
	@Override
	public void bark() {
		barkDog();
	}
}
