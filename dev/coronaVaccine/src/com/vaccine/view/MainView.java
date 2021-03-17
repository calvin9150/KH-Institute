package com.vaccine.view;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.vaccine.controller.PersonController;
import com.vaccine.vo.Person;

public class MainView {
	ArrayList<Person> persons = new ArrayList<Person>();
	
	public void mainMenu() throws Exception {
		Scanner sc = new Scanner(System.in);
		PersonController pc = new PersonController();
		
		do {
			System.out.println("===== ��� ���� ����� ���� ���α׷� =====");
			System.out.println("1. �Ż� ���");
			System.out.println("2. �Ż� ����");
			System.out.println("3. ��ü ��ȸ");
			System.out.println("4. �켱 ���� ����� ��ȸ");
			int cho = sc.nextInt();
			switch(cho) {
			case 1 : pc.insultPerson();
			break;
			case 2 : pc.updateCandidates();
			break;
			case 3 : pc.fileRead();
			break;
			case 4 : pc.searchCandidates();
			} 
		} while(true);
	}
	
	public Person inputData() throws ClassNotFoundException {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
				persons = (ArrayList<Person>) ois.readObject();
			} catch (IOException e) {
		} 
		Scanner sc = new Scanner(System.in);
		PersonController pc = new PersonController();
		System.out.println("======= �Ż��� =======");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("����(����/����) : ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.print("���� ����(����/������) : ");
		String vaccination = sc.nextLine();
		Person person = new Person(name, age, gender, vaccination);
		persons.add(person);
		pc.fileSave(persons);
		return person;
	}
	/*
	public void readFile() throws ClassNotFoundException {
		PersonController pc = new PersonController();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
			persons = (ArrayList<Person>) ois.readObject();
			for(int i=0; i<persons.size();i++) {
				System.out.println(persons.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	*/
	public String updateCandidates() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������� �̸��� �Է��ϼ��� : ");
		String target = sc.nextLine();
		return target;
	}
	
	public void printMsg(String msg) {
		System.out.println("--- �ý��� �޼��� ---");
		System.out.println(msg);
		System.out.println("-----------------");
	}
}
