package com.poly2.run;

import com.poly2.model.vo.Person;
import com.poly2.model.vo.Student;
import com.poly2.model.vo.Teacher;

public class Main {
	
	public static void main(String[] args) {
		
		//�߻�Ŭ������ ��ü���� �Ұ���!
		//Person p = new Person() -> error!
		//������ �ݵ�� ��ӹ޾Ƽ� �����ؾ� ��.
		Student s = new Student("jang", 29, "seolu", 1,11);
		System.out.println(s.getName()+s.getAge()+s.getAddress()+s.getGrade()+s.getGroup());
		s.active();
		
		Teacher t = new Teacher("gom", 29, "seolu", "java","math");
		System.out.println(t.getName()+t.getAge()+t.getAddress()+t.getMajor()+t.getJob());
		t.active();
		
		//�߻�Ŭ������ ���� Ÿ������ ����� ����
		Person p = s;
		((Student)p).getAge();
		

		
	}
	
}
