package com.repeat.controller;

import java.util.Scanner;

public class RepeatController {

	Scanner sc = new Scanner(System.in);
	
	public void basicFor() {
		//�⺻  for�� �̿��ϱ�
		for(int i=1; i<=9; i++) {
			System.out.println("��ȣ");
		}
	}
	
	public void basicFor2() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	}
	
	public void basicFor3() {
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
	public void basicFor4() {
		for(int i=100; i>=1; i--) {
			System.out.println(i);
		}
	}
	
	public void basicFor5() {
		int temp = 0;
		for(int i=0; i<=100; i++) {
			int result = i+temp;
			temp = result;
			if(i==100) {
				System.out.println(result);
			}
		}
	}

	public void basicFor6() {
		for(int i=0; i<=5; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println(name+age+grade);
		}
	}
	//���ѷ���+�����ɾ�
	public void basicFor7() {
		String end = "";
		for(;!end.equals("����");) {
			System.out.println(end);
			end  = sc.next();
		}
	}
	
	public void extraFor() {
		System.out.print("�л� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		for(int i =1; i<=num; i++) {
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("�г� : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.println(name+age+grade);
		}
	}
	
	public void extraFor2() {
		System.out.print("�л� �� : ");
		int num = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		int avg = 0;
		for(int i =1; i<=num; i++) {
			System.out.print("���� : ");
			int lang = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();
			sum += lang+eng+math;
			avg = sum/3/i;
			System.out.println("�� �հ� : "+sum+"\n"+"�� ��� : "+avg+"\n");
		}
	}
	
	public void calculator() {
		System.out.println("����� �ݺ��� Ƚ�� : ");
		int num = sc.nextInt();
		for(int i=1; i<=num;i++ ) {
			System.out.print("ù��° ���� : ");
			int x = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			int y = sc.nextInt();
			System.out.print("������(+,-,*,/,%)�� �Է� : ");
	        char operator = sc.next().charAt(0);
	        switch(operator) {
		    	case '+' :
		    		System.out.println(x+y);
		    		break;
		    	case '-' :
		    	System.out.println(x-y);
		    		break;
		    	case '*' :
		    		System.out.println(x*y);
		    		break;
		    	case '/' :
		    		System.out.println(x/y);
		    		break;
		    	case '%' :
		    		System.out.println(x%y);
		    		break;
		    	default :
		    		System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		    }
		}
	}
	
	public void basicWhile() {
		String num="";
		while(!num.equals("0")) {
			num=sc.nextLine();
			System.out.println(num);
		}
	}
	
	public void calculator2() {
		String num = "";
		while(!num.equals("N")) {
			System.out.print("ù��° ���� : ");
			int x = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			int y = sc.nextInt();
			System.out.print("������(+,-,*,/,%)�� �Է� : ");
	        char operator = sc.next().charAt(0);
	        switch(operator) {
		    	case '+' :
		    		System.out.println(x+y);
		    		break;
		    	case '-' :
		    	System.out.println(x-y);
		    		break;
		    	case '*' :
		    		System.out.println(x*y);
		    		break;
		    	case '/' :
		    		System.out.println(x/y);
		    		break;
		    	case '%' :
		    		System.out.println(x%y);
		    		break;
		    	default :
		    		System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		    }
	        System.out.println("��� �Ͻðڽ��ϱ�? (Y/N)");
			sc.nextLine();
	        num = sc.nextLine();
		}
	}
	
	public void menuNOT() {
		boolean a = false;
		int pick = 0;
		do {
			System.out.println("�޴��� ����ּ���..  1. ��� / 2. ��� / 3. ������ / 4. ���� / 0. ����");
			pick = sc.nextInt();
			switch(pick) {
			case 1 :
				
			}
		} while(pick==0);
			System.out.println("");
	}
	
	public void extraFor3() {
		
	}
}
