package com.objarr.controller;

import java.util.Scanner;

import com.objarr.model.vo.Car;
import com.objarr.model.vo.Fruit;
import com.objarr.view.MainView;

public class ObjArrController {

	private MainView view = new MainView();
	
	public void objArrTest() {
		//과일 객체를 저장할 변수 선언
		Fruit apple = new Fruit("사과", "충주", 23000, 2.3, "특상");
		// 과일 객체를 여러개 저장할 수 있는 저장공간 확보
		//과일 객체 선언
		Fruit[] fruits = new Fruit[5];

		//객체배열 이용
		fruits[0] = new Fruit("딸기", "논산", 8000, 0.5, "특상");
		fruits[1] = new Fruit("키위", "뉴질랜드", 15000, 1, "상");
		fruits[2] = new Fruit("배", "나주", 25000, 3.5, "특상");
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
		
		//과일을 입력받아 배열에 채우기
		Fruit[] fs = new Fruit[2];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<fs.length; i++) {
			System.out.print("이름 : ");
			fs[i] = new Fruit();
			fs[i].setName(sc.next());
			System.out.print("원산지 : ");
			fs[i].setOrigin(sc.next());
			System.out.print("가격 : ");
			fs[i].setPrice(sc.nextInt());
			System.out.print("무게 : ");
			fs[i].setWeight(sc.nextDouble());
			System.out.print("등급 : ");
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
			System.out.print("모델명 : ");
			cars[i].setModel(sc.nextLine());
			System.out.print("탑승인원 : ");
			cars[i].setSeat(sc.nextInt());
			System.out.print("제조사 : ");
			sc.nextLine();
			cars[i].setCompany(sc.nextLine());
			System.out.print("가격 : ");
			cars[i].setPrice(sc.nextInt());
			System.out.print("색상 : ");
			cars[i].setColor(sc.next());
			sc.nextLine();
		}
	}
	
	public void mainView(){
		view.mainMenu();
	}
	
}
