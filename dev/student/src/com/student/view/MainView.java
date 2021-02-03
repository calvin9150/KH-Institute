package com.student.view;

import java.util.Scanner;

import com.student.controller.StudentController;
import com.student.model.vo.Student;

public class MainView {
		
		//����ȭ�� ������ִ� �޼ҵ屸��
		public void mainMenu() {
			Scanner sc = new Scanner(System.in);
			StudentController stc = new StudentController();
			while(true) {
				System.out.println("===== �л� ���� ���α׷� =====");
				System.out.println("1. ��ü �л� ��ȸ");
				System.out.println("2. �л����");
				System.out.println("3. �л������˻�");
				System.out.println("4. �л���������");
				System.out.println("5. �����Է�");
				System.out.println("7. �������");
				System.out.println("0. ���α׷� ����");
				System.out.print("���� : ");
				int cho = sc.nextInt();
				switch(cho) {
					case 1 : stc.searchAll();
					break;
					case 2 : stc.insertStudent();
					break;
					case 3 : stc.searchGender();
					break;
					case 4 : stc.updateStudent();
					break;
					case 5 : stc.inputScore();
					break;
					case 7 : stc.printGrade();
					break;
					case 0 : System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
		}
		
		//����� �Է�ȭ�� ����
		public Student inputData() {
			Scanner sc = new Scanner(System.in);
			System.out.println("=== �л���� ===");
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			char gender = sc.next().charAt(0);
			System.out.print("�ּ� : ");
			sc.nextLine();
			String address = sc.nextLine();
			
			Student s = new Student(name, age, gender, address);
			
			return s;
		}
		
		public Student inputScore() {
			Student s = new Student();
			Scanner sc = new Scanner(System.in);
			System.out.println("=== ���� ��� ===");
			System.out.print("���� : ");
			int kor = sc.nextInt();
			s.setKor(kor);
			System.out.print("���� : ");
			int eng = sc.nextInt();
			s.setEng(eng);
			System.out.print("���� : ");
			int math = sc.nextInt();
			s.setMath(math);
			System.out.print("�ڵ� : ");
			int coding = sc.nextInt();
			s.setCoding(coding);
			
			return s;
		}
		
		public void printMsg(String msg) {
			System.out.println("===== �ý��� �޼��� =====");
			System.out.println(msg);
			System.out.println("=====================");
		}
		
		//���� ����ȭ��
		public char choiceGender() {
			Scanner sc = new Scanner(System.in);
			System.out.println("==== �˻��� ���� ====");
			System.out.print("1. ���� 2. ����");
			int choice = sc.nextInt();
			if(choice==1) return 'M';
			else return 'F';
			//return sc.nextInt()==1?'M':'F';
		}
		
		public Student updateStudent() {
			Scanner sc = new Scanner(System.in);
			Student s = new Student();
			System.out.println("== �л����� ���� ==");
			System.out.print("������ �л� �̸� : ");
			s.setName(sc.next());
			System.out.print("���� : ");
			s.setAge(sc.nextInt());
			System.out.print("�ּ� : ");
			sc.nextLine();
			s.setAddress(sc.nextLine());
			
			return s;
		}

	}
