package com.repeat.controller;

import java.util.Scanner;

public class RepeatController {

	Scanner sc = new Scanner(System.in);
	
	public void basicFor() {
		//기본  for문 이용하기
		for(int i=1; i<=9; i++) {
			System.out.println("야호");
		}
	}
	
	public void basicFor2() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void basicFor3() {
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void basicFor4() {
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public void basicFor5() {
		int temp = 0;
		for(int i=0; i<=100; i++) {
			int result = i+temp;
			temp = result;
			if(i==100) {
				System.out.println(result);
			}
		}
	}

	public void basicFor6() {
		for(int i=0; i<=5; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println(name+age+grade);
		}
	}
	//무한루프+종료명령어
	public void basicFor7() {
		String end = "";
		for(;!end.equals("종료");) {
			System.out.println(end);
			end  = sc.next();
		}
	}
	
	public void extraFor() {
		System.out.print("학생 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i =1; i<=num; i++) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println(name+age+grade);
		}
	}
	
	public void extraFor2() {
		System.out.print("학생 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		int avg = 0;
		for(int i =1; i<=num; i++) {
			System.out.print("국어 : ");
			int lang = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			sum += lang+eng+math;
			avg = sum/3/i;
			System.out.println("총 합계 : "+sum+"\n"+"총 평균 : "+avg+"\n");
		}
	}
	
	public void calculator() {
		System.out.println("계산을 반복할 횟수 : ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++ ) {
			System.out.print("첫번째 숫자 : ");
			int x = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			int y = sc.nextInt();
			System.out.print("연산자(+,-,*,/,%)를 입력 : ");
	        char operator = sc.next().charAt(0);
	        switch(operator) {
		    	case '+' :
		    		System.out.println(x+y);
		    		break;
		    	case '-' :
		    	System.out.println(x-y);
		    		break;
		    	case '*' :
		    		System.out.println(x*y);
		    		break;
		    	case '/' :
		    		System.out.println(x/y);
		    		break;
		    	case '%' :
		    		System.out.println(x%y);
		    		break;
		    	default :
		    		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		    }
		}
	}
	
	public void basicWhile() {
		String num="";
		while(!num.equals("0")) {
			num=sc.nextLine();
			System.out.println(num);
		}
	}
	
	public void calculator2() {
		String num = "";
		while(!num.equals("N")) {
			System.out.print("첫번째 숫자 : ");
			int x = sc.nextInt();
			System.out.print("두번째 숫자 : ");
			int y = sc.nextInt();
			System.out.print("연산자(+,-,*,/,%)를 입력 : ");
	        char operator = sc.next().charAt(0);
	        switch(operator) {
		    	case '+' :
		    		System.out.println(x+y);
		    		break;
		    	case '-' :
		    	System.out.println(x-y);
		    		break;
		    	case '*' :
		    		System.out.println(x*y);
		    		break;
		    	case '/' :
		    		System.out.println(x/y);
		    		break;
		    	case '%' :
		    		System.out.println(x%y);
		    		break;
		    	default :
		    		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		    }
	        System.out.println("계속 하시겠습니까? (Y/N)");
			sc.nextLine();
	        num = sc.nextLine();
		}
	}
	
	public void menuNOT() {
		boolean a = false;
		int pick = 0;
		do {
			System.out.println("메뉴를 골라주세요..  1. 김밥 / 2. 라면 / 3. 떡볶이 / 4. 순대 / 0. 종료");
			pick = sc.nextInt();
			switch(pick) {
			case 1 :
				
			}
		} while(pick==0);
			System.out.println("");
	}
	
	public void extraFor3() {
		
	}
}
