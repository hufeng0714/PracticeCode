package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * executeQuery ִ��SQL��ѯ���
 * ע�⣺ ��ȡ�ڶ��е����ݵ�ʱ���õ���rs.get(2) ��������get(1). ���������Java�Դ���api��Ψ���ĵط���ʹ�û�1�ģ���2�ʹ���ڶ�����
 * ��һ���ط�����PreparedStatement����
 */
/*
 * 	1. ����һ���û������ֶ�name,password

	CREATE TABLE user (
	  id int(11) AUTO_INCREMENT,
	  name varchar(30) ,
	  password varchar(30),
	  PRIMARY KEY (id)
	) ;
	
	2. ����һ������
	insert into user values(null,'dashen','thisispassword');

	3. SQL����ж��˺������Ƿ���ȷ
	�ж��˺��������ȷ��ʽ�Ǹ����˺ź����뵽����ȥ�����ݣ���������ݣ��ͱ���������ȷ�ˣ����û���ݣ��ͱ����������
	��ǡ���ķ�ʽ �ǰ�uers�������ȫ���鵽�ڴ��У��������бȽϡ� ���users������100���������أ� �ڴ涼�����õġ�
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
			//��ȷ�������ǣ�thisispassword
            String password = "thisispassword";
            
            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";
			
            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
            ResultSet rs = s.executeQuery(sql);
            if(rs.next())
                System.out.println("�˺�������ȷ");
            else
                System.out.println("�˺��������");
            
            
            
            String sql2 = "select count(*) from hero";
            rs = s.executeQuery(sql2);
            int total = 0;
            while(rs.next()){
            	total = rs.getInt(1);
            }
            System.out.println("��Hero���ܹ���:" + total+" ������");
            
            
			}catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
