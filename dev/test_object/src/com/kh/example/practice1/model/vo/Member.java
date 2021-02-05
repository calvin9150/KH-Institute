package com.kh.example.practice1.model.vo;

import java.util.*;

public class Member {
	Scanner sc = new Scanner(System.in);
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {};
	
	public void changeName() {
		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		this.memberName = name;
		printName();
	}
	
	public void printName() {
		System.out.print("이름 : ");
		System.out.println(this.memberName);
	}
	
	
}
