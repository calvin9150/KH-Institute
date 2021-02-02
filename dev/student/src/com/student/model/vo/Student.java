package com.student.model.vo;

public class Student {
	//�л������� �����ϴ� ��ü
	private String name; // �л��̸�, 2���� �̻�
	private int age;
	private char gender;
	private String address;
	private int kor;
	private int eng;
	private int math;
	private int coding;
	
	public Student() {}
	
	public Student(String name, int age, char gender, String address) {
		//�Ű������ִ� �����ڷ� �Ű������� �ִ� ���� ��������� �����ϴ� ��.
		this.name = name; //this�� �� ��ü�� ����Ŵ.
		this.age = age;
		this.gender = gender;
		this.address = address;
		
	}
	
	public void setName(String name) { //1���� 34�� ����
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
	
	//�л������� ��� ����ϴ� �޼ҵ� �����ϱ�
	//�׸񰣰��� \t ����ϰ� ���� String ���� ��ȯ�ϴ� �޼ҵ���.
	//studentInfo()
	
	public String studentInfo() {
		return name+"\t"+age+"\t"+gender+"\t"+address+"\t"
				+kor+"\t"+eng+"\t"+math+"\t"+coding;
	}
	
	
}
