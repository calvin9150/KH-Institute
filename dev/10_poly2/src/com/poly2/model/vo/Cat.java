package com.poly2.model.vo;

import com.poly2.common.AnimalBarkAble;

public class Cat extends Animal implements AnimalBarkAble{
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	public Cat(String category, String name, int age, char gender) {
		super(category, name, age, gender);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void bark(){
		System.out.println("¾ß¿Ë");
	}



		

}
