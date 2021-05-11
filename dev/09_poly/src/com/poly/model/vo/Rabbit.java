package com.poly.model.vo;

public class Rabbit extends Animal {

	public Rabbit() {
		// TODO Auto-generated constructor stub
	}

	public Rabbit(String name, String category, int age, double weight, char gender, String habitat) {
		super(name, category, age, weight, gender, habitat);
		// TODO Auto-generated constructor stub
	}
	
	public void barkRabbit() {
		System.out.println("ªﬂ¿Õª‡");
	}
	
	@Override
	public void bark() {
		barkRabbit();
	}
}
