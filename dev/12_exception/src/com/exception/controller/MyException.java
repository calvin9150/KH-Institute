package com.exception.controller;


//����� ���� ���� �����
//�⺻Ŭ������ ExceptionŬ������ ��ӹ���.
public class MyException extends Exception{
	
	private static final long serialVersionUID = -2599076210701015553L;

	public MyException() {
		super();
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
