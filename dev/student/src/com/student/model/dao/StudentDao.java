package com.student.model.dao;

import com.student.model.vo.Student;

public class StudentDao {
	// ���α׷����� �����ϴ� ������ ���� ����
	private Student s1;
	private Student s2;
	private Student s3;
	private Student s4;
	private Student s5;
	
	//�Ű������� ���޵� ���� �����(�������)�� �����ϴ� ���
	public boolean insertStudent(Student s) {
		boolean flag = true;
		//1.����ִ� ������ ã�Ƽ� ����
		
		if(s1==null) {
			s1 = s;
		} else if(s2 == null) {
			s2 = s;
		} else if(s3 == null) {
			s3 = s;
		} else if(s4 == null) {
			s4 = s;
		} else if(s5 == null) {
			s5 = s;
		} else {
			//���� ������� ����
			flag = false;
		}
		System.out.println(flag);

		return flag;
		
	}
	
	
	public String searchAll() {
		//��������� �ִ� �����͸� ��ȯ
		//��������� ���� ������ ��ȯ����
		String students="";
		if(s1!=null) {
			students+=s1.studentInfo()+"\n";
		}
		if (s2!=null) {
			students+=s2.studentInfo()+"\n";
		}
		if (s3!=null) {
			students+=s3.studentInfo()+"\n";
		}
		if (s4!=null) {
			students+=s4.studentInfo()+"\n";
		}
		if (s5!=null) {
			students+=s5.studentInfo()+"\n";
		}
		return students;
	}
	
	public String searchGender(char gender) {
		String students = "";
		if(s1!=null&&s1.getGender()==gender) {
			students+=s1.studentInfo()+"\n";
		}
		if(s2!=null&&s2.getGender()==gender) {
			students+=s2.studentInfo()+"\n";
		}
		if(s3!=null&&s3.getGender()==gender) {
			students+=s3.studentInfo()+"\n";
		}
		if(s4!=null&&s4.getGender()==gender) {
			students+=s4.studentInfo()+"\n";
		}
		if(s5!=null&&s5.getGender()==gender) {
			students+=s5.studentInfo()+"\n";
		}
		return students;
	}

	public boolean updateStudent(Student s) {
		boolean flag = true;
		if(s1!=null&&s1.getName().equals(s.getName())) {
			s1.setAge(s.getAge());
			s1.setAddress(s.getAddress());
		}
		else if(s2!=null&&s2.getName().equals(s.getName())) {
			s2.setAge(s.getAge());
			s2.setAddress(s.getAddress());
		}
		else if(s3!=null&&s3.getName().equals(s.getName())) {
			s3.setAge(s.getAge());
			s3.setAddress(s.getAddress());
		}
		else if(s4!=null&&s4.getName().equals(s.getName())) {
			s4.setAge(s.getAge());
			s4.setAddress(s.getAddress());
		}
		else if(s5!=null&&s5.getName().equals(s.getName())) {
			s5.setAge(s.getAge());
			s5.setAddress(s.getAddress());
		} else {
			flag = false;
		}
		return flag;
	}
}
