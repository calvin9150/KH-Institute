package kh.vari.function;

import java.util.Scanner;

public class VariExample {
	Scanner sc = new Scanner(System.in);
	
	public void Example() {
		System.out.print("첫 번째 숫자를 입력하세요 : ");
		int x = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요 : ");
		int y = sc.nextInt();
		System.out.println("두 수의 합 : "+(x+y)+" 차 : "+(x-y)+" 곱 : "+(x*y)+" 나눗셈 : "+(x/y));
	}
	
	public void Example2() {
		System.out.print("가로 길이를 입력하세요 : ");
		double x = sc.nextDouble();
		System.out.print("세로 길이를 입력하세요 : ");
		double y = sc.nextDouble();
		double area = x*y;
		double circumference = 2*(x+y); 
		System.out.println("사각형의 면적 : "+area+" 둘레 : "+circumference);
	}
	
	public void Example3() {
		String getStr = sc.nextLine();
		for(int i=0; i<getStr.length(); i++) {
			System.out.println(getStr.charAt(i));
		}
	}
	
	public void Example3_5() {
		String getStr = sc.nextLine();
		int upperCase = 0;
		int lowerCase = 0;
		for(int i=0; i<getStr.length(); i++) {
			if(getStr.charAt(i)<91) {
				upperCase++;
			} else { 
				lowerCase++;
			}
		}
		if(upperCase==0) {
			System.out.println("소문자 입니다.");
		} else if(lowerCase==0) {
			System.out.println("대문자 입니다.");
		} else {
			System.out.println("대문자의 갯수 : "+upperCase+" 소문자의 갯수 : "+lowerCase);
		}

	}
	
}