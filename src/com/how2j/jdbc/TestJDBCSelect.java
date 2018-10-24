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


public class TestJDBCSelect {

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

			String sql = "select * from hero limit 10";
			
			// ִ�в�ѯ��䣬���ѽ�������ظ�ResultSet
			ResultSet rs = s.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt("id");// ����ʹ���ֶ���
				String name = rs.getString(2);// Ҳ����ʹ���ֶε�˳��
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
			}
            // ��һ��Ҫ������ر�ReultSet����ΪStatement�رյ�ʱ�򣬻��Զ��ر�ResultSet
            // rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
