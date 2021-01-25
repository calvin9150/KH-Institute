package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int getNum = sc.nextInt();
		if(getNum>=1) {
			for(int i=1; i<=getNum; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
	}
	
	public void practice2() {
		int getNum = 0;
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			getNum = sc.nextInt();
			if(getNum>=1) {
				for(int i=1; i<=getNum; i++) {
					System.out.println(i);
				}
			} else {
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		} while (getNum>1);
	}
	
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int getNum = sc.nextInt();
		if(getNum>=1) {
			for(int i=getNum; i>=1; i--) {
				System.out.println(i);
			}
		} else {
			System.out.println("1이상의 숫자를 입력하세요.");
		}
	}
	
	public void practice4() {
		int getNum = 0;
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			getNum = sc.nextInt();
			if(getNum>=1) {
				for(int i=getNum; i>=1; i--) {
					System.out.println(i);
				}
			} else {
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		} while(getNum>1);
	}
	
	public void practice5() {
		System.out.print("1이상의 숫자를 입력하세요 : ");
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
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		if(num1>=1&&num2>=1&&num1>num2) {
			for(int i=num2; i<=num1; i++) {
				System.out.println(i);
			}
			} else if (num1>=1&&num2>=1&&num2>num1) {
				for(int i=num1; i<=num2; i++) {
					System.out.println(i);
			}
			System.out.println("1이상의 숫자를 입력하세요.");
		}
	}
	
	public void practice7() {
		int num1 = 0;
		int num2 = 0;
		do {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num1 = sc.nextInt();
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num2 = sc.nextInt();
			if(num1>=1&&num2>=1&&num1>num2) {
				for(int i=num2; i<=num1; i++) {
					System.out.println(i);
				}
				} else if (num1>=1&&num2>=1&&num2>num1) {
					for(int i=num1; i<=num2; i++) {
						System.out.println(i);
				}
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		} while(num1>=1&&num2>=1);
	}
	
	public void practice8() {
		System.out.println("구구단 숫자 : ");
		int num = sc.nextInt();
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
	
	public void practice9() {
		System.out.println("구구단 숫자 : ");
		int num = sc.nextInt();
		if(num<=9)
		for(int i=1; i<10; i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		} else if(num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		int num = 0;
		do {
			System.out.println("구구단 숫자 : ");
			num = sc.nextInt();
			if(num<=9)
			for(int i=1; i<10; i++) {
				System.out.println(num+" * "+i+" = "+num*i);
			} else if(num>9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
			}
		} while(num>0);
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
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
			System.out.print("연산자(+,-,*,/,%) : ");
	        String operator = sc.nextLine();
	        if(operator.equals("exit")) {
	        	System.out.println("프로그램을 종료합니다.");
	        	break;
	        } else if(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("/")&&!operator.equals("*")&&!operator.equals("%"))
	        	{
	        		System.out.println("없는 연산자입니다. 다시 입력해주세요.");
	        		continue;
	        	}
			System.out.print("정수1 : ");
			int x = sc.nextInt();
			System.out.print("정수2 : ");
			int y = sc.nextInt();
			if(operator.equals("/")&&y==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
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
		    		System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		    		order = "exit";
		    		break;
	        	}

			}    
			while(!order.equals("exit"));
	}
}
