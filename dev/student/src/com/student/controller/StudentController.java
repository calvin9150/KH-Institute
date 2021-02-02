package com.student.controller;

import com.student.model.dao.StudentDao;
import com.student.model.vo.Student;
import com.student.view.MainView;

public class StudentController {

	private StudentDao dao = new StudentDao();
	private MainView view = new MainView();
	
	public void mainMenu() {
		//메인화면을 호출해주는 기능
		view.mainMenu();
	}
	
	public void insertStudent() {
		//사용자가 입력한 데이터를 dao 멤버변수에 저장
		//1. 사용자에게서 테이터 입력받으려면? -> 입력화면 출력
		Student s = view.inputData(); // 입력 요청문은 mainview 의 역할이므로..
		//2. 화면에서 받아온 값을 dao의 저장소에 저장
		boolean flag = dao.insertStudent(s);
		//student 저장결과에 따라 메세지 출력 시키기
		view.printMsg(flag?"입력성공":"등록실패");
	}
	
	public void searchAll() {
		//dao 멤버변수에 있는 값 출력하기
		String students = dao.searchAll();
		view.printMsg(students.equals("")?"저장된 데이터가 없습니다":students);
	}
	
	public void searchGender() {
		//1. 성별을 기준으로 학생을 조회
		char gender = view.choiceGender();
		String students = dao.searchGender(gender);
		view.printMsg(students.equals("")?"조회된 데이터가 없습니다.":students);
	}
	
	public void updateStudent() {
		//1. 수정화면 출력
		searchAll();
		Student s = view.updateStudent();
		boolean flag = dao.updateStudent(s);
		view.printMsg(flag?"수정성공":"수정실패");
	}
}
