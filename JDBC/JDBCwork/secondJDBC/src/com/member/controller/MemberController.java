package com.member.controller;

import java.util.List;
import java.util.Map;

import com.member.model.dao.MemberDao;
import com.member.model.vo.Member;
import com.member.view.MainView;

//view, dao클래스를 관리하는 역할
//서비스에 따라 필요한 객체의 기능을 호출하는 역할을 함.
public class MemberController {
	
	private MemberDao dao=new MemberDao();
	
	public void mainMenu() {
		new MainView().mainMenu();
	}
	
	public void selectAll() {
		//DB student계정 member테이블의 모든 테이터를 가져오는 서비스(기능)
		List<Member> list=dao.selectAll();
		
		//출력하는 메소드 추가해서 결과를 출력하는 로직구성하기
		new MainView().printMembers(list);
		
		
	}
	
	public void searchName() {
		//이용자에게 검색할 이름 값을 받아와야함. -> 화면에서 입력 -> view
		//이용자가 입력한 값을 가지고 DB의 student계정의 member테이블의
		// member_name컬럼에 부분일치하는 값이 있는지 조회하고 결과를 가져와서 
		// ->DB접속! -> Dao
		// 이용자에게 검색한 데이터를 출력해줌. -> view
		String name=new MainView().inputData();
		
		List<Member> list=dao.searchName(name);
		
		new MainView().printMembers(list);
		
		
	}
	

	public void insertMember() {
		//사용자에게 회원에 대한 정보를 입력받고 - view
		Member m=new MainView().insertMember();		
		//그 정보를 DB student계정 member테이블에 삽입하고 - dao
		int result=dao.insertMember(m);
		
		//그 결과를 출력해주기 - view
		new MainView().printMsg(result>0?"입력성공":"입력실패");
		
		
	}
	
	
	
	public void searchColName() {
		//검색할 columnname, 값을 입력받아 
		Map<String,String> param=new MainView().inputColVal();
		//DB에서 조회하고 그결과를 반환해주는 서비스
		List<Member> result=dao.searchColName(param);
		
		new MainView().printMembers(result);
		
	}
	
	
	public void updateMember() {
		//DB에 row지정해서  지정한 row의 값을 수정!
		// 수정할 데이터받고, 지정할 데이터(where절에 들어갈 데이터)-> pk
		
		Member m=new MainView().updateMember();
		
		int result=dao.updateMember(m);
		
		new MainView().printMsg(result>0?"수정성공":"수정실패");
		
		
		
		
	}
	
	
	
}









