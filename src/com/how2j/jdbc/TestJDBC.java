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
			//��ʼ������
			
			//������com.mysql.jdbc.Driver
	        //���� mysql-connector-java-5.0.8-bin.jar��
	        //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("ok!");
			
			
            // ���������ݿ��Connection����
            // ������Ҫ�ṩ��
            // ���ݿ������ڵ�ip:127.0.0.1 (����)
            // ���ݿ�Ķ˿ںţ� 3306 ��mysqlר�ö˿ںţ�
            // ���ݿ����� how2java
            // ���뷽ʽ UTF-8
            // �˺� root
            // ���� admin(�ҵı��������ǿ�)
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
					"?characterEncoding=UTF-8","root", "");
			System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
			
			//����Statement
			//Statement������ִ��SQL���ģ��������ӣ�ɾ��
			
            // ע�⣺ʹ�õ��� java.sql.Statement
            // ��Ҫ��С��ʹ�õ��� com.mysql.jdbc.Statement;
			
			s = c.createStatement();
			System.out.println("��ȡ Statement���� " + s);
			
			
			//ִ��SQL���
            // ׼��sql���
            // ע�⣺ �ַ���Ҫ�õ�����'
			for(int i=0;i<1;i++){
				//д�������Ͳ�����
				//String heroName = "Ӣ��"+i;
				//String heroName = "Ӣ��00"+String.valueOf(i);
				String heroName = "'Ӣ��01" + i + "'";
				//String sql1 = "insert into hero value(null,'timo',50,100)";
				String sql2 = "insert into hero values(null,"+heroName+ ","+313.0f+","+50+")";
				//String sql3 = "insert into hero values(null,'Ӣ��9" + i + "',313,50)";
				
				s.execute(sql2);
			}
			/*
			String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")";
			s.execute(sql);
			System.out.println("ִ�в������ɹ�"); 
			*/
			
			//��JDBC�����ӣ�ɾ�����޸ĵĲ����������ƣ�ֻ�Ǵ��ݲ�ͬ��SQL�������ˡ� 
			//��ѯ��ΪҪ�������ݣ����Ժ�����Ĳ�һ��
			
			//������insert
			//ɾ����delete
			String sqlDelete = "delete from hero where id=2";
			s.execute(sqlDelete);
			//�ľ���update
			String sqlUpdate = "update hero set name='name 5' where id='3'";
			s.execute(sqlUpdate);
			
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
