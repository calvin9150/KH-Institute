package com.poly2.run;

import com.poly2.model.vo.Person;
import com.poly2.model.vo.Student;
import com.poly2.model.vo.Teacher;

public class Main {
	
	public static void main(String[] args) {
		
		//추상클래스는 자체생성 불가능!
		//Person p = new Person() -> error!
		//때문에 반드시 상속받아서 생성해야 함.
		Student s = new Student("jang", 29, "seolu", 1,11);
		System.out.println(s.getName()+s.getAge()+s.getAddress()+s.getGrade()+s.getGroup());
		s.active();
		
		Teacher t = new Teacher("gom", 29, "seolu", "java","math");
		System.out.println(t.getName()+t.getAge()+t.getAddress()+t.getMajor()+t.getJob());
		t.active();
		
		//추상클래스도 변수 타입으로 사용은 가능
		Person p = s;
		((Student)p).getAge();
		

		
	}
	
}
