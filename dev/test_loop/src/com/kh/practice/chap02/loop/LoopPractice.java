package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int getNum = sc.nextInt();
		if(getNum>=1) {
			for(int i=1; i<=getNum; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}
	}
	
	public void practice2() {
		int getNum = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			getNum = sc.nextInt();
			if(getNum>=1) {
				for(int i=1; i<=getNum; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		} while (getNum>1);
	}
	
	public void practice3() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int getNum = sc.nextInt();
		if(getNum>=1) {
			for(int i=getNum; i>=1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}
	}
	
	public void practice4() {
		int getNum = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			getNum = sc.nextInt();
			if(getNum>=1) {
				for(int i=getNum; i>=1; i--) {
					System.out.println(i);
				}
			} else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		} while(getNum>1);
	}
	
	public void practice5() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int getNum = sc.nextInt();
		int sum = 0;
		if(getNum>=1) {
			for(int i=1; i<=getNum; i++) {
				System.out.print(i+" + ");
				sum += i;
			}
			System.out.println(" = "+sum);
		}
	}
	
	public void practice6() {
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		if(num1>=1&&num2>=1&&num1>num2) {
			for(int i=num2; i<=num1; i++) {
				System.out.println(i);
			}
			} else if (num1>=1&&num2>=1&&num2>num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.println(i);
			}
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}
	}
	
	public void practice7() {
		int num1 = 0;
		int num2 = 0;
		do {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num1 = sc.nextInt();
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			num2 = sc.nextInt();
			if(num1>=1&&num2>=1&&num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.println(i);
				}
				} else if (num1>=1&&num2>=1&&num2>num1) {
					for(int i=num1; i<=num2; i++) {
						System.out.println(i);
				}
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		} while(num1>=1&&num2>=1);
	}
	
	public void practice8() {
		System.out.println("������ ���� : ");
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
	public void practice9() {
		System.out.println("������ ���� : ");
		int num = sc.nextInt();
		if(num<=9)
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		} else if(num>9) {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		int num = 0;
		do {
			System.out.println("������ ���� : ");
			num = sc.nextInt();
			if(num<=9)
			for(int i=1; i<10; i++) {
				System.out.println(num+" * "+i+" = "+num*i);
			} else if(num>9) {
				System.out.println("9 ������ ���ڸ� �Է����ּ���.");
			}
		} while(num>0);
	}
	
	public void practice11() {
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		int commonDiff =  sc.nextInt();
		int sum = num;
		for (int i=1; i<=10; i++) {
			sum+=commonDiff;
			System.out.print(sum+" ");
		}
	}
	
	public void practice12() {
		String order = "";
		do {
			System.out.print("������(+,-,*,/,%) : ");
	        String operator = sc.nextLine();
	        if(operator.equals("exit")) {
	        	System.out.println("���α׷��� �����մϴ�.");
	        	break;
	        } else if(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("/")&&!operator.equals("*")&&!operator.equals("%"))
	        	{
	        		System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.");
	        		continue;
	        	}
			System.out.print("����1 : ");
			int x = sc.nextInt();
			System.out.print("����2 : ");
			int y = sc.nextInt();
			if(operator.equals("/")&&y==0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				sc.nextLine();
				continue;
			}
			System.out.print(x+" "+operator+" "+y+" = ");
			sc.nextLine();
	        switch(operator) {
		    	case "+" :
		    		System.out.println(x+y);
		    		break;
		    	case "-" :
		    	System.out.println(x-y);
		    		break;
		    	case "*" :
		    		System.out.println(x*y);
		    		break;
		    	case "/" :
		    		System.out.println(x/y);
		    		break;
		    	case "%" :
		    		System.out.println(x%y);
		    		break;
		    	default :
		    		System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		    		order = "exit";
		    		break;
	        	}

			}    
			while(!order.equals("exit"));
	}
}
