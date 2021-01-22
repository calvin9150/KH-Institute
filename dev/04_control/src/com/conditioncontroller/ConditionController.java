package com.conditioncontroller;

import java.util.Scanner;


public class ConditionController {
	Scanner sc = new Scanner(System.in);
	
	public void ifTest() {
		String name = sc.nextLine();
		
		if(name.equals("장원배")) {
			System.out.println("나는 코딩왕이 될거야");
		}
	}
	
	public void ifTest2() {
		System.out.println("국어 점수를 입력해 주세요.");
		int lang = sc.nextInt();
		System.out.println("영어 점수를 입력해 주세요.");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력해 주세요.");
		int math = sc.nextInt();
		int avg = (lang+eng+math)/3;
		if(avg>=60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void ifTest3() {

		System.out.println("정수를 입력하시오.");
		
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
	}
	
	public void ifTest4() {
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("성인입니다.");
		}  else {
			System.out.println("미성년자입니다.");
		}
		
	}
	
	public void ifTest5() {
		System.out.println("나이를 입력하시오.");
		int age = sc.nextInt();
		if(age>=50&&age<60) {
			System.out.println("열일");
		} else if(age>=40 && age<50) {
			System.out.println("열일");
		} else if (age>=30 && age<40) {
			System.out.println("열일");
		} else if (age>=20 && age<30) {
			System.out.println("열공");
		} else if (age<20) {
			System.out.println("열공");
		} else {
			System.out.println("인생?");
		}	
	}
	
	public void ifTest6() {
		System.out.print("ID를 입력하시오: ");
		String id = sc.nextLine();
		System.out.print("패스워드를 입력하시오: ");
		String pw = sc.nextLine();
		if(id.equals("user01")) {
			if(pw.equals("user01")) {
				System.out.print("로그인 되었습니다.");
			} else {
				System.out.print("패스워드가 틀렸습니다.");
			}
		} else if(!pw.equals("user01")) {
			System.out.print("ID와 패스워드 모두 틀렸습니다.");
		} else {
			System.out.print("잘못된 ID입니다.");
		}
	}
	
	public void switchTest() {
		System.out.println("@오늘의 저녁 메뉴@");
		System.out.println("1.카레");
		System.out.println("2.짬뽕");
		System.out.println("3.제육");
		System.out.println("4.부대찌개");
		System.out.print("입력 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
			case 1 : System.out.println("3분카레~");
				break;
			case 2 : System.out.println("짬뽕 맛있어");
				break;
			case 3 : System.out.println("제육 좋아");
				break;
			case 4 : System.out.println("부대끼게 부대찌개");
				break;
			default : System.out.println("그런 메뉴 없어요.");
		}
	}
	
	public void switchTest2() {
		System.out.println("@후식@");
		System.out.println("가.커피 나.사탕 다.콜라");
		char choice = sc.next().charAt(0);
		switch(choice) {
		case '가' : System.out.println("커피마셔");
			break;
		case '나' : System.out.println("사탕먹어");
			break;
		case '다' : System.out.println("콜라마셔어");
			break;
		}
	}
}
