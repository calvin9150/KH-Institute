package com.obj.model.vo;

public class MemberVariable {
	//������� �����ϱ�
	//Ŭ���� �߰�ȣ ���ο� -> ���������� �ڷ��� ������;
	public String name="jang";
	static int age;
	public String game;
	public double height;
	
	public final int MYAGE;
	private static int count=0;
	public static int memberId=0;
	public static double bonus;
	
	
	//�ʱ�ȭ��� : ��������� ���� �ʱⰪ�� ������ �� ����ϴ� ��
	{//�ν��Ͻ� �ʱ�ȭ ���
		// new �����ڷ� Ŭ������ ������ �� ���� �����.
		name="GOM";
		age=27;
		height=170.5;
		MYAGE=19;
		if(bonus==0.0) {
			bonus=2.0;
		}
		memberId=++count;
	}
	static {
		//static���� ����� ������ �ʱ�ȭ�ϴ� ��
		//����
		//���α׷� ����� �� �ѹ� ����ǰ� �� �������� �ȵ� 
		count = 100; //static ����
		bonus = 22; //static ���� ��, class����
		age = 50; //�������
	}
	
	public void test() {
		//Ŭ���� ���ο����� ���ٿ����� ���� ���
		
	}
}
