package com.firstjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicJDBC {

	public static void main(String[] args) {
		Connection con = null;
		Statement state = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KH", "KH");
			System.out.println("DB���� ����");
			state = con.createStatement();
			String sql = "SELECT * FROM department";
			rs = state.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("dept_id")
						+" "+rs.getString("dept_title")
						+" "+rs.getString("location_id"));
			}
			sql = "INSERT INTO DEPARTMENT VALUES('Z1','��鿬����','K1')";
			
			int result = state.executeUpdate(sql);
			System.out.println(result>0?"�Էµ�":"�Է¾ȵ�");
			
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

	}

}
