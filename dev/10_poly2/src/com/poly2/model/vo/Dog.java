package com.poly2.model.vo;

import com.poly2.common.AnimalBarkAble;

public class Dog extends Animal implements AnimalBarkAble{
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String category, String name, int age, char gender) {
		super(category, name, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	public void bark(){
		System.out.println("¸Û¸Û¸Û");
	}


}