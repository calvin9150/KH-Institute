package com.inherit.model.vo;

public class Student extends Person {
	
//	private String name;
//	private int age;
//	private char gender;
//	private String address;
//	private int weight;
//	private String phone;
	private int grade;
	private int group;
	private int number;
	
	public Student(){super("�л�", 12, '��', "����", "21312423", 60.1, 160);}
	
	public Student(String name, int age, char gender, String address, String phone, double weight, 
			int height, int grade, int group, int number) {
		super(name, age, gender, address, phone, weight, height);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.address = address;
		this.grade = grade;
		this.group = group;
		this.number = number;
	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//	
//	public char getGender() {
//		return gender;
//	}
//	
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
//	public String getAddress() {
//		return address;
//	}
//	
//	
//
//	public int getWeight() {
//		return weight;
//	}
//
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGroup(int group) {
		this.group = group;
	}
	
	public int getGroup() {
		return group;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	// ��ü�� �����͸� �����ִ� �޼ҵ�
	public String StudentInfo() {
		return super.getName()+"\t"+ super.getAge()+"\t"+super.getGender()+"\t"+super.getAddress()+"\t"+super.getPhone()+"\t"+super.getWeight()+"\t"+
				super.getHeight()+"\t"+grade+"\t"+group+"\t"+number;
	}
	
	//�θ� �޼��� Override �ϱ�
	@Override
	public void infoObject() {
		System.out.println("Student Ŭ���� �Դϴ�.");
	}
	
	@Override
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getAddress()+" "
				+getPhone()+" "+getWeight()+" "+getHeight()+" "+grade+" "+group+" "+number;
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. � �����͸� �������� ���� ��ü�� ������ �� �ΰ�? <- �� �޼ҵ��� ��� ���� ����
		Student s = (Student)obj; // ����ȯ
		if(getName().equals(s.getName())
				&&getAge()==s.getAge()
				&&getAddress().equals(getAddress())) {
			return true;
		} else return false;
		
	}
	
}
