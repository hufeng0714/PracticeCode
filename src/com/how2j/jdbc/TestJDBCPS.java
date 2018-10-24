package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCPS {

	/**
	 �� Statementһ����PreparedStatementҲ������ִ��sql����
	�봴��Statement��ͬ���ǣ���Ҫ����sql��䴴��PreparedStatement
	����֮�⣬���ܹ�ͨ�����ò�����ָ����Ӧ��ֵ��������Statement����ʹ���ַ���ƴ��

	ע�� ����JAVA��Ψ���Ļ�1�ĵط�����һ���ǲ�ѯ����е�ResultSetҲ�ǻ�1�ġ�
	
	PreparedStatement���ŵ�1-��������
	PreparedStatement���ŵ�2-���ܱ���
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
				// ����sql��䴴��PreparedStatement
				PreparedStatement ps = c.prepareStatement(sql);
				){
            // Statement��Ҫ�����ַ���ƴ�ӣ��ɶ��Ժ�ά���ԱȽϲ�
            // Statementִ��10�Σ���Ҫ10�ΰ�SQL��䴫�䵽���ݿ��
            // ���ݿ�Ҫ��ÿһ������SQL�����б��봦��
			long startTime = System.currentTimeMillis();
			for(int i=0;i<10000;i++){
				String sql0 = "insert into hero values(null," + "'��Ī'" + "," + 313.0f + "," + 50 + ")";
	            s.execute(sql0);	
			}
			long endTime = System.currentTimeMillis();
			System.out.printf("Statement ��ʱ%d",endTime - startTime);
            s.close();
            System.out.println();
            // PreparedStatement ʹ�ò������ã��ɶ��Ժã����׷���
            // "insert into hero values(null,?,?,?)";
            // PreparedStatement ִ��10�Σ�ֻ��Ҫ1�ΰ�SQL��䴫�䵽���ݿ��
            // ���ݿ�Դ�?��SQL����Ԥ����
  
            // ÿ��ִ�У�ֻ��Ҫ������������ݿ��
            // 1. ���紫������Statement��С
            // 2. ���ݿⲻ��Ҫ�ٽ��б��룬��Ӧ����
			startTime = System.currentTimeMillis();
            for(int i=0;i<10000;i++){
    			// ���ò���
                ps.setString(1, "��Ī2");
                ps.setFloat(2, 313.0f);
                ps.setInt(3, 50);
                // ִ��
                ps.execute();
            }
            endTime = System.currentTimeMillis();
            System.out.printf("PreparedStatement ��ʱ%d",endTime - startTime);
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		

	}

}
