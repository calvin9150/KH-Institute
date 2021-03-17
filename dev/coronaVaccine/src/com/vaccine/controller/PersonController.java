package com.vaccine.controller;

import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.vaccine.dao.PersonDao;
import com.vaccine.view.MainView;
import com.vaccine.vo.Person;

public class PersonController {
	private PersonDao dao = new PersonDao();
	private MainView view = new MainView();
	
	public void mainMenu() throws Exception{
		view.mainMenu();
	}
	
	public void insultPerson() throws ClassNotFoundException {
		Person person = view.inputData();
		boolean flag = dao.insertPerson(person);
		view.printMsg(flag?"입력성공":"등록실패");
	}
	
	public void searchAll() {
		view.printMsg("등록된 인원의 전체 목록입니다.");
		ArrayList<Person> persons = dao.searchAll();
		System.out.println(persons);
	}
	
	public void fileSave(ArrayList<Person> persons) {
		dao.fileSave(persons);
	}

	public ObjectInputStream fileRead() throws Exception {
		view.printMsg("등록된 인원의 전체 목록입니다.");
		return dao.fileRead();
	}
	
	public void updateCandidates() throws Exception {
		String t = view.updateCandidates();
		boolean flag = dao.updateCandidates(t);
		view.printMsg(flag?"수정 성공":"오류가 발생했습니다. 다시 시도해주세요.");
	}

	public void searchCandidates() throws ClassNotFoundException {
		view.printMsg("우선적인 접종이 필요한 대상자 목록입니다. (우선 접종자 조건 : 65세 이상의 비접종자)");
		dao.searchCandidates();
	}
}
