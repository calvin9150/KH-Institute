package com.obj.run;

import com.obj.model.vo.Person;

public class SetGetMain {

	public static void main(String[] args) {
		//Person객체 이용하기
		Person p = new Person(String id, String pw, String name, int age, String mail);
		
		System.out.println();
		//p.name; //(String name, int age, String phone, double height, String address) -> 접근하는 방법 만들어줘야 함.
		// 메소드로 접근하게 만들어줌 -> setter, getter라고 부름.
		//멤버변수별로 한개씩 존재함.
		
	}

}
