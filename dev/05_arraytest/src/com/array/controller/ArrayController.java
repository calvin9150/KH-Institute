package com.array.controller;

import java.util.*;

public class ArrayController {
	
	Scanner sc = new Scanner(System.in);

	public void basicArray() {
		//�迭 ����� �Ҵ��ϱ�
		String strArr[] = new String[4];
		strArr[0] = "��";
		strArr[0] = "��";
		strArr[0] = "��";
		strArr[0] = "��";
		
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
		String names[] = {"����ű�", "god", "hot" };
		for(int i=0; i<=names.length-1; i++) {
			if(names[i].equals("god")) {
				System.out.println("god�� ��Ͽ� �ֽ��ϴ�.");
			}
		}
	}
	
	public void basicArray4() {
		String hobbies[] = new String[5];

		for(int i=0; i<=hobbies.length-1; i++) {
			System.out.println("����� ��̴� : ");
			String hobby = sc.nextLine();
				hobbies[i]=hobby;
		}
		for(int i=0; i<=hobbies.length-1; i++) {
		System.out.println(hobbies[i]);
		}
		
		for(int i=0; i<=hobbies.length-1; i++) {
			System.out.println("�˻��� ��� : ");
			String src = sc.nextLine();
			if(hobbies[i].equals(src)) {
				System.out.println(src+"�� ��Ͽ� �ֽ��ϴ�.");
			} else {
				System.out.println(src+"�� ��Ͽ� �����ϴ�.");
			}
		}
	}

}
