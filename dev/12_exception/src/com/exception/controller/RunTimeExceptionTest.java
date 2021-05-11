package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class RunTimeExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//ArithmeticException 발생 시키기
		
		try {
			System.out.print("수 : ");
			int su=sc.nextInt();
			System.out.print("수 : ");
			int su2=sc.nextInt();
			System.out.println(su/su2);
			
			System.out.println("에러발생라인 이후 코드 이거는 실행되니?");
			
		}catch(ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없슈!");
		}
		//NegativeArraySizeException : 배열길이를 음수로 지정
		//int[] intArr=new int[-20];
		
		//ArrayIndexOutOfBoundsException : 배열의 인덱스범위를 넘어서 지정
		String[] names=new String[3];
		try{
			names[3]="유병승";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열이 작네요 증가시킬게요");
			String[] temp=new String[names.length+5];
			System.arraycopy(names, 0, temp, 0, names.length);
			temp[3]="유병승";
			names=temp;
		}
		
		for(String n : names) {
			System.out.println(n);
		}
		
		//ClassCastException : 클래스 형변환 에러
		Object obj=new Date();
		try {
			String a=(String)obj;
		}catch(ClassCastException e) {
			System.out.println("형변환이 잘못됐어요!");
			
		}
		
		
		String name=null;
		try {
			int age=19;
			name.charAt(0);
			System.out.println(age);
			
		}catch(NullPointerException e) {
			System.out.println("기본값설정");
			name="유병승";
			name.charAt(0);
			//System.out.println(age);
		}
		//System.out.println(age);
		
		//checkedException
		//IOException(데이터입출력) -> 발생하는 예외에 대한 내용
		String[] hobby=null;
		try {
			
			//hobby[0]="운동";	
			
			FileInputStream input=new FileInputStream("test.txt");
			
			input.read();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();//
			return;
		}
		catch(NullPointerException e) {
			System.out.println("배열이 null이에요!");
		}catch(IOException e) {
			System.out.println("IOExpcetion이 처리함.");
		}finally {
			System.out.println("이건무조건 실행!");
		}
		//Exception에도 상속관계가 있음.
		
		//finally{ }
		
		
		System.out.println("이거나오니???");
		
		sc.close();
		
		
		new ThrowsTest().tryWithResourceTest();
		
		
	}

}
