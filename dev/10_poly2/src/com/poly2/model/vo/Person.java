package com.poly2.model.vo;

public abstract class Person { // �߻�Ŭ����
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
	
	//���������� ������ �޼ҵ带 �����ϰ� �� �� ����ϴ� �� -> �߻�޼ҵ�
	// �� �� ��ü���� �����Ǵ� ������ �ٸ� ��.
	//�߻�ȭ �޼���� �ݵ�� �����ο��� ������ ����� ��. 
	//�� �׷��Ƿ� Person�� ����� Ŭ�������� �ؿ� active() �޼��带 ������ Override �����ؾ� ��. �ȱ׷��� error!
	public abstract void active();
	
	
}
