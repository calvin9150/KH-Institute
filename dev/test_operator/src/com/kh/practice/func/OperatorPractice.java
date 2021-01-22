package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수다.");
		} else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void practice2() {
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("양수다.");
		} else if (num==0) {
			System.out.println("0이다.");
		} else {
			System.out.println("음수다.");
		}
	}
	
	public void practice3() {
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다.");
		}
	}
	
	public void practice4() {
		System.out.print("총 인원 수를 적어주세요 : ");
		int peopleNum = sc.nextInt();
		System.out.println("사탕 갯수를 적어주세요 : ");
		int candyNum = sc.nextInt();
		int candyEach = candyNum/peopleNum;
		int candyRemain = candyNum%peopleNum;
		System.out.println("1인당 사탕 개수 : "+candyEach);
		System.out.println("남는 사탕 개수 : "+candyRemain);
	}
	
	public void practice5() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		String genderStr = "";
		if(gender=='M') {
			genderStr = "남학생";
		}  else {
			genderStr = "여학생";
		}
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		
		System.out.print(grade+"학년 "+classNum+"번 "+name+" "+genderStr+"의 ");
		System.out.printf("성적은 %.2f", score);
		System.out.print("이다.");
	}
	
	public void practice6() {
		System.out.print("나이 : ");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("성인입니다.");
		} else if(age>13 && age<=19) {
			System.out.println("청소년입니다.");
		} else {
			System.out.println("어린이입니다.");
		}
	}
	
	public void practice7() {
		System.out.print("국어 : ");
		int lang = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		int sum = lang+eng+math;
		int avg = sum/3;
		String judge = "";
		if(avg>=60&&lang>=40&&eng>=40&&math>=40) {
			judge = "합격";
		} else {
			judge = "불합격";
		}
		System.out.println("합계 : "+sum+"\n"+"평균 : "+avg+"\n"+judge);
	}
	
	public void practice8() {
		System.out.print("주민번호를 입력하세요 : ");
		int id = sc.next().charAt(7);
		if(id%2==0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
	}
	
	public void practice9() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		boolean result = true;
		if(num3<=num1||num3>num2) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
	}
	
	public void practice10() {
		System.out.print("입력 : ");
		int num1 = sc.nextInt();
		System.out.print("입력 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		if(num1==num2&&num1==num3&&num2==num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice11() {
		System.out.print("A사원의 연봉 : ");
		int A = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int B = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int C = sc.nextInt();
		double incenA = A*1.4;
		double incenB = B*1.0;
		double incenC = C*1.15;
		String judgeA;
		
		System.out.println("A사원 연봉/연봉+a : "+A+"/"+incenA);
		if(incenA>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("B사원 연봉/연봉+a : "+B+"/"+incenB);
		if(incenB>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		System.out.println("C사원 연봉/연봉+a : "+C+"/"+incenC);
		if(incenC>=3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
	}
}
