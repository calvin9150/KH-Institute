package com.objarr.view;

import java.util.Scanner;

import com.objarr.controller.ObjArrController;

public class MainView {

	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		ObjArrController ctrl = new ObjArrController();
		
		while(true) {
			System.out.println("===== ���� ���� ���α׷� =====");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ���� �˻�");
			System.out.println("0. ���α׷� ����");
			System.out.print("���� : ");
			int cho = sc.nextInt();
			switch(cho) {
				case 1 : ctrl.insultCar();
				break;
				case 2 : //ctrl.searchRed();
				break;
				case 0 : System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
	
}
