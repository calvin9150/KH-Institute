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
			System.out.println("1. ����� ��ü ��ȸ");
			System.out.println("2. �Ż� ���");
			int cho = sc.nextInt();
			switch(cho) {
			case 1 : pc.searchAll();
			break;
			case 2 : pc.insultPerson();
			break;
			case 3 : readFile();
			break;
			} 
		} while(true);
	}
	
	public Person inputData() {
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
	
	public void printMsg(String msg) {
		System.out.println("--- �ý��� �޼��� ---");
		System.out.println(msg);
		System.out.println("-----------------");
	}
}
