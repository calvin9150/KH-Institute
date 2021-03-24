package com.member.controller;

import java.util.List;

import com.member.model.service.MemberService;
import com.member.model.vo.Member;
import com.member.view.MainView;

public class MemberController {

	private MainView view; 
	private MemberService service=new MemberService();
	
	public void mainMenu() {
		view=new MainView();
		view.mainMenu(this);
	}
	
	public void searchAll() {
		
		List<Member> list=service.searchAll();
		
		view.printMembers(list);
		
	}
	
	
	public void insertMember() {
		Member m=view.insertMember();
		
		int result=service.insertMember(m);
		
		view.printMsg(result>0?"회원등록성공":"회원등록 실패");
		
		
	}
	
}









