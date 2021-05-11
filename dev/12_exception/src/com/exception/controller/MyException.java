package com.exception.controller;


//사용자 정의 예외 만들기
//기본클래스에 Exception클래스를 상속받음.
public class MyException extends Exception{
	
	private static final long serialVersionUID = -2599076210701015553L;

	public MyException() {
		super();
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
