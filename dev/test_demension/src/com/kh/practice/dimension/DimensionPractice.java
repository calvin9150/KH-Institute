package com.kh.practice.dimension;

import java.awt.print.Printable;
import java.util.*;

public class DimensionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		String[][] arr = {{"(0, 0)","(0, 1)", "(0, 2)"}, {"(1, 0)", "(1, 1)", "(1, 2)"}, {"(2, 0)", "(2, 1)", "(2, 2)"}};
		for(int i=0; i<3; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]);
			}
		}
	}
	
	public void practice2() {
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public void practice3() {
		int num = 16;
		int[][] arr = new int[4][4];
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public void practice4() {
		int rowSum=0;
		int colSum=0;
		int sum = 0;
		Random rand = new Random();
		int[][] arr = new int[4][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=rand.nextInt(10);;
			}
		}
		//열 합치기
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum+=arr[j][i];
			}
			arr[3][i]+=sum;
			sum = 0;
		}
		//행 합치기
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum+=arr[i][j];
			}
			arr[i][3]+=sum;
			sum = 0;
		}
		//총합
		for(int i=0; i<3; i++) {
			rowSum+=arr[3][i];
			colSum+=arr[i][3];
		}
		arr[3][3]=rowSum+colSum;
		//배열출력
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0; j<4; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public void practice5() {
		boolean a = true;
		int rowSize = 0;
		int colSize = 0;
		
		do { 
			System.out.print("행 크기 : ");
			rowSize = sc.nextInt();
			System.out.print("열 크기 : ");
			colSize = sc.nextInt();
			
			if(rowSize>0&&colSize>0) {
				char[][] arr = new char[rowSize][colSize];
				for(int i=0; i<arr.length; i++) {
					System.out.println();
					for(int j=0; j<arr[0].length; j++) {
						arr[i][j]=(char) ((Math.random() * 26) + 65);
						System.out.print(arr[i][j]+" ");
					}
				}
				break;
			}else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
		} while(a);
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원",
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
		for(int i=0;i<strArr.length; i++) {
			for(int j=0;j<strArr.length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
		}
	}
	
	public void practice7() {
		int row = 0;
		int col = 0;
		char temp;
		int alph = 97;
		
		System.out.print("행의 크기 : ");
		row = sc.nextInt();
		String[][] arr = new String[row][];
		
		for(int i=0; i<row; i++) {
			System.out.print(i+"행의 열 크기 : ");
			col = sc.nextInt();
			arr[i] = new String[col]; 
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println();
			for(int j=0; j<arr[i].length; j++) {
				temp=(char) alph++;
				arr[i][j]=String.valueOf(temp);
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	
	public void practice8() {
		int count = 0;
		
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", 
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr2 = new String[6][2];
		
		System.out.print("== 1분단 ==");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println();
			if(i==3) {
				System.out.println("== 2분단 ==");
			}
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[count++];
				System.out.print(arr2[i][j]+"  ");
			}
		}
	}
	
	public void practice9() {
		int count = 0;
		int count2 = 0;
		int group = 0;
		String row = "";
		String side = "";
		
		String[] arr = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", 
				"윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr2 = new String[6][2];
		
		System.out.print("== 1분단 ==");
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println();
			if(i==3) {
				System.out.println("== 2분단 ==");
			}
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr[count++];
				System.out.print(arr2[i][j]+"  ");
			}
		}
		System.out.println();
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			count2++;
			if(name.equals(arr[i])) {
				break;
			}
		}
		
		if(count2>6) {
			group = 2;
		} else {
			group = 1;
		}
		
		count2 -= 1;
		
		if(count2%2==0||count2==0) {
			side = "왼쪽";
		} else {
			side = "오른쪽";
		}
		
		switch (count2) {
			case 0 : row = "첫";
			break;
			case 1 : row = "첫";
			break;
			case 2 : row = "두";
			break;
			case 3 : row = "두";
			break;
			case 4 : row = "세";
			break;
			case 5 : row = "세";
			break;
			case 6 : row = "첫";
			break;
			case 7 : row = "첫";
			break;
			case 8 : row = "두";
			break;
			case 9 : row = "두";
			break;
			case 10 : row = "세";
			break;
			case 11 : row = "세";
			break;
		}
		
		System.out.println("검색하신 "+name+" 학생은 "+group+"분단 "+row+" 번째 줄 "+side+"에 있습니다.");		
	}
}
