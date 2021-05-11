package com.poly2.model.vo;

public class Student extends Person{

	private int grade;
	private int group;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	


	public Student(String name, int age, String address, int grade, int group) {
		super(name, age, address);
		this.grade = grade;
		this.group = group;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
	@Override
	public void active() {
		System.out.println(getName()+"은(는) 수업을 듣는 중.....");
	}
	
}
