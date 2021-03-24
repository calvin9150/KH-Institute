package com.member.view;

import java.util.List;
import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {

	public void mainMenu() {
		MemberController mc = new MemberController();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========== 회원 관리 프로그램 =========");
			System.out.println("1. 전체회원 조회");
			System.out.println("2. 이름으로 조회");
			System.out.println("3. 아이디로 조회");
			System.out.println("4. 회원등록");
			System.out.println("5. 회원정보 수정");
			System.out.println("6. 회원삭제");
			System.out.println("0. 종료");
			
			int cho = sc.nextInt();
			
			switch(cho) {
			case 1 : mc.selectAll(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 0 : System.out.println("프로그램을 종료...."); return;
			}
		}
	}
	
	public void printMembers(List<Member> list) {
		System.out.println("----- 회원 조회 결과 -----");
		if(!list.isEmpty()) {
			for(Member data : list) {
				System.out.println(data);
			}
		} else {
			System.out.println("조회된 결과가 없습니다.");
		}

	}
	
}
