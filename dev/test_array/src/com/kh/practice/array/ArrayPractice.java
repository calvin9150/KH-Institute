package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int[] numArr = new int[10];
		for(int i=1; i<=10; i++) {
			numArr[i-1] = i;
			System.out.print(i+" ");
		}
	}
	
	public void practice2() {
		int[] numArr = new int[10];
		for(int i=10; i>0; i--) {
			numArr[i-1] = i;
			System.out.print(i+" ");
		}
	}
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=1; i<=num; i++) {
			numArr[i-1] = i;
			System.out.print(i+" ");
		}
	}
	
	public void practice4() {
		String[] strArr = new String[5];
		strArr[0] = "사과";
		strArr[1] = "귤";
		strArr[2] = "포도";
		strArr[3] = "복숭아";
		strArr[4] = "참외";
		System.out.println(strArr[1]);
	}
	
	public void practice5() {
		int count = 0;
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		char chr = sc.next().charAt(0);
		System.out.print("application에 "+chr+"가 존재하는 위치(인덱스) : ");
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]==chr) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+chr+" 개수 : "+count);
	}
	
	public void practice6() {
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		System.out.println(week[num]);
	}
	
	public void practice7() {
		int sum = 0;
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			int push = sc.nextInt();
			numArr[i] = push;
		}
		for(int i=0; i<num; i++) {
			System.out.print(numArr[i]+" ");
		}
		for(int i=0; i<num; i++) {
			sum += numArr[i];
		}
		System.out.println("총 합 : "+sum);
	}
	
	public void practice8() {
		boolean a = true;
		int sum = 0;
		int num = 0;
		do {
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num>=0&&num%2!=0) {
				int[] numArr = new int[num];
				for(int i=1;i<=num/2+1;i++) {
					numArr[i-1]=i;
					sum = i;
				}
				for(int i=num/2+1;i<=num-1;i++) {
					numArr[i]=--sum;
				}
				for(int i=0; i<num;i++) {
					System.out.print(numArr[i]+" ");
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		} while(a);
	}
}
