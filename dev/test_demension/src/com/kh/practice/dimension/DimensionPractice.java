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
		
	}
}
