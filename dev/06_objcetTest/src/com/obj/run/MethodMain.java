package com.obj.run;

import com.obj.controller.MethodTest;
import java.util.*;

public class MethodMain {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//MethodTest Ŭ������ cal2 �޼ҵ带 ȣ��
		MethodTest mt = new MethodTest();
		int a = sc.nextInt();
		
		System.out.println(mt.cal3(a, 5, '-'));
	}

}
