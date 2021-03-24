package com.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.member.model.vo.Member;

public class MemberDao {

	public List<Member> selectAll() {
		Connection con = null;
		PreparedStatement state = null;
		ResultSet rs = null;
		
		List<Member> list = new ArrayList();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");
			System.out.println("DB접속 성공");
			String sql = "SELECT * FROM MEMBER";
			state = con.prepareStatement(sql);
			
			
			while(rs.next()) {
				Member m = new Member();
				m.setMemberId(rs.getString("member_id"));
				m.setMemberPwd(rs.getString("member_pwd"));
				m.setMemberName(rs.getString("member_name"));
				m.setGender(rs.getString("gender"));
				m.setAge(rs.getInt("age"));
				m.setEmail(rs.getString("email"));
				m.setPhone(rs.getString("phone"));
				m.setAddress(rs.getString("address"));
				m.setHobby(rs.getString("hobby"));
				m.setEnrollDate(rs.getDate("enroll_date"));
				list.add(m);
			}
			
			rs = state.executeQuery(sql);
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null&&!rs.isClosed())rs.close();
				if(state!=null&&!state.isClosed())state.close();
				if(con!=null&&!con.isClosed())con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}
	
}
