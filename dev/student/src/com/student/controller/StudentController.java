package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {

	private StudentDao dao = new StudentDao();
	private MainView view = new MainView();
	
	public void mainMenu() {
		//����ȭ���� ȣ�����ִ� ���
		view.mainMenu();
	}
	
	public void insertStudent() {
		//����ڰ� �Է��� �����͸� dao ��������� ����
		//1. ����ڿ��Լ� ������ �Է¹�������? -> �Է�ȭ�� ���
		Student s = view.inputData(); // �Է� ��û���� mainview �� �����̹Ƿ�..
		//2. ȭ�鿡�� �޾ƿ� ���� dao�� ����ҿ� ����
		boolean flag = dao.insertStudent(s);
		//student �������� ���� �޼��� ��� ��Ű��
		view.printMsg(flag?"�Է¼���":"��Ͻ���");
	}
	
	public void searchAll() {
		//dao ��������� �ִ� �� ����ϱ�
		String students = dao.searchAll();
		view.printMsg(students.equals("")?"����� �����Ͱ� �����ϴ�":students);
	}
	
	public void searchGender() {
		//1. ������ �������� �л��� ��ȸ
		char gender = view.choiceGender();
		String students = dao.searchGender(gender);
		view.printMsg(students.equals("")?"��ȸ�� �����Ͱ� �����ϴ�.":students);
	}
	
	public void updateStudent() {
		//1. ����ȭ�� ���
		searchAll();
		Student s = view.updateStudent();
		boolean flag = dao.updateStudent(s);
		view.printMsg(flag?"��������":"��������");
	}
}
