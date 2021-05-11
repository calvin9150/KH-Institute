package com.obj.model.vo;

public class Person {

	private String name;
	private String id;
	private String pw;
	private int age;
	private String mail;

	
	public Person() {}
	
	public Person(String id, String pw, String name, int age, String mail) {
		this.name = name;
		this.pw = pw;
		this.id = id;
		this.age = age;
		this.mail = mail;

	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPW(String pw) {
		this.pw =pw;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setmail(String mail) {
		this.mail = mail;
	}
	
	public String getmail() {
		return mail;
	}
	
	
}
