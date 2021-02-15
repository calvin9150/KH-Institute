package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	
	StudentController SC = new StudentController();
	
	public StudentMenu() {
		System.out.println("======== 학생 정보 출력 ========");
		SC.printStudent();
		for(int i=0; i<SC.printStudent().length; i++) {
			System.out.println(SC.printStudent()[i].inform());
		}
		System.out.println("======== 학생 성적 출력 ========");
		SC.sumScore();
		System.out.println("학생 점수 합계 : "+SC.sumScore());
		SC.avgScore();
		System.out.println("학생 점수 평균 : "+SC.avgScore()[1]);
		System.out.println("======== 성적 결과 출력 ========");
		for(int i=0; i<SC.printStudent().length; i++) {
			if(SC.printStudent()[i].getScore()>=SC.CUT_LINE) {
				System.out.println(SC.printStudent()[i].getName()+"학생은 통과입니다.");
			} else {
				System.out.println(SC.printStudent()[i].getName()+"학생은 재시험 대상입니다.");
			}
		}
	}
}
