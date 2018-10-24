package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCEU2 {

	/**
		��ͬ1��
		execute����ִ�в�ѯ���
		Ȼ��ͨ��getResultSet���ѽ����ȡ����
		executeUpdate����ִ�в�ѯ���
		��ͬ2:
		execute����boolean���ͣ�true��ʾִ�е��ǲ�ѯ��䣬false��ʾִ�е���insert,delete,update�ȵ�
		executeUpdate���ص���int����ʾ�ж����������ܵ���Ӱ��
	 */
	public static void main(String[] args) {
  
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
            Statement s = c.createStatement();) {
  
            // ��ͬ1��execute����ִ�в�ѯ���
            // Ȼ��ͨ��getResultSet���ѽ����ȡ����
            String sqlSelect = "select * from hero";
  
            s.execute(sqlSelect);
            ResultSet rs = s.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
            }
  
            // executeUpdate����ִ�в�ѯ���
            // s.executeUpdate(sqlSelect);
  
            // ��ͬ2:
            // execute����boolean���ͣ�true��ʾִ�е��ǲ�ѯ��䣬false��ʾִ�е���insert,delete,update�ȵ�
            boolean isSelect = s.execute(sqlSelect);
            System.out.println(isSelect);
  
            // executeUpdate���ص���int����ʾ�ж����������ܵ���Ӱ��
            String sqlUpdate = "update Hero set hp = 300 where id < 25100";
            int number = s.executeUpdate(sqlUpdate);
            System.out.println(number);
  
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
    }

}