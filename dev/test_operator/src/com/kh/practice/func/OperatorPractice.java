package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("�����.");
		} else {
			System.out.println("����� �ƴϴ�.");
		}
	}
	
	public void practice2() {
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("�����.");
		} else if (num==0) {
			System.out.println("0�̴�.");
		} else {
			System.out.println("������.");
		}
	}
	
	public void practice3() {
		int num = sc.nextInt();
		if(num%2==0) {
			System.out.println("¦����.");
		} else {
			System.out.println("Ȧ����.");
		}
	}
	
	public void practice4() {
		System.out.print("�� �ο� ���� �����ּ��� : ");
		int peopleNum = sc.nextInt();
		System.out.println("���� ������ �����ּ��� : ");
		int candyNum = sc.nextInt();
		int candyEach = candyNum/peopleNum;
		int candyRemain = candyNum%peopleNum;
		System.out.println("1�δ� ���� ���� : "+candyEach);
		System.out.println("���� ���� ���� : "+candyRemain);
	}
	
	public void practice5() {
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		String genderStr = "";
		if(gender=='M') {
			genderStr = "���л�";
		}  else {
			genderStr = "���л�";
		}
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.print(grade+"�г� "+classNum+"�� "+name+" "+genderStr+"�� ");
		System.out.printf("������ %.2f", score);
		System.out.print("�̴�.");
	}
	
	public void practice6() {
		System.out.print("���� : ");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("�����Դϴ�.");
		} else if(age>13 && age<=19) {
			System.out.println("û�ҳ��Դϴ�.");
		} else {
			System.out.println("����Դϴ�.");
		}
	}
	
	public void practice7() {
		System.out.print("���� : ");
		int lang = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		int sum = lang+eng+math;
		int avg = sum/3;
		String judge = "";
		if(avg>=60&&lang>=40&&eng>=40&&math>=40) {
			judge = "�հ�";
		} else {
			judge = "���հ�";
		}
		System.out.println("�հ� : "+sum+"\n"+"��� : "+avg+"\n"+judge);
	}
	
	public void practice8() {
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� : ");
		int id = sc.next().charAt(7);
		if(id%2==0) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
	
	public void practice9() {
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		boolean result = true;
		if(num3<=num1||num3>num2) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
	}
	
	public void practice10() {
		System.out.print("�Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		if(num1==num2&&num1==num3&&num2==num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public void practice11() {
		System.out.print("A����� ���� : ");
		int A = sc.nextInt();
		System.out.print("B����� ���� : ");
		int B = sc.nextInt();
		System.out.print("C����� ���� : ");
		int C = sc.nextInt();
		double incenA = A*1.4;
		double incenB = B*1.0;
		double incenC = C*1.15;
		String judgeA;
		
		System.out.println("A��� ����/����+a : "+A+"/"+incenA);
		if(incenA>=3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("B��� ����/����+a : "+B+"/"+incenB);
		if(incenB>=3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		System.out.println("C��� ����/����+a : "+C+"/"+incenC);
		if(incenC>=3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
	}
}
