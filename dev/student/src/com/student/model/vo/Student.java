package com.student.model.vo;

public class Student {
	//학생정보를 저장하는 객체
	private String name; // 학생이름, 2글자 이상
	private int age;
	private char gender;
	private String address;
	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	public Student() {}
	
	public Student(String name, int age, char gender, String address) {
		//매개변수있는 생성자로 매개변수에 있는 값을 멤버변수에 대입하는 것.
		this.name = name; //this는 이 객체를 가르킴.
		this.age = age;
		this.gender = gender;
		this.address = address;
		
	}
	
	public void setName(String name) { //1교시 34분 참조
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setKor (int kor) {
		this.kor = kor;
	}
	
	public int kor( ) {
		return kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setCoding(int coding) {
		this.coding = coding;
	}
	
	public int getCoding() {
		return coding;
	}
	
	//학생정보를 모두 출력하는 메소드 구현하기
	//항목간격은 \t 출력하고 값은 String 으로 반환하는 메소드임.
	//studentInfo()
	
	public String studentInfo() {
		return name+"\t"+age+"\t"+gender+"\t"+address+"\t"
				+kor+"\t"+eng+"\t"+math+"\t"+coding;
	}
	
	
}
