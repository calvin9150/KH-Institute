package com.poly2.model.vo;

public abstract class Person { // 추상클래스
	private String name;
	private int age;
	private String address;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//공통적으로 정해진 메소드를 구현하게 할 때 사용하는 것 -> 추상메소드
	// ㄴ 각 개체마다 구현되는 내용이 다른 것.
	//추상화 메서드는 반드시 구현부에서 구현을 해줘야 함. 
	//ㄴ 그러므로 Person을 상속한 클래스들은 밑에 active() 메서드를 무조건 Override 구현해야 함. 안그러면 error!
	public abstract void active();
	
	
}
