package com.poly2.common;

public interface AnimalBarkAble {
	//인터페이스는 객체에 특정한 메소드를 강제하기 위해 사용.
	//인터페이스 내부의 변수는 모두 public static final
	//인터페이스 내부 모든 메소느느 public abstract 메서드
	
	public static final int age = 19; // 고정값만 사용 가능. 변수만 선언하는건 안됨.
	
	String admin = "admin@naver.com"; // public static final 은 알아서 생략되긴 함.
	
	//메서드 선언
	
	public abstract void bark();	
}
