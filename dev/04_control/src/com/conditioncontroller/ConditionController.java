package com.conditioncontroller;

import java.util.Scanner;


public class ConditionController {
	Scanner sc = new Scanner(System.in);
	
	public void ifTest() {
		String name = sc.nextLine();
		
		if(name.equals("�����")) {
			System.out.println("���� �ڵ����� �ɰž�");
		}
	}
	
	public void ifTest2() {
		System.out.println("���� ������ �Է��� �ּ���.");
		int lang = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���.");
		int eng = sc.nextInt();
		System.out.println("���� ������ �Է��� �ּ���.");
		int math = sc.nextInt();
		int avg = (lang+eng+math)/3;
		if(avg>=60) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void ifTest3() {

		System.out.println("������ �Է��Ͻÿ�.");
		
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("���");
		} else {
			System.out.println("����");
		}
		
	}
	
	public void ifTest4() {
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("�����Դϴ�.");
		}  else {
			System.out.println("�̼������Դϴ�.");
		}
		
	}
	
	public void ifTest5() {
		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = sc.nextInt();
		if(age>=50&&age<60) {
			System.out.println("����");
		} else if(age>=40 && age<50) {
			System.out.println("����");
		} else if (age>=30 && age<40) {
			System.out.println("����");
		} else if (age>=20 && age<30) {
			System.out.println("����");
		} else if (age<20) {
			System.out.println("����");
		} else {
			System.out.println("�λ�?");
		}	
	}
	
	public void ifTest6() {
		System.out.print("ID�� �Է��Ͻÿ�: ");
		String id = sc.nextLine();
		System.out.print("�н����带 �Է��Ͻÿ�: ");
		String pw = sc.nextLine();
		if(id.equals("user01")) {
			if(pw.equals("user01")) {
				System.out.print("�α��� �Ǿ����ϴ�.");
			} else {
				System.out.print("�н����尡 Ʋ�Ƚ��ϴ�.");
			}
		} else if(!pw.equals("user01")) {
			System.out.print("ID�� �н����� ��� Ʋ�Ƚ��ϴ�.");
		} else {
			System.out.print("�߸��� ID�Դϴ�.");
		}
	}
	
	public void switchTest() {
		System.out.println("@������ ���� �޴�@");
		System.out.println("1.ī��");
		System.out.println("2.«��");
		System.out.println("3.����");
		System.out.println("4.�δ��");
		System.out.print("�Է� : ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 : System.out.println("3��ī��~");
				break;
			case 2 : System.out.println("«�� ���־�");
				break;
			case 3 : System.out.println("���� ����");
				break;
			case 4 : System.out.println("�δ볢�� �δ��");
				break;
			default : System.out.println("�׷� �޴� �����.");
		}
	}
	
	public void switchTest2() {
		System.out.println("@�Ľ�@");
		System.out.println("��.Ŀ�� ��.���� ��.�ݶ�");
		char choice = sc.next().charAt(0);
		switch(choice) {
		case '��' : System.out.println("Ŀ�Ǹ���");
			break;
		case '��' : System.out.println("�����Ծ�");
			break;
		case '��' : System.out.println("�ݶ󸶼ž�");
			break;
		}
	}
}
