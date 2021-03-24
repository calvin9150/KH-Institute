package com.member.controller;

import java.util.List;
import java.util.Map;

import com.member.model.vo.Member;
import com.member.service.MemberService;
import com.member.view.MainView;

public class MemberController {

	private MainView view; 
	private MemberService service=new MemberService();
	
	public void mainMenu() {
		view=new MainView();
		view.mainMenu(this);
	}
	
	public void searchAll() {
		List<Member> list = MemberService.searchAll();
		
		view.printMembers(list);
		
	}

	public void searchColVal() {
		Map<String,String> param = view.inputColVal();
		List<Member> list = service.searchColVal(param);
		view.printMembers(list);
	}

}
