package com.poly2.run;

import com.poly2.common.AnimalBarkAble;
import com.poly2.controller.AnimalController;
import com.poly2.model.vo.Cat;
import com.poly2.model.vo.Dog;

public class Main2 {

	public static void main(String[] args) {
		
		//인터페이스도 변수의 자료형으로 사용 가능.
		//자체 생성은 안됨.
//		AnimalBarkAble animal = new AnimalbarkAble; -> error!
		AnimalBarkAble animal;
		
		
//		//인터페이스 참조형변수에는 인터페이스를 구현한 객체 전체
//		animal = new Dog();
//		animal = new Cat();
		
		AnimalController ac = new AnimalController();
		
		ac.bark(new Cat());
		
	}

}
