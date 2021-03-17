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
		view.printMsg(flag?"�Է¼���":"��Ͻ���");
	}
	
	public void searchAll() {
		view.printMsg("��ϵ� �ο��� ��ü ����Դϴ�.");
		ArrayList<Person> persons = dao.searchAll();
		System.out.println(persons);
	}
	
	public void fileSave(ArrayList<Person> persons) {
		dao.fileSave(persons);
	}

	public ObjectInputStream fileRead() throws Exception {
		view.printMsg("��ϵ� �ο��� ��ü ����Դϴ�.");
		return dao.fileRead();
	}
	
	public void updateCandidates() throws Exception {
		String t = view.updateCandidates();
		boolean flag = dao.updateCandidates(t);
		view.printMsg(flag?"���� ����":"������ �߻��߽��ϴ�. �ٽ� �õ����ּ���.");
	}

	public void searchCandidates() throws ClassNotFoundException {
		view.printMsg("�켱���� ������ �ʿ��� ����� ����Դϴ�. (�켱 ������ ���� : 65�� �̻��� ��������)");
		dao.searchCandidates();
	}
}
