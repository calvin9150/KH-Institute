package com.member.model.dao;

import java.io.Closeable;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.member.common.JDBCTemplate;
import com.member.model.vo.Member;

public class MemberDao {
	

private Properties prop = new Properties();
	
	public List<Member> searchAll(Connection conn){
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<Member> list=new ArrayList();
		String sql="SELECT * FROM EMP";
		try {
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				Member m=new Member();
				m.setEmpNo(rs.getInt("EMPNO"));
				m.seteName(rs.getString("ENAME"));
				m.setJob(rs.getString("JOB"));
				m.setMgr(rs.getInt("MGR"));
				m.setHireDate(rs.getDate("HIREDATE"));
				m.setSal(rs.getInt("SAL"));
				m.setComm(rs.getInt("COMM"));
				m.setDeptNo(rs.getInt("DEPTNO"));
				list.add(m);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
		}
		return list;
	}

	public MemberDao() {
		try {
			prop.load(new FileReader("resources/sql/scott.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Member> searchColVal(Connection conn, Map<String,String> param){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Member> list = new ArrayList();
		String sql = prop.getProperty("searchColVal");
		sql = sql.replace("#", param.get("col"));
		try {
			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, param.get("col"));
			pstmt.setString(1, "%"+param.get("key")+"%");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Member e = new Member();
				e.setEmpNo(rs.getInt(1));
				e.seteName(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setMgr(rs.getInt(4));
				e.setHireDate(rs.getDate(5));
				e.setSal(rs.getInt(6));
				e.setComm(rs.getInt(7));
				e.setDeptNo(rs.getInt(8));
				list.add(e);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		}
		return list;
	}
}
