package com.obj.controller;

import java.util.*;

public class MethodTest {
	
	Scanner sc = new Scanner(System.in);
	
	//(���)�޼ҵ� �����
	
	//��ȯ������ �Ű����� ���� �޼ҵ�
	public void cal() {
		//�޼ҵ� ���� ����
		
	}
	
	//��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
	public void cal2(int su, int su2, char op) {
		switch(op) {
		case '+' : System.out.println(su+"+"+su2+"="+(su+su2));
		break;
		case '-' : System.out.println(su+"-"+su2+"="+(su-su2));
		break;
		}
	}
	
	//��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
	//��ȯ���� �ִ� �޼ҵ�� �ݵ�� �޼ҵ� �����ο� [return ��] ���� �־�� �Ѵ�.
	public double cal3(int su, int su2, char op) {
		double result;
		switch(op) {
		case '+' : result = su+su2;
		break;
		case '-' : result = su-su2;
		break;
		default : result = 0.0;
		}
		
		return result;
	}
	
	
}

