package com.poly2.model.vo;

public class Teacher extends Person{

	private String major;
	private String job;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}


	public Teacher(String name, int age, String address, String major, String job) {
		super(name, age, address);
		this.major = major;
		this.job = job;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public void active() {
		System.out.println(getName()+"은(는) 수업 중.....");
	}
	
}
