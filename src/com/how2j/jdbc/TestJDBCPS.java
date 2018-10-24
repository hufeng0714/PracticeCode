package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCPS {

	/**
	 和 Statement一样，PreparedStatement也是用来执行sql语句的
	与创建Statement不同的是，需要根据sql语句创建PreparedStatement
	除此之外，还能够通过设置参数，指定相应的值，而不是Statement那样使用字符串拼接

	注： 这是JAVA里唯二的基1的地方，另一个是查询语句中的ResultSet也是基1的。
	
	PreparedStatement的优点1-参数设置
	PreparedStatement的优点2-性能表现
	 */
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String sql ="insert into hero values(null,?,?,?)";
		
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
						"?characterEncoding=UTF-8","root", "");
				Statement s = c.createStatement();
				// 根据sql语句创建PreparedStatement
				PreparedStatement ps = c.prepareStatement(sql);
				){
            // Statement需要进行字符串拼接，可读性和维修性比较差
            // Statement执行10次，需要10次把SQL语句传输到数据库端
            // 数据库要对每一次来的SQL语句进行编译处理
			long startTime = System.currentTimeMillis();
			for(int i=0;i<10000;i++){
				String sql0 = "insert into hero values(null," + "'提莫'" + "," + 313.0f + "," + 50 + ")";
	            s.execute(sql0);	
			}
			long endTime = System.currentTimeMillis();
			System.out.printf("Statement 耗时%d",endTime - startTime);
            s.close();
            System.out.println();
            // PreparedStatement 使用参数设置，可读性好，不易犯错
            // "insert into hero values(null,?,?,?)";
            // PreparedStatement 执行10次，只需要1次把SQL语句传输到数据库端
            // 数据库对带?的SQL进行预编译
  
            // 每次执行，只需要传输参数到数据库端
            // 1. 网络传输量比Statement更小
            // 2. 数据库不需要再进行编译，响应更快
			startTime = System.currentTimeMillis();
            for(int i=0;i<10000;i++){
    			// 设置参数
                ps.setString(1, "提莫2");
                ps.setFloat(2, 313.0f);
                ps.setInt(3, 50);
                // 执行
                ps.execute();
            }
            endTime = System.currentTimeMillis();
            System.out.printf("PreparedStatement 耗时%d",endTime - startTime);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
