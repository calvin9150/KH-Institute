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
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=1; i<=num; i++) {
			numArr[i-1] = i;
			System.out.print(i+" ");
		}
	}
	
	public void practice4() {
		String[] strArr = new String[5];
		strArr[0] = "���";
		strArr[1] = "��";
		strArr[2] = "����";
		strArr[3] = "������";
		strArr[4] = "����";
		System.out.println(strArr[1]);
	}
	
	public void practice5() {
		int count = 0;
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char chr = sc.next().charAt(0);
		System.out.print("application�� "+chr+"�� �����ϴ� ��ġ(�ε���) : ");
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++) {
			if(strArr[i]==chr) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n"+chr+" ���� : "+count);
	}
	
	public void practice6() {
		String[] week = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		System.out.println(week[num]);
	}
	
	public void practice7() {
		int sum = 0;
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] numArr = new int[num];
		for(int i=0; i<num; i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			int push = sc.nextInt();
			numArr[i] = push;
		}
		for(int i=0; i<num; i++) {
			System.out.print(numArr[i]+" ");
		}
		for(int i=0; i<num; i++) {
			sum += numArr[i];
		}
		System.out.println("�� �� : "+sum);
	}
	
	public void practice8() {
		boolean a = true;
		int sum = 0;
		int num = 0;
		do {
			System.out.print("���� : ");
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
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		} while(a);
	}
}
