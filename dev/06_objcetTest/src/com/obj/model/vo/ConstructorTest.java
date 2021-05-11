package com.obj.model.vo;

public class ConstructorTest {

	//멤버변수
	public int age;
	public String nickName;
	public int tea;
	
	
	//생성자
	//접근제한자 클래스명(){로직}
	//생성자는 일반적으로 public
	//ㄴ private, default로 선언되면 외부 패키지에서 클래스를 사용하지 못함
	public ConstructorTest() {} // 기본생성자(default생성자)
	
	//멤버메소드
	//매개변수 있는 생성자
	public ConstructorTest(int age, String nickName, int tea) {
		
		this.age=age;
		this.nickName=nickName;
		this.tea=tea;
	}
	
	public ConstructorTest(String nickname) {
		this(19,"das",22);
	}
}
