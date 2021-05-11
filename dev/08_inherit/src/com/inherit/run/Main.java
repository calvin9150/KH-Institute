package com.inherit.run;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		Employee e = new Employee();
		

		// Person�� ��ӹ޾� Person �� �����ִ� name�� ���
		System.out.println(s.getName());
		// Person�� ��ӹ޾� Person �� �����ִ� name�� ���
		System.out.println(e.getName());
		
		Student s1 = new Student("gom", 22, 'M', "korea", "2214234", 90, 170, 2, 10, 21); // Student �Ű����� ������ ����
		System.out.println(s1.getName()+" "+s1.getGender());
		
		Student s2 = new Student(); // Student �⺻������ ����
		
		Employee e1 = new Employee("�뵿��", 22, 'M', "����", "32213123", 60, 160, "�λ��", "�λ����", 2000);
		Employee e2 = new Employee("�뵿��", 22, 'M', "����", "32213123", 60, 160, "�λ��", "�λ����", 2000);
		
		System.out.println(s2.getName());
		System.out.println(s2.StudentInfo());
		
//		s1.infoObject();
//		s.infoObject();
//		e.infoObject();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = new Student("gom", 22, 'M', "korea", "2214234", 90, 170, 2, 10, 21);
		
		//Student ��ü�� �� ��� �񱳸� ���ؼ� (object Ŭ������) equals �������̵� �ʿ�
		// 
		
		System.out.println("equals : "+s1 .equals(s3));
		System.out.println("equals : "+e1 .equals(e2));
	}

}
