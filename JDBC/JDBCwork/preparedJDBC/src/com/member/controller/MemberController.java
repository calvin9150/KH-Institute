package com.member.controller;

import java.util.List;

import com.member.model.dao.MemberDao;
import com.member.model.vo.Member;
import com.member.view.MainView;

public class MemberController {

	private MemberDao dao = new MemberDao();
	private MainView mv = new MainView();

	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	public void selectAll() {
		List<Member> list = dao.selectAll();
		
		mv.printMembers(list);
		
	}

}
