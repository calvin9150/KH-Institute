package com.repeat.controller;

public class RepeatController {

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
	
}
