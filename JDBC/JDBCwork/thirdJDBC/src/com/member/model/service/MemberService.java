package com.member.model.service;

import java.sql.Connection;
import java.util.List;

import com.member.common.JDBCTemplate;
import com.member.model.dao.MemberDao;
import com.member.model.vo.Member;

//DB접속을 위한 Connection 객체를 관리하는 역할
//Connection객체를 생성하는 기능(매소드) 공용으로 관리하겠음. ->JDBCTemplate객체에서 메소드로 가져옴
//Connection가져와서 Dao에 전달하여 전달된 DB로 접속해서 SQL문 실행하게 하는 역할
public class MemberService {
	
	private MemberDao dao=new MemberDao();
	
	public List<Member> searchAll(){
		//1. Connection객체 생성
		Connection conn=JDBCTemplate.getConnection();
		List<Member>list = dao.searchAll(conn);
		//만약 dao실행한 sql구문이 insert, update, delete문이면 
		//트렌젝션처리까지 진행.
		//Connection객체를 반환해줌.
		JDBCTemplate.close(conn);
		return list;
		
	}
	
	
	public int insertMember(Member m) {
		Connection conn=JDBCTemplate.getConnection();
		
		int result=dao.insertMember(conn, m);
		
		//insert,update, delete문은 트렌젝션처리해야함.
		if(result>0) JDBCTemplate.commit(conn);
		else JDBCTemplate.rollback(conn);
		
		JDBCTemplate.close(conn);
		
		return result;
		
		
	}
	
	
	
	
	
	
	
}
