package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Car;
import com.objarr.model.vo.Fruit;
import com.objarr.view.MainView;

public class ObjArrController {

	private MainView view = new MainView();
	
	public void objArrTest() {
		//���� ��ü�� ������ ���� ����
		Fruit apple = new Fruit("���", "����", 23000, 2.3, "Ư��");
		// ���� ��ü�� ������ ������ �� �ִ� ������� Ȯ��
		//���� ��ü ����
		Fruit[] fruits = new Fruit[5];

		//��ü�迭 �̿�
		fruits[0] = new Fruit("����", "���", 8000, 0.5, "Ư��");
		fruits[1] = new Fruit("Ű��", "��������", 15000, 1, "��");
		fruits[2] = new Fruit("��", "����", 25000, 3.5, "Ư��");
		fruits[3] = new Fruit();
		fruits[4] = new Fruit();
		
		for(int i=0; i<fruits.length; i++) {
			//if(fruits[i]!=null){}
			System.out.println(fruits[i].getName()+
					fruits[i].getOrigin()+
					fruits[i].getPrice()+
					fruits[i].getWeight()+
					fruits[i].getRating()
					);
		}
		
		//������ �Է¹޾� �迭�� ä���
		Fruit[] fs = new Fruit[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<fs.length; i++) {
			System.out.print("�̸� : ");
			fs[i] = new Fruit();
			fs[i].setName(sc.next());
			System.out.print("������ : ");
			fs[i].setOrigin(sc.next());
			System.out.print("���� : ");
			fs[i].setPrice(sc.nextInt());
			System.out.print("���� : ");
			fs[i].setWeight(sc.nextDouble());
			System.out.print("��� : ");
			fs[i].setRating(sc.next());
		}
		
		for(int i=0; i<fs.length;i++) {
			System.out.println(fs[i].getName()+
					fs[i].getOrigin()+
					fs[i].getPrice()+
					fs[i].getWeight()+
					fs[i].getRating());
		}
		
		System.out.println(fruits[0].getName()); 
		System.out.println(fruits[0].getOrigin()); 
		
	}
	
	public void insultCar() {
		
		Scanner sc = new Scanner(System.in);
		Car[] cars = new Car[2];
		for(int i=0; i<cars.length; i++) {
			cars[i] = new Car();
			System.out.print("�𵨸� : ");
			cars[i].setModel(sc.nextLine());
			System.out.print("ž���ο� : ");
			cars[i].setSeat(sc.nextInt());
			System.out.print("������ : ");
			sc.nextLine();
			cars[i].setCompany(sc.nextLine());
			System.out.print("���� : ");
			cars[i].setPrice(sc.nextInt());
			System.out.print("���� : ");
			cars[i].setColor(sc.next());
			sc.nextLine();
		}
	}
	
	public void mainView(){
		view.mainMenu();
	}
	
}
