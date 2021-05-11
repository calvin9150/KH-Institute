package com.inherit.model.vo;

import java.util.Objects;

public class Employee extends Person {

//	private String name;
//	private int age;
//	private char gender;
//	private String addr;
//	private String phone;
//	private int weight;
	private String department;
	private String job;
	private int salary;
	
	//ctrl+space+enter : 기본생성자 생성
	public Employee() {
		super("일꾼", 55, '남', "대만", "21312423", 100.1, 190);
	}
	
	//alt+s+a+g  : 매개변수 있는 생성자 생성
	
	public Employee(String name, int age, char gender, String address, String phone, double weight, int height, 
			String department, String job, int salary) {
		super(name, age, gender, address, phone, weight, height);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.addr = addr;
		this.department = department;
		this.job = job;
		this.salary = salary;
	}

	//alt+s+r+a+r : 세터게터 생성
	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public char getGender() {
//		return gender;
//	}
//
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
//
//	public String getAddr() {
//		return addr;
//	}
//
//	public void setAddr(String addr) {
//		this.addr = addr;
//	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String StudentInfo() {
		return super.getName()+"\t"+ super.getAge()+"\t"+super.getGender()+"\t"+super.getAddress()+"\t"+super.getPhone()+"\t"+super.getWeight()+"\t"+
				super.getHeight()+"\t"+department+"\t"+job+"\t"+salary;
	}
	
	@Override
	public void infoObject() {
		System.out.println("Employee 클래스입니다");
	}
	
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+getAddress()+" "
				+getPhone()+" "+getWeight()+" "+getHeight()+" "+department+" "+job+" "+salary;
	}
	@Override
	public boolean equals(Object obj) {
		Employee s = (Employee)obj;
		if(getName().equals(s.getName())
			&&getAge()==s.getAge()
			&&getGender()==s.getGender()) {
			return true;
		} else return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(), getAge(), getAddress());
	}
	
	
}


