package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class TestJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Connection c = null;
		Statement s = null;
		
		try {
			//初始化驱动
			
			//驱动类com.mysql.jdbc.Driver
	        //就在 mysql-connector-java-5.0.8-bin.jar中
	        //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ok!");
			
			
            // 建立与数据库的Connection连接
            // 这里需要提供：
            // 数据库所处于的ip:127.0.0.1 (本机)
            // 数据库的端口号： 3306 （mysql专用端口号）
            // 数据库名称 how2java
            // 编码方式 UTF-8
            // 账号 root
            // 密码 admin(我的本机密码是空)
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
					"?characterEncoding=UTF-8","root", "");
			System.out.println("连接成功，获取连接对象： " + c);
			
			//创建Statement
			//Statement是用于执行SQL语句的，比如增加，删除
			
            // 注意：使用的是 java.sql.Statement
            // 不要不小心使用到： com.mysql.jdbc.Statement;
			
			s = c.createStatement();
			System.out.println("获取 Statement对象： " + s);
			
			
			//执行SQL语句
            // 准备sql语句
            // 注意： 字符串要用单引号'
			for(int i=0;i<1;i++){
				//写成这样就不可以
				//String heroName = "英雄"+i;
				//String heroName = "英雄00"+String.valueOf(i);
				String heroName = "'英雄01" + i + "'";
				//String sql1 = "insert into hero value(null,'timo',50,100)";
				String sql2 = "insert into hero values(null,"+heroName+ ","+313.0f+","+50+")";
				//String sql3 = "insert into hero values(null,'英雄9" + i + "',313,50)";
				
				s.execute(sql2);
			}
			/*
			String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.println("执行插入语句成功"); 
			*/
			
			//在JDBC中增加，删除，修改的操作都很类似，只是传递不同的SQL语句就行了。 
			//查询因为要返回数据，所以和上面的不一样
			
			//增就是insert
			//删就是delete
			String sqlDelete = "delete from hero where id=2";
			s.execute(sqlDelete);
			//改就是update
			String sqlUpdate = "update hero set name='name 5' where id='3'";
			s.execute(sqlUpdate);
			
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
