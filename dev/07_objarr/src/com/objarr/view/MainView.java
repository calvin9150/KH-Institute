package com.objarr.view;

import java.util.Scanner;

import com.objarr.controller.ObjArrController;

public class MainView {

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		ObjArrController ctrl = new ObjArrController();
		
		while(true) {
			System.out.println("===== 차량 관리 프로그램 =====");
			System.out.println("1. 차량 등록");
			System.out.println("2. 적색 차량 검색");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 : ");
			int cho = sc.nextInt();
			switch(cho) {
				case 1 : ctrl.insultCar();
				break;
				case 2 : //ctrl.searchRed();
				break;
				case 0 : System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
}
