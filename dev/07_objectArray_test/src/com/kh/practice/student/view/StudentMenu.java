package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	
	StudentController SC = new StudentController();
	
	public StudentMenu() {
		System.out.println("======== �л� ���� ��� ========");
		SC.printStudent();
		for(int i=0; i<SC.printStudent().length; i++) {
			System.out.println(SC.printStudent()[i].inform());
		}
		System.out.println("======== �л� ���� ��� ========");
		SC.sumScore();
		System.out.println("�л� ���� �հ� : "+SC.sumScore());
		SC.avgScore();
		System.out.println("�л� ���� ��� : "+SC.avgScore()[1]);
		System.out.println("======== ���� ��� ��� ========");
		for(int i=0; i<SC.printStudent().length; i++) {
			if(SC.printStudent()[i].getScore()>=SC.CUT_LINE) {
				System.out.println(SC.printStudent()[i].getName()+"�л��� ����Դϴ�.");
			} else {
				System.out.println(SC.printStudent()[i].getName()+"�л��� ����� ����Դϴ�.");
			}
		}
	}
}
