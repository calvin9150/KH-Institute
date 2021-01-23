package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
		case 2 :
			System.out.println("수정 메뉴입니다.");
		case 3 :
			System.out.println("조회 메뉴입니다.");
		case 4 :
			System.out.println("삭제 메뉴입니다.");
		case 7 :
			System.out.println("프로그램이 종료됩니다");
		}
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("양수만 입력해주세요.");
		} else if(num/2==0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int lang = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = lang+math+eng;
		double avg = sum/3;
		System.out.println("국어 : "+lang);
		System.out.println("수학 : "+math);
		System.out.println("영어 : "+eng);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		if(avg>=60&&lang>=40&&math>=40&&eng>=40) {
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		String season = "";
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			season = "겨울";
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 3 :
		case 4 :
		case 5 :
			season = ("봄");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			season = ("여름");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		case 9 :
		case 10 :
		case 11 :
			season = ("가을");
			System.out.println(month+"월은 "+season+"입니다.");
			break;
		default :
			System.out.println(month+"은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		String id = "myId";
		String pw = "myPassword12";
		String getId = sc.nextLine();
		String getPw = sc.nextLine();
		if(getId.equals(id)) {
			if(getPw.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		
	}
}
