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
		
		//ArithmeticException �߻� ��Ű��
		
		try {
			System.out.print("�� : ");
			int su=sc.nextInt();
			System.out.print("�� : ");
			int su2=sc.nextInt();
			System.out.println(su/su2);
			
			System.out.println("�����߻����� ���� �ڵ� �̰Ŵ� ����Ǵ�?");
			
		}catch(ArithmeticException e) {
			System.out.println("0���δ� ���� �� ����!");
		}
		//NegativeArraySizeException : �迭���̸� ������ ����
		//int[] intArr=new int[-20];
		
		//ArrayIndexOutOfBoundsException : �迭�� �ε��������� �Ѿ ����
		String[] names=new String[3];
		try{
			names[3]="������";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �۳׿� ������ų�Կ�");
			String[] temp=new String[names.length+5];
			System.arraycopy(names, 0, temp, 0, names.length);
			temp[3]="������";
			names=temp;
		}
		
		for(String n : names) {
			System.out.println(n);
		}
		
		//ClassCastException : Ŭ���� ����ȯ ����
		Object obj=new Date();
		try {
			String a=(String)obj;
		}catch(ClassCastException e) {
			System.out.println("����ȯ�� �߸��ƾ��!");
			
		}
		
		
		String name=null;
		try {
			int age=19;
			name.charAt(0);
			System.out.println(age);
			
		}catch(NullPointerException e) {
			System.out.println("�⺻������");
			name="������";
			name.charAt(0);
			//System.out.println(age);
		}
		//System.out.println(age);
		
		//checkedException
		//IOException(�����������) -> �߻��ϴ� ���ܿ� ���� ����
		String[] hobby=null;
		try {
			
			//hobby[0]="�";	
			
			FileInputStream input=new FileInputStream("test.txt");
			
			input.read();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();//
			return;
		}
		catch(NullPointerException e) {
			System.out.println("�迭�� null�̿���!");
		}catch(IOException e) {
			System.out.println("IOExpcetion�� ó����.");
		}finally {
			System.out.println("�̰ǹ����� ����!");
		}
		//Exception���� ��Ӱ��谡 ����.
		
		//finally{ }
		
		
		System.out.println("�̰ų�����???");
		
		sc.close();
		
		
		new ThrowsTest().tryWithResourceTest();
		
		
	}

}
