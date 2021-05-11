package com.exception.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsTest {

	//����ó�� �����ϱ�
	public void a() throws FileNotFoundException	 {
		FileInputStream fis=new FileInputStream("test.txt");
	}
	
	public void b() throws IOException{
		a();
		//Ư�� ���ǿ� ���� ���ܸ� �߻���ų �� ����.
	//	throw new ArrayIndexOutOfBoundsException();
		
		//throw new IOException();
	}
	
	public void c() {
		try{
			b();
		}catch(IOException e) {
			e.printStackTrace();
		}
//		catch(EOFException e) {
//			e.printStackTrace();
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	
	public void tryWithResourceTest() {
		//FileInputStream input=null;
		
		try(Scanner sc=new Scanner(System.in);
				FileInputStream input=new FileInputStream("test.txt");) {
			//input=new FileInputStream("test.txt");
			int data=-1;
			while((data=input.read())!=-1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
//		}finally {
//			try {
//				if(input!=null) input.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		
		
	}
	
	
}
