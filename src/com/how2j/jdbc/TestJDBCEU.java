package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCEU {

	/**
		execute��executeUpdate����ͬ�㣺������ִ�����ӣ�ɾ�����޸�

	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = null;
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
						"?characterEncoding=UTF-8","root", "admin");
				Statement s = c.createStatement();
				){
            String sqlInsert = "insert into Hero values (null,'����',616,100)";
            String sqlDelete = "delete from Hero where id = 20551";
            String sqlUpdate = "update Hero set hp = 300 where id = 20550";
 
            // ��ͬ�㣺������ִ�����ӣ�ɾ�����޸�
            s.execute(sqlInsert);
			s.execute(sqlUpdate);
			s.execute(sqlDelete);
			
			s.executeUpdate(sqlInsert);
			s.executeUpdate(sqlUpdate);
			s.executeUpdate(sqlDelete);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
