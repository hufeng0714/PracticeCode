package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * executeQuery 执行SQL查询语句
 * 注意： 在取第二列的数据的时候，用的是rs.get(2) ，而不是get(1). 这个是整个Java自带的api里唯二的地方，使用基1的，即2就代表第二个。
 * 另一个地方是在PreparedStatement这里
 */
/*
 * 	1. 创建一个用户表，有字段name,password

	CREATE TABLE user (
	  id int(11) AUTO_INCREMENT,
	  name varchar(30) ,
	  password varchar(30),
	  PRIMARY KEY (id)
	) ;
	
	2. 插入一条数据
	insert into user values(null,'dashen','thisispassword');

	3. SQL语句判断账号密码是否正确
	判断账号密码的正确方式是根据账号和密码到表中去找数据，如果有数据，就表明密码正确了，如果没数据，就表明密码错误。
	不恰当的方式 是把uers表的数据全部查到内存中，挨个进行比较。 如果users表里有100万条数据呢？ 内存都不够用的。
 */

public class TestJDBCSelect2 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
						"?characterEncoding=UTF-8","root", "");
				Statement s = c.createStatement();	
				) {

			String name = "dashen";
			//正确的密码是：thisispassword
            String password = "thisispassword";
            
            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";
			
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            if(rs.next())
                System.out.println("账号密码正确");
            else
                System.out.println("账号密码错误");
            
            
            
            String sql2 = "select count(*) from hero";
            rs = s.executeQuery(sql2);
            int total = 0;
            while(rs.next()){
            	total = rs.getInt(1);
            }
            System.out.println("表Hero中总共有:" + total+" 条数据");
            
            
			}catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
