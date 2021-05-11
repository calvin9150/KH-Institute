package com.poly.run;

import com.poly.controller.AnimalFunction;
import com.poly.model.vo.Animal;
import com.poly.model.vo.Cat;
import com.poly.model.vo.Dog;
import com.poly.model.vo.Rabbit;

public class Main {

	public static void main(String[] args) {
		//�������� ��Ӱ��迡 �ִ� ��ü�鿡 ����Ǵ� ���
		// ��Ӱ��迡 �ִ� ��ü �� �θ�Ŭ���� Ÿ�ԟ� ������ �ڽİ�ü�� ������ �� ������ �ǹ�.
		
		Animal a1 = new Animal();
		Animal a2 = new Dog(); //-> �ڷ����� �޶� ������ error, ������ ������ �����Ͽ��� ����.
		
		
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
// �������ε� �����ϸ� �Ʒ� �ڵ�
		for(int i=0; i<animals.length;i++) {
			animals[i].bark();
		}
		
		System.out.println("���� : " + dogCount);
		System.out.println("����̴� : " + catCount);
		System.out.println("�䳢�� : " + rabbitCount);
		

		
	}
	

}
