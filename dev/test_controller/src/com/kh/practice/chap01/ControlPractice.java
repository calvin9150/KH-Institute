package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("�Է� �޴��Դϴ�.");
		case 2 :
			System.out.println("���� �޴��Դϴ�.");
		case 3 :
			System.out.println("��ȸ �޴��Դϴ�.");
		case 4 :
			System.out.println("���� �޴��Դϴ�.");
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�");
		}
	}
	
	public void practice2() {
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("����� �Է����ּ���.");
		} else if(num/2==0) {
			System.out.println("¦����.");
		} else {
			System.out.println("Ȧ����.");
		}
	}
	
	public void practice3() {
		System.out.print("�������� : ");
		int lang = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		int sum = lang+math+eng;
		double avg = sum/3;
		System.out.println("���� : "+lang);
		System.out.println("���� : "+math);
		System.out.println("���� : "+eng);
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avg);
		if(avg>=60&&lang>=40&&math>=40&&eng>=40) {
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		String season = "";
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			season = "�ܿ�";
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 3 :
		case 4 :
		case 5 :
			season = ("��");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 6 :
		case 7 :
		case 8 :
			season = ("����");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		case 9 :
		case 10 :
		case 11 :
			season = ("����");
			System.out.println(month+"���� "+season+"�Դϴ�.");
			break;
		default :
			System.out.println(month+"�� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";
		String getId = sc.nextLine();
		String getPw = sc.nextLine();
		if(getId.equals(id)) {
			if(getPw.equals(pw)) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice6() {
		
	}
}
