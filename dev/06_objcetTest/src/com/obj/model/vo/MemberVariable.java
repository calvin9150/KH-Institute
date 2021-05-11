package com.obj.model.vo;

public class MemberVariable {
	//멤버변수 선언하기
	//클래스 중괄호 내부에 -> 접근제한자 자료형 변수명;
	public String name="jang";
	static int age;
	public String game;
	public double height;
	
	public final int MYAGE;
	private static int count=0;
	public static int memberId=0;
	public static double bonus;
	
	
	//초기화블록 : 멤버변수의 값에 초기값을 대입할 때 사용하는 것
	{//인스턴스 초기화 블록
		// new 연산자로 클래스를 생성할 때 마다 실행됨.
		name="GOM";
		age=27;
		height=170.5;
		MYAGE=19;
		if(bonus==0.0) {
			bonus=2.0;
		}
		memberId=++count;
	}
	static {
		//static으로 선언된 변수를 초기화하는 것
		//없다
		//프로그램 실행시 딱 한번 실행되고 그 다음부턴 안됨 
		count = 100; //static 변수
		bonus = 22; //static 변수 즉, class변수
		age = 50; //멤버변수
	}
	
	public void test() {
		//클래스 내부에서는 접근연산자 없이 사용
		
	}
}
