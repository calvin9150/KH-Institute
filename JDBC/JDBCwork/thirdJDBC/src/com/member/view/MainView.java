package com.member.view;

import java.util.List;
import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {
	
	private MemberController mc;
	
	public void mainMenu(MemberController mc) {
		this.mc=mc;
		//this.mc=new MemberController();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("===== 회원관리프로그램 v.2 ======");
			System.out.println("1. 전체회원조회");
			System.out.println("2. 이름으로 조회");
			System.out.println("3. 아이디로 조회");
			System.out.println("4. 회원등록");
			System.out.println("5. 회원수정");
			System.out.println("6. 회원삭제");
			System.out.println("0. 프로그램종료");
			System.out.print("입력 : ");
			
			switch(sc.nextInt()) {
				case 0 : System.out.println("프로그램을 종료합니다.");break;
				case 1 : this.mc.searchAll();break;
				case 4 : this.mc.insertMember();break;
			}
		}
	}
	
	public void printMembers(List<Member> list) {
		System.out.println("===== 조회한 결과 =====");
		for(Member m : list) {
			System.out.println(m);
		}
	}
	
	
	public Member insertMember() {
		Scanner sc=new Scanner(System.in);
		System.out.println("===== 회원 등록 =====");
		System.out.print("회원아이디 : ");
		Member m=new Member();
		m.setMemberId(sc.nextLine());
		System.out.print("회원비밀번호 : ");
		m.setMemberPwd(sc.nextLine());
		System.out.print("회원이름 : ");
		m.setMemberName(sc.nextLine());
		System.out.print("성별 : ");
		m.setGender(sc.nextLine());
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		sc.nextLine();
		System.out.print("이메일 : ");
		m.setEmail(sc.nextLine());
		System.out.print("전화번호 : ");
		m.setPhone(sc.nextLine());
		System.out.print("주소 : ");
		m.setAddress(sc.nextLine());
		System.out.print("취미 : ");
		m.setHobby(sc.nextLine());
		
		return m;
		
	}
	
	
	public void printMsg(String msg) {
		System.out.println("======= 시스템 알림 =========");
		System.out.println(msg);
		System.out.println("===========================");
	}
}










