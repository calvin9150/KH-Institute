package com.obj.run;

import com.obj.controller.MethodTest;
import java.util.*;

public class MethodMain {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//MethodTest 클래스의 cal2 메소드를 호출
		MethodTest mt = new MethodTest();
		int a = sc.nextInt();
		
		System.out.println(mt.cal3(a, 5, '-'));
	}

}
