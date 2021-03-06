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
	
	public void insultPerson() {
		Person person = view.inputData();
		boolean flag = dao.insertPerson(person);
		view.printMsg(flag?"입력성공":"등록실패");
	}
	
	public void searchAll() {
		ArrayList<Person> persons = dao.searchAll();
		System.out.println(persons);
	}
	
	public void fileSave(ArrayList<Person> persons) {
		dao.fileSave(persons);
	}

	public ObjectInputStream fileRead() throws Exception {
		return dao.fileRead();
	}
}
