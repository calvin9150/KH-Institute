package com.obj.model.vo;

public class ConstructorTest {

	//�������
	public int age;
	public String nickName;
	public int tea;
	
	
	//������
	//���������� Ŭ������(){����}
	//�����ڴ� �Ϲ������� public
	//�� private, default�� ����Ǹ� �ܺ� ��Ű������ Ŭ������ ������� ����
	public ConstructorTest() {} // �⺻������(default������)
	
	//����޼ҵ�
	//�Ű����� �ִ� ������
	public ConstructorTest(int age, String nickName, int tea) {
		
		this.age=age;
		this.nickName=nickName;
		this.tea=tea;
	}
	
	public ConstructorTest(String nickname) {
		this(19,"das",22);
	}
}
