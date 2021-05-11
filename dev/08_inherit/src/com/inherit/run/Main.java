package com.inherit.run;

import com.inherit.model.vo.Employee;
import com.inherit.model.vo.Student;

public class Main {

	public static void main(String[] args) {

		Student s = new Student();
		Employee e = new Employee();
		

		// Person을 상속받아 Person 이 갖고있는 name을 사용
		System.out.println(s.getName());
		// Person을 상속받아 Person 이 갖고있는 name을 사용
		System.out.println(e.getName());
		
		Student s1 = new Student("gom", 22, 'M', "korea", "2214234", 90, 170, 2, 10, 21); // Student 매개변수 생성자 생성
		System.out.println(s1.getName()+" "+s1.getGender());
		
		Student s2 = new Student(); // Student 기본생성자 생성
		
		Employee e1 = new Employee("노동자", 22, 'M', "수원", "32213123", 60, 160, "인사과", "인사실장", 2000);
		Employee e2 = new Employee("노동자", 22, 'M', "수원", "32213123", 60, 160, "인사과", "인사실장", 2000);
		
		System.out.println(s2.getName());
		System.out.println(s2.StudentInfo());
		
//		s1.infoObject();
//		s.infoObject();
//		e.infoObject();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = new Student("gom", 22, 'M', "korea", "2214234", 90, 170, 2, 10, 21);
		
		//Student 객체의 값 동등성 비교를 위해선 (object 클래스의) equals 오버라이딩 필요
		// 
		
		System.out.println("equals : "+s1 .equals(s3));
		System.out.println("equals : "+e1 .equals(e2));
	}

}
