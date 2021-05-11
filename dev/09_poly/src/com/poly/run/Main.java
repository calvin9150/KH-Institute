package com.poly.run;

import com.poly.controller.AnimalFunction;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Dog;
import com.poly.model.vo.Rabbit;

public class Main {

	public static void main(String[] args) {
		//다형성은 상속관계에 있는 객체들에 적용되는 기술
		// 상속관계에 있는 객체 중 부모클래스 타입읩 변수는 자식객체를 저장할 수 있음을 의미.
		
		Animal a1 = new Animal();
		Animal a2 = new Dog(); //-> 자료형이 달라서 원래는 error, 하지만 다형성 적용하여서 가능.
		
		
		a2 = new Cat();
		((Cat)a2).barkCat();
		
		a2 = new Rabbit();
		((Rabbit)a2).barkRabbit();
		
		AnimalFunction af = new AnimalFunction();
		
		af.bark(new Cat());
		af.bark(new Dog());
		
		Animal[] animals = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Rabbit();
		animals[3] = new Dog();
		animals[4] = new Dog();
		
		int dogCount = 0;
		int catCount = 0;
		int rabbitCount = 0;
		int mouseCount = 0;
		
//		for(int i=0; i<animals.length; i++) {
//			if(animals[i] instanceof Dog) {
//				dogCount++;
//				((Dog)animals[i]).barkDog();
//			} else if (animals[i] instanceof Cat) {
//				catCount++;
//				((Cat)animals[i]).barkCat();
//			} else if (animals[i] instanceof Rabbit) {
//				rabbitCount++;
//				((Rabbit)animals[i]).barkRabbit();
//			}
//		}
// 동적바인딩 적용하면 아래 코드
		for(int i=0; i<animals.length;i++) {
			animals[i].bark();
		}
		
		System.out.println("개는 : " + dogCount);
		System.out.println("고양이는 : " + catCount);
		System.out.println("토끼는 : " + rabbitCount);
		

		
	}
	

}
