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
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������(M/F) �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		int phone = sc.nextInt();
		System.out.println("�̸����� �Է��ϼ��� : ");
		sc.nextLine();
		String mail = sc.nextLine();
		
		System.out.println("�̸� : "+name+"���� : "+age+"���� : "+gender+"�ּ� : "+address+"��ȭ��ȣ : "+phone+"�̸��� : "+mail);
	}
	
	public void variableBasic3() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������(M/F) �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� : ");
		int phone = sc.nextInt();
		System.out.println("�̸����� �Է��ϼ��� : ");
		sc.nextLine();
		String mail = sc.nextLine();
		
		System.out.println("�̸� "+" ���� "+" ���� "+" �ּ� "+" ��ȭ��ȣ "+" �� ���� ");
		System.out.println(name+"  "+age+"  "+gender+"  "+address+"  "+phone+"  "+mail);
	}
	
	public void variableBasic4() {
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		System.out.print("������(M/F) �Է��ϼ��� : ");
		char gender = sc.next().charAt(0);
		System.out.println("�ּҸ� �Է��ϼ��� : ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("Ű�� �Է��ϼ��� : ");
		int height = (int)sc.nextDouble();
		System.out.println("�����Ը� �Է��ϼ��� : ");
		double getWeight = sc.nextDouble();
	
		
		System.out.print("�̸� : "+name+" ���� : "+age+" ���� : "+gender+" �ּ� : "+address+" Ű : "+height);
		System.out.printf(" ������ : %.1f", getWeight);
	}

}
