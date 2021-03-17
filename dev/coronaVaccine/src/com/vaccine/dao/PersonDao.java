package com.vaccine.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.vaccine.controller.PersonController;
import com.vaccine.vo.Person;

public class PersonDao {
	public static ArrayList<Person> persons;
	
	public boolean insertPerson(Person person) {
		boolean flag = true;
		
		persons = new ArrayList<Person>();
		persons.add(person);
		
		return flag;
	}
	
	public ArrayList<Person> searchAll() {
		
		return persons;
	}
	
	public void fileSave(ArrayList<Person> persons) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"))){
			oos.writeObject(persons);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ObjectInputStream fileRead() throws ClassNotFoundException {
		PersonController pc = new PersonController();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
			persons = (ArrayList<Person>) ois.readObject();
			for(int i=0; i<persons.size();i++) {
				System.out.println(persons.get(i));
			}
		} catch (IOException e) {
			System.out.println("��ϵ� ������ �����ϴ�.");
		}
		return null;
	} 
	
	public ArrayList<Person> fileReadNonPrint() throws ClassNotFoundException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
			persons = (ArrayList<Person>) ois.readObject();
		} catch (IOException e) {
	} 
		return persons;
	}
	
	public boolean updateCandidates(String t) throws Exception {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
			persons = (ArrayList<Person>) ois.readObject();
		} catch (IOException e) {
		}
		Scanner sc = new Scanner(System.in);
		Iterator<Person> it = persons.iterator();
		PersonController pc = new PersonController();
		Person p = new Person();
		while(it.hasNext()) {
			p = it.next();
				if(p.getName().equals(t)) {
					System.out.print("������ �̸� : ");
					p.setName(sc.next());
					System.out.print("������ ���� : ");
					p.setAge(sc.nextInt());
					System.out.print("������ ����(����/����) : ");
					p.setGender(sc.next());
					System.out.print("������ ��������(����/������) : ");
					p.setVaccination(sc.next());
					pc.fileSave(persons);
					return true;
				}
			}
		return false;
	}

	public void searchCandidates() throws ClassNotFoundException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"))){	
			persons = (ArrayList<Person>) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Person p : persons) {
			if(p.getAge()>=65&&p.getVaccination().equals("������")) {
				System.out.println(p.toString());
			}
		}
	}

}
