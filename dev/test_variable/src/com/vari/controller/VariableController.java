package com.vari.controller;

import java.util.Scanner; 

public class VariableController {
	Scanner sc = new Scanner(System.in);
		
	public void variab1eBasic1() {
		int num = 100;
		long num2 = 10000L;
		float num3 = 234.567f;
		double num4 = 567.12356;
		char x = 'A';
		String y = "Hello world";
		boolean z = true;
		System.out.println(num+ "\n" + num2 + "\n" + num3 + "\n" + num4 + "\n" + x + "\n" + y + "\n" + z);
	}
	
	public void variableBasic2() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을(M/F) 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력하세요 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("전화번호를 입력하세요 : ");
		int phone = sc.nextInt();
		System.out.println("이메일을 입력하세요 : ");
		sc.nextLine();
		String mail = sc.nextLine();
		
		System.out.println("이름 : "+name+"나이 : "+age+"성별 : "+gender+"주소 : "+address+"전화번호 : "+phone+"이메일 : "+mail);
	}
	
	public void variableBasic3() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을(M/F) 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력하세요 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("전화번호를 입력하세요 : ");
		int phone = sc.nextInt();
		System.out.println("이메일을 입력하세요 : ");
		sc.nextLine();
		String mail = sc.nextLine();
		
		System.out.println("이름 "+" 나이 "+" 성별 "+" 주소 "+" 전화번호 "+" 이 메일 ");
		System.out.println(name+"  "+age+"  "+gender+"  "+address+"  "+phone+"  "+mail);
	}
	
	public void variableBasic4() {
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("성별을(M/F) 입력하세요 : ");
		char gender = sc.next().charAt(0);
		System.out.println("주소를 입력하세요 : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("키를 입력하세요 : ");
		int height = (int)sc.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		double getWeight = sc.nextDouble();
	
		
		System.out.print("이름 : "+name+" 나이 : "+age+" 성별 : "+gender+" 주소 : "+address+" 키 : "+height);
		System.out.printf(" 몸무게 : %.1f", getWeight);
	}

}
