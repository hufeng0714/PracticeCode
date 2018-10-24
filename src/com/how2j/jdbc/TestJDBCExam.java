package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCExam {

	public static void main(String[] args) {
		String sql1 = "insert into hero values(null,"+"'��Īinsert'"+","+313.0f+","+50+")";
		execute(sql1);
		String sql2 = "update hero set name='name 5' where id='502'";
		execute(sql2);
		String sql3 = "delete from hero where id='503'";
		execute(sql3);

	}
	
	
	/*
	���һ������
	public static void execute(String sql)
	�������ܵĲ�����SQL��䣬���������ӣ�ɾ���������޸ģ����������������ÿ�δ���ͬ��SQL�����Ϊ����
	*/
	public static void execute(String sql){
		Connection c = null;
		Statement s = null;
		
		try {
			//��ʼ������
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ok!");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
					"?characterEncoding=UTF-8","root", "");
			//����Statement
			s = c.createStatement();
			System.out.println("��ȡ Statement���� " + s);
					
			s.execute(sql);
			System.out.println("ִ�в������ɹ�"); 
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			//�ر�����
			// ���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
            // �ȹر�Statement
			if(s!=null){
				try {
					s.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			//��ر�Connection
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
