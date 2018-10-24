package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCSelectExam {

	/**
	 ���һ�����������з�ҳ��ѯ
 
	public static void list(int start, int count)
 	start ��ʾ��ʼҳ����count��ʾһҳ��ʾ������
	list(0,5) ��ʾ��һҳ��һ����ʾ5������
	list(10,5) ��ʾ����ҳ��һ����ʾ5������
	
	 */
	
	public static void main(String[] args) {

		list(10,5);
	}
	
	public static void list(int start, int count){
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

            String sql = "select * from hero limit "+start+","+count;
			
            // ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
            ResultSet rs = s.executeQuery(sql);
            int page = start/count + 1;
            
            System.out.printf("��ǰҳ����%d",page);
            System.out.println(" ");
            
            while(rs.next()){
				int id = rs.getInt("id");// ����ʹ���ֶ���
				String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);

                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }        
			}catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
