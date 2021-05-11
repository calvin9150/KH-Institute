package com.obj.controller;

import java.util.*;

public class MethodTest {
	
	Scanner sc = new Scanner(System.in);
	
	//(멤버)메소드 만들기
	
	//반환형없고 매개변수 없는 메소드
	public void cal() {
		//메소드 로직 구성
		
	}
	
	//반환형 없고 매개변수 있는 메소드
	public void cal2(int su, int su2, char op) {
		switch(op) {
		case '+' : System.out.println(su+"+"+su2+"="+(su+su2));
		break;
		case '-' : System.out.println(su+"-"+su2+"="+(su-su2));
		break;
		}
	}
	
	//반환형 있고 매개변수 있는 메소드
	//반환형이 있는 메소드는 반드시 메소드 구현부에 [return 값] 예약어가 있어야 한다.
	public double cal3(int su, int su2, char op) {
		double result;
		switch(op) {
		case '+' : result = su+su2;
		break;
		case '-' : result = su-su2;
		break;
		default : result = 0.0;
		}
		
		return result;
	}
	
	
}

