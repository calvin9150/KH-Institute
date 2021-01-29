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
	
	public void practice9() {
		String[] chickMenu = {"불닭", "양념", "간장", "파닭", "후라이드"};
		boolean order = false;
		
		System.out.println("=========메뉴=========");
		System.out.println("불닭, 양념, 간장, 파닭, 후라이드");
		System.out.print("치킨 이름을 입력하세요 : ");
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
			System.out.println(chicken+"치킨 배달 가능.");
		} else {
			System.out.println(chicken+"치킨은 없는 메뉴입니다.");
		}
	}
	
	public void practice10() {
		
		System.out.print("주민등록번호(-포함) : ");
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
		
		System.out.println("\n"+"최대값 : "+arr[9]);
		System.out.print("최소값 : "+arr[0]);
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
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		String[] strArr = str.split("");
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0;i<strArr.length; i++) {
			if(i==strArr.length-1) {
				System.out.print(strArr[i]);
				count++;
			} else {
				System.out.print(strArr[i]+", ");
				count++;
			}
		}
		System.out.println("\n"+"문자 개수 : "+count);
	}
	
	public void practice16() {
		boolean chk = true;
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		sc.nextLine();
		String[] strArr = new String[size];
		for(int i=0;i<strArr.length;i++) {
			System.out.print((i+1)+"번째 문자열 : ");
			String str = sc.nextLine();
			strArr[i]=str;
		}
		int strArrMax = strArr.length; 
		
		while(chk) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			String answer = sc.nextLine();
			if(answer.equals("Y")) {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add = sc.nextInt();
				sc.nextLine();
				strArr = Arrays.copyOf(strArr, strArr.length + add);
				for(int i=strArrMax;i<strArr.length;i++) {
					System.out.print((i+1)+"번째 문자열 : ");
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
