package kh.vari.function;

import java.util.Scanner;

public class VariExample {
	Scanner sc = new Scanner(System.in);
	
	public void Example() {
		System.out.print("ù ��° ���ڸ� �Է��ϼ��� : ");
		int x = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ��� : ");
		int y = sc.nextInt();
		System.out.println("�� ���� �� : "+(x+y)+" �� : "+(x-y)+" �� : "+(x*y)+" ������ : "+(x/y));
	}
	
	public void Example2() {
		System.out.print("���� ���̸� �Է��ϼ��� : ");
		double x = sc.nextDouble();
		System.out.print("���� ���̸� �Է��ϼ��� : ");
		double y = sc.nextDouble();
		double area = x*y;
		double circumference = 2*(x+y); 
		System.out.println("�簢���� ���� : "+area+" �ѷ� : "+circumference);
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
			System.out.println("�ҹ��� �Դϴ�.");
		} else if(lowerCase==0) {
			System.out.println("�빮�� �Դϴ�.");
		} else {
			System.out.println("�빮���� ���� : "+upperCase+" �ҹ����� ���� : "+lowerCase);
		}

	}
	
}