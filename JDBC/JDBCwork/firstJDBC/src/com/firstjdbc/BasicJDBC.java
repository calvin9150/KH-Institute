package com.firstjdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJDBC {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//DB 접속하기
		//Class.forName() 메서드를 이용하여 driver 등록 -> 클래스 등록
		// oracle : oracle.jdbc.driver.OracleDriver
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("드라이버 등록 성공");
		// 2.DB연결을 위한 Connection 객체 생성
		// DriverManager 객체의 getConnection() 메서드 이용하여 생성
		// getConnection()메서드는 3개의 문자열 매개변수 있음.
		// 1. DB url address -> "jdbc:oracle:thin:@DB서버ip:포트:DB의sid"
		//                   ex)"jdbc:oracle:thin:@localhost:1521:xe"
		// 2. 사용자 계정 -> DB에 생성된 계정명을 문자열로 작성 -> ex)"student"
		// 3. 계정 비밀번호 -> DB에 접속할 비밀번호를 문자열로 작성 -> ex)"student"
		
		 conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");// interface java.sql 임포트
		System.out.println("DB 접속 성공");
		
		// 3. SQL문을 실행할 객체 생성 -> Statement 객체
		 stmt = conn.createStatement();
		
		// 4. 실행할 쿼리문 생성 -> 문자열로 생성
		// String sql = "SELECT * FROM 테이블명"
		String sql = "SELECT * FROM MEMBER";
		
		// 5. 작성한 쿼리문 실행 -> Statment 객체의 executeQuery()||executeUpdate()
		// executeQuery(실행할 select문) -> ResultSet 반환
		// executeUpdate(insert,update,delete문) -> int 반환
		 rs = stmt.executeQuery(sql);
		
		// 6. DB에서 가져온 데이터 확인 -> data를 java에 보관하기
		// ResultSet객체의 next() 메서드 이용해서 row지정
		// ㄴ 지정할 row 없으면 false, 있으면 true 반환.
		// 다수의 값(row여럿)이면 while문 
		// 한개면 if문 사용해서 접근 -> ex) primary key 조회를 예상하고 사용
		// ResultSet 객체의 get메서드를 미용 -> type별로 있음.. 오라클과 자바 타입을 맞춰준다.
		// getString(컬럼명||인덱스명) -> varchar2, char, nvarchar2, nchar
		// getInt(컬럼명||인덱스명), getDouble(컬럼명||인덱스명) -> number
		// getDate(컬럼명||인덱스명) -> date // java.sql.Date
		
		while(rs.next()) {
			String memberId = rs.getString("member_id");
			String memberPwd = rs.getString("member_pwd");
			String memberName = rs.getString("member_name");
			String gender = rs.getString("gender");
			int age = rs.getInt("age");
			Date enrollDate = rs.getDate("enroll_date");
			
			System.out.println(memberId+" "+memberPwd+" "+memberName+" "+gender+" "+age+" "+enrollDate);
		}
		
		// insert문 실행
		// insert into 테이블명 values(값,값....);
		sql = "INSERT INTO MEMBER VALUES('GOM','GOM','곰탱이','M',29,"
				+ "'GOM@NAVER.COM','01012412211','서울시 송파구','독서',SYSDATE)";
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result>0?"입력성공":"입력실패");
		
		// 7. 생성된 객체 반환(ResultSet, Statement, Connection)
		// 생성된 역순으로 반환해야한다. close() 메서드 이용.

		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null&&rs.isClosed())rs.close();
				if(stmt!=null&&stmt.isClosed())stmt.close();
				if(conn!=null&&conn.isClosed())conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		
	}
	
}
