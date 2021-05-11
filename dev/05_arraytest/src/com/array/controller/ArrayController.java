package com.array.controller;

import java.util.*;

public class ArrayController {
	
	Scanner sc = new Scanner(System.in);

	public void basicArray() {
		//배열 선언과 할당하기
		String strArr[] = new String[4];
		strArr[0] = "장";
		strArr[0] = "원";
		strArr[0] = "배";
		strArr[0] = "상";
		
		System.out.println(strArr[0]);
	}
	
	public void basicArray2() {
		int[] intArr = new int[10];
		for(int i=1; i<=10; i++) {
			intArr[i-1]=i;
		}
		for(int i=0; i<10; i++) {
			System.out.println(intArr[i]);
		}
	}
	
	public void basicArray3() {
		String names[] = {"동방신기", "god", "hot" };
		for(int i=0; i<=names.length-1; i++) {
			if(names[i].equals("god")) {
				System.out.println("god가 목록에 있습니다.");
			}
		}
	}
	
	public void basicArray4() {
		String hobbies[] = new String[5];

		for(int i=0; i<=hobbies.length-1; i++) {
			System.out.println("당신의 취미는 : ");
			String hobby = sc.nextLine();
				hobbies[i]=hobby;
		}
		for(int i=0; i<=hobbies.length-1; i++) {
		System.out.println(hobbies[i]);
		}
		
		for(int i=0; i<=hobbies.length-1; i++) {
			System.out.println("검색할 취미 : ");
			String src = sc.nextLine();
			if(hobbies[i].equals(src)) {
				System.out.println(src+"는 목록에 있습니다.");
			} else {
				System.out.println(src+"는 목록에 없습니다.");
			}
		}
	}

}
