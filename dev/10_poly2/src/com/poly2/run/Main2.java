package com.poly2.run;

import com.poly2.common.AnimalBarkAble;
import com.poly2.controller.AnimalController;
import com.poly2.model.vo.Cat;
import com.poly2.model.vo.Dog;

public class Main2 {

	public static void main(String[] args) {
		
		//�������̽��� ������ �ڷ������� ��� ����.
		//��ü ������ �ȵ�.
//		AnimalBarkAble animal = new AnimalbarkAble; -> error!
		AnimalBarkAble animal;
		
		
//		//�������̽� �������������� �������̽��� ������ ��ü ��ü
//		animal = new Dog();
//		animal = new Cat();
		
		AnimalController ac = new AnimalController();
		
		ac.bark(new Cat());
		
	}

}
