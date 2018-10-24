package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCExam {

	public static void main(String[] args) {
		String sql1 = "insert into hero values(null,"+"'提莫insert'"+","+313.0f+","+50+")";
		execute(sql1);
		String sql2 = "update hero set name='name 5' where id='502'";
		execute(sql2);
		String sql3 = "delete from hero where id='503'";
		execute(sql3);

	}
	
	
	/*
	设计一个方法
	public static void execute(String sql)
	方法接受的参数是SQL语句，无论是增加，删除，还是修改，都调用这个方法，每次传不同的SQL语句作为参数
	*/
	public static void execute(String sql){
		Connection c = null;
		Statement s = null;
		
		try {
			//初始化驱动
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ok!");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
					"?characterEncoding=UTF-8","root", "");
			//创建Statement
			s = c.createStatement();
			System.out.println("获取 Statement对象： " + s);
					
			s.execute(sql);
			System.out.println("执行插入语句成功"); 
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//关闭连接
			// 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
			if(s!=null){
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//后关闭Connection
			if(c!=null){
				try {
					c.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
