package com.member.service;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import com.member.common.JDBCTemplate;
import com.member.model.dao.MemberDao;
import com.member.model.vo.Member;

public class MemberService {
	
	private static MemberDao dao=new MemberDao();
	
	public static List<Member> searchAll(){
		//1. Connection객체 생성
		Connection conn=JDBCTemplate.getConnection();
		List<Member>list = dao.searchAll(conn);
		//만약 dao실행한 sql구문이 insert, update, delete문이면 
		//트렌젝션처리까지 진행.
		//Connection객체를 반환해줌.
		JDBCTemplate.close(conn);
		return list;
		
	}

	public List<Member> searchColVal(Map<String, String> param) {
		// Connection 과 트랜젝션 관리 (commit, rollback)
		
		Connection conn = JDBCTemplate.getConnection();
		List<Member> list = dao.searchColVal(conn, param);
		JDBCTemplate.close(conn);
		return list;
		
	}
}
