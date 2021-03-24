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
		//DB �����ϱ�
		//Class.forName() �޼��带 �̿��Ͽ� driver ��� -> Ŭ���� ���
		// oracle : oracle.jdbc.driver.OracleDriver
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("����̹� ��� ����");
		// 2.DB������ ���� Connection ��ü ����
		// DriverManager ��ü�� getConnection() �޼��� �̿��Ͽ� ����
		// getConnection()�޼���� 3���� ���ڿ� �Ű����� ����.
		// 1. DB url address -> "jdbc:oracle:thin:@DB����ip:��Ʈ:DB��sid"
		//                   ex)"jdbc:oracle:thin:@localhost:1521:xe"
		// 2. ����� ���� -> DB�� ������ �������� ���ڿ��� �ۼ� -> ex)"student"
		// 3. ���� ��й�ȣ -> DB�� ������ ��й�ȣ�� ���ڿ��� �ۼ� -> ex)"student"
		
		 conn = DriverManager.getConnection
				("jdbc:oracle:thin:@localhost:1521:xe", "student", "student");// interface java.sql ����Ʈ
		System.out.println("DB ���� ����");
		
		// 3. SQL���� ������ ��ü ���� -> Statement ��ü
		 stmt = conn.createStatement();
		
		// 4. ������ ������ ���� -> ���ڿ��� ����
		// String sql = "SELECT * FROM ���̺��"
		String sql = "SELECT * FROM MEMBER";
		
		// 5. �ۼ��� ������ ���� -> Statment ��ü�� executeQuery()||executeUpdate()
		// executeQuery(������ select��) -> ResultSet ��ȯ
		// executeUpdate(insert,update,delete��) -> int ��ȯ
		 rs = stmt.executeQuery(sql);
		
		// 6. DB���� ������ ������ Ȯ�� -> data�� java�� �����ϱ�
		// ResultSet��ü�� next() �޼��� �̿��ؼ� row����
		// �� ������ row ������ false, ������ true ��ȯ.
		// �ټ��� ��(row����)�̸� while�� 
		// �Ѱ��� if�� ����ؼ� ���� -> ex) primary key ��ȸ�� �����ϰ� ���
		// ResultSet ��ü�� get�޼��带 �̿� -> type���� ����.. ����Ŭ�� �ڹ� Ÿ���� �����ش�.
		// getString(�÷���||�ε�����) -> varchar2, char, nvarchar2, nchar
		// getInt(�÷���||�ε�����), getDouble(�÷���||�ε�����) -> number
		// getDate(�÷���||�ε�����) -> date // java.sql.Date
		
		while(rs.next()) {
			String memberId = rs.getString("member_id");
			String memberPwd = rs.getString("member_pwd");
			String memberName = rs.getString("member_name");
			String gender = rs.getString("gender");
			int age = rs.getInt("age");
			Date enrollDate = rs.getDate("enroll_date");
			
			System.out.println(memberId+" "+memberPwd+" "+memberName+" "+gender+" "+age+" "+enrollDate);
		}
		
		// insert�� ����
		// insert into ���̺�� values(��,��....);
		sql = "INSERT INTO MEMBER VALUES('GOM','GOM','������','M',29,"
				+ "'GOM@NAVER.COM','01012412211','����� ���ı�','����',SYSDATE)";
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result>0?"�Է¼���":"�Է½���");
		
		// 7. ������ ��ü ��ȯ(ResultSet, Statement, Connection)
		// ������ �������� ��ȯ�ؾ��Ѵ�. close() �޼��� �̿�.

		
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
