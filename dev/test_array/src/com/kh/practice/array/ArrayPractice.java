package com.kh.practice.array;

import java.util.*;

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
	
	public void practice9() {
		String[] chickMenu = {"�Ҵ�", "���", "����", "�Ĵ�", "�Ķ��̵�"};
		boolean order = false;
		
		System.out.println("=========�޴�=========");
		System.out.println("�Ҵ�, ���, ����, �Ĵ�, �Ķ��̵�");
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.nextLine();
		for(int i=0; i<chickMenu.length; i++) {
			if(chickMenu[i].equals(chicken)) {
				order = true;
				break;
			} else {
				order = false;
				continue;
			}
		}
		if(order) {
			System.out.println(chicken+"ġŲ ��� ����.");
		} else {
			System.out.println(chicken+"ġŲ�� ���� �޴��Դϴ�.");
		}
	}
	
	public void practice10() {
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String id = sc.nextLine();
		String[] idArr = id.split("");
		String[] idCopy = Arrays.copyOf(idArr, 14);
		
		for(int i=8; i<idCopy.length; i++) {
			idCopy[i] = "*";
		}
		for(int i=0; i<=7; i++) {
			System.out.print(idArr[i]);
		}
		for(int i=8; i<=13; i++) {
			System.out.print(idCopy[i]);
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			System.out.print(arr[i]+" ");
		}
		Arrays.sort(arr);
		
		System.out.println("\n"+"�ִ밪 : "+arr[9]);
		System.out.print("�ּҰ� : "+arr[0]);
	}
	
	public void practice13() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice14() {
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*44+1);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		Arrays.sort(arr);
	
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void practice15() {
		int count = 0;
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		String[] strArr = str.split("");
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i=0;i<strArr.length; i++) {
			if(i==strArr.length-1) {
				System.out.print(strArr[i]);
				count++;
			} else {
				System.out.print(strArr[i]+", ");
				count++;
			}
		}
		System.out.println("\n"+"���� ���� : "+count);
	}
	
	public void practice16() {
		boolean chk = true;
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] strArr = new String[size];
		for(int i=0;i<strArr.length;i++) {
			System.out.print((i+1)+"��° ���ڿ� : ");
			String str = sc.nextLine();
			strArr[i]=str;
		}
		int strArrMax = strArr.length; 
		
		while(chk) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			String answer = sc.nextLine();
			if(answer.equals("Y")) {
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int add = sc.nextInt();
				sc.nextLine();
				strArr = Arrays.copyOf(strArr, strArr.length + add);
				for(int i=strArrMax;i<strArr.length;i++) {
					System.out.print((i+1)+"��° ���ڿ� : ");
					String str = sc.nextLine();
					strArr[i]=str;
				}
			} else if(answer.equals("N")) {
				break;
			}
		}
		 System.out.println(Arrays.toString(strArr));
	}
}
