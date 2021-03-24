package com.member.view;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.member.controller.MemberController;
import com.member.model.vo.Member;

public class MainView {
	
	private MemberController mc;

	public void mainMenu(MemberController mc) {
		this.mc = mc;
		//this.mc=new MemberController();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("===== 회원관리프로그램 =====");
			System.out.println("1. 전체회원조회");
			System.out.println("2. 항목별 조회");
			System.out.println("3. 아이디로 조회");
			System.out.println("4. 회원등록");
			System.out.println("5. 회원수정");
			System.out.println("6. 회원삭제");
			System.out.println("0. 프로그램종료");
			System.out.print("입력 : ");
			
			switch(sc.nextInt()) {
				case 0 : System.out.println("프로그램을 종료합니다."); return;
				case 1 : mc.searchAll();break;
				case 2 : mc.searchColVal();break;
				case 4 : break;
			}
		}
	}
	
	public void printMembers(List<Member> list) {
		System.out.println("===== 조회한 결과 =====");
		for(Member m : list) {
			System.out.println(m);
		}
	}

	public Map<String,String> inputColVal() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 항목, 검색어 입력 =====");
		System.out.print("검색할 항목 : ");
		String col = sc.nextLine();
		System.out.println("검색할 내용 : ");
		String keyword = sc.nextLine();
		Map<String, String> param = new HashMap();
		param.put("col", col);
		param.put("key", keyword);
		
		return param;
	}
}
