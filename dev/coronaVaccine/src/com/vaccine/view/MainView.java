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
			System.out.println("===== 백신 접종 대상자 관리 프로그램 =====");
			System.out.println("1. 신상 등록");
			System.out.println("2. 신상 수정");
			System.out.println("3. 전체 조회");
			System.out.println("4. 우선 접종 대상자 조회");
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
		System.out.println("======= 신상등록 =======");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별(남성/여성) : ");
		sc.nextLine();
		String gender = sc.nextLine();
		System.out.print("접종 여부(접종/비접종) : ");
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
		System.out.print("수정 대상자의 이름을 입력하세요 : ");
		String target = sc.nextLine();
		return target;
	}
	
	public void printMsg(String msg) {
		System.out.println("--- 시스템 메세지 ---");
		System.out.println(msg);
		System.out.println("-----------------");
	}
}
