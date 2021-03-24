package com.member.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.member.model.vo.Member;

//dao 애플리케이션에서 사용하는 DB에 접속해서 
//SQL문을 실행하고 그 결과를 반환해주는 역할하는 클래스
public class MemberDao {

	public List<Member> selectAll() {
		//DB접속해서 데이터 가져오기.!
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		List<Member> list=new ArrayList();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"student","STUDENT");
			stmt=conn.createStatement();
			String sql="SELECT * FROM MEMBER";
			rs=stmt.executeQuery(sql);
			//값을 가져오는 로직.
			while(rs.next()) {
				//가져온 resultSet 1개 row 한개 vo 객체
				Member m=new Member();
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
//				new Member(rs.getString("member_id"),,,,)
			}
		}catch(ClassNotFoundException e) {	
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(rs!=null&&!rs.isClosed()) rs.close();
				if(stmt!=null&&!stmt.isClosed()) stmt.close();
				if(conn!=null&&!conn.isClosed()) conn.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;
	
	}

	public List<Member> searchName(String name){
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		List<Member> list=new ArrayList();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
					,"student","STUDENT");
			stmt=conn.createStatement();
			String sql="SELECT * FROM MEMBER WHERE MEMBER_NAME LIKE '%"+name+"%'";
			//SELECT * FROM MEMBER WHERE "+col+" LIKE ?;
			//pstmt.setString(1,col); X
			//pstmt.setString(1,name);
			
			
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Member m=new Member();
				m.setMemberId(rs.getString(1));
				m.setMemberPwd(rs.getString(2));
				m.setMemberName(rs.getString(3));
				m.setGender(rs.getString(4));
				m.setAge(rs.getInt(5));
				m.setEmail(rs.getString(6));
				m.setPhone(rs.getString(7));
				m.setAddress(rs.getString(8));
				m.setHobby(rs.getString(9));
				m.setEnrollDate(rs.getDate(10));
				list.add(m);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null && !rs.isClosed()) rs.close();
				if(stmt!=null && !stmt.isClosed()) stmt.close();
				if(conn!=null && !conn.isClosed()) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public int insertMember(Member m) {
		Connection conn=null;
//		Statement stmt=null;
		//PreparedStatement 인터페이스설계를 함.
		//데이터가 들어가는 곳에 리터러를 신경쓰지말고, 넣자! -> 매소드 통해서 넣자.
		// 데이터가 들어가는 곳에 ?(위치홀더) ?를 매소드를 이용해서 처리
		// ?에 대한 구분은 인덱스로 하자. 1일부터 시작하는.....
		PreparedStatement pstmt=null;
		
		
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"student","STUDENT");
			//트렌젝션 개발자가 직접처리할 수 있도록 설정
			conn.setAutoCommit(false);
			
			//stmt=conn.createStatement();
			//Preparedstatement의 생성은 conn객체의 매소드를 이용해서 한다.
			//conn.prepareStatement("sql구문");생성할때 sql구문을 넣어줘야함.
			
			String sql="INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?,?,?,SYSDATE)";
			//INSERT INTO MEMBER VALUES(?,?,?,SYSDATE,?,to_date(?),SYSTIMESTAMP,?);
			pstmt=conn.prepareStatement(sql);
			//?를 세팅 -> sql문에 ? 표식이 있을때만 세팅, 없으면 그냥 실행할 수 있다.
			//set매소드 문자열 -> pstmt.setString(인덱스,값)
			// 숫자 -> pstmt.setInt(인덱스,값)||pstmt.setDouble(인덱스,값)
			// 날짜 -> pstmt.setDate(인덱스,값)
			pstmt.setString(1, m.getMemberId());
			pstmt.setString(2, m.getMemberPwd());
			pstmt.setString(3, m.getMemberName());
			pstmt.setString(4,m.getGender());
			pstmt.setInt(5,m.getAge());
			pstmt.setString(6,m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			//pstmt.setString(9, m.getHobby());`
			
			
			
//			String sql="INSERT INTO MEMBER VALUES('"+m.getMemberId()+"',"
//												+ "'"+m.getMemberPwd()+"',"
//												+ "'"+m.getMemberName()+"',"
//												+ "'"+m.getGender()+"',"
//												+m.getAge()+","
//												+"'"+m.getEmail()+"',"
//												+"'"+m.getPhone()+"',"
//												+"'"+m.getAddress()+"',"
//												+"'"+m.getHobby()+"',"
//												+"SYSDATE)";
			//result=stmt.executeUpdate(sql);
			//PreparedStatement실행할때 매소드 executeQuery()||executeUpdate()
			result=pstmt.executeUpdate();
			
			
			if(result>0) conn.commit();
			else conn.rollback();
			
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//if(stmt!=null && !stmt.isClosed()) stmt.close();
				if(pstmt!=null && !pstmt.isClosed()) pstmt.close();
				if(conn!=null && !conn.isClosed()) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public List<Member> searchColName(Map<String,String> param){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Member> list=new ArrayList();
		
		String sql="SELECT * FROM MEMBER WHERE "+param.get("col")+" LIKE ?";
		sql="select * from member where # like ?";
		sql=sql.replace("#", param.get("col"));		
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					"student","STUDENT");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+param.get("val")+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Member m=new Member();
				m.setMemberId(rs.getString(1));
				m.setMemberPwd(rs.getString(2));
				m.setMemberName(rs.getString(3));
				m.setGender(rs.getString(4));
				m.setAge(rs.getInt(5));
				m.setEmail(rs.getString(6));
				m.setPhone(rs.getString(7));
				m.setAddress(rs.getString(8));
				m.setHobby(rs.getString(9));
				m.setEnrollDate(rs.getDate(10));
				list.add(m);
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null&&!rs.isClosed()) rs.close();
				if(pstmt!=null&&!pstmt.isClosed()) pstmt.close();
				if(conn!=null && !conn.isClosed()) conn.close();
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
		
	}

	public int updateMember(Member m) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int result=0;
		String sql="UPDATE MEMBER SET AGE=?,EMAIL=?,PHONE=?,ADDRESS=? WHERE MEMBER_ID=?";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","STUDENT");
			conn.setAutoCommit(false);
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setInt(1, m.getAge());
			pstmt.setString(2,m.getEmail());
			pstmt.setString(3, m.getPhone());
			pstmt.setString(4, m.getAddress());
			pstmt.setString(5, m.getMemberId());
			
			result=pstmt.executeUpdate();
			if(result>0) conn.commit();
			else conn.rollback();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null&&!pstmt.isClosed()) pstmt.close();
				if(conn!=null && !conn.isClosed()) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}
		
	
}






