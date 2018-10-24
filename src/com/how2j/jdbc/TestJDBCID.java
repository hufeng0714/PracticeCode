package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCID {

	/**
	 * 获取自增长id
	在Statement通过execute或者executeUpdate执行完插入语句后，MySQL会为新插入的数据分配一个自增长id，
	(前提是这个表的id设置为了自增长,在Mysql创建表的时候，AUTO_INCREMENT就表示自增长)
	 
	CREATE TABLE hero (
	  id int(11) AUTO_INCREMENT,
	  ...
	}
	 
	
	但是无论是execute还是executeUpdate都不会返回这个自增长id是多少。需要通过Statement的getGeneratedKeys获取该id
	注： 第20行的代码，后面加了个Statement.RETURN_GENERATED_KEYS参数，以确保会返回自增长ID。 
	通常情况下不需要加这个，有的时候需要加，所以先加上，保险一些
	 
	PreparedStatement ps = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
	 */
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "insert into hero values(null,?,?,?)";
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
		        		"?characterEncoding=UTF-8","root", "");
				PreparedStatement ps = c.prepareStatement(sql);
				){
	          	ps.setString(1, "盖伦");
	            ps.setFloat(2, 616);
	            ps.setInt(3, 100);
	   
	            // 执行插入语句
	            ps.execute();
	            // 在执行完插入语句后，MySQL会为新插入的数据分配一个自增长id
	            // JDBC通过getGeneratedKeys获取该id
	            ResultSet rs = ps.getGeneratedKeys();
	            if(rs.next()){
	            	int id = rs.getInt(1);
	            	System.out.println(id);
	            }
	            
	            //获取表的元数据
	            /*
			             元数据概念：
				和数据库服务器相关的数据，比如数据库版本，有哪些表，表有哪些字段，字段类型是什么等等。
	             */
	            DatabaseMetaData dbmd = c.getMetaData();
	            
	            // 获取数据库服务器产品名称
	            System.out.println("数据库产品名称:\t"+dbmd.getDatabaseProductName());
	            // 获取数据库服务器产品版本号
	            System.out.println("数据库产品版本:\t"+dbmd.getDatabaseProductVersion());
	            // 获取数据库服务器用作类别和表名之间的分隔符 如test.user
	            System.out.println("数据库和表分隔符:\t"+dbmd.getCatalogSeparator());
	            // 获取驱动版本
	            System.out.println("驱动版本:\t"+dbmd.getDriverVersion());
	  
	            System.out.println("可用的数据库列表：");
	            // 获取数据库名称
	            ResultSet rs2 = dbmd.getCatalogs();
	  
	            while (rs2.next()) {
	                System.out.println("数据库名称:\t"+rs2.getString(1));
	            }
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
