package com.poly2.controller;

import com.poly2.common.AnimalBarkAble;
import com.poly2.model.vo.Cat;
import com.poly2.model.vo.Dog;

public class AnimalController {

	//�� ���α׷��� ����� �������� ¢���ϴ� �޼���
//	public void bark(Dog d) {
//		d.bark();
//	}
//	
//	public void bark(Cat c) {
//		c.bark();
//	}
	
	public void bark(AnimalBarkAble a) {
		a.bark();
	}
	
	
}
