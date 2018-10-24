package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJDBCID {

	/**
	 * ��ȡ������id
	��Statementͨ��execute����executeUpdateִ�����������MySQL��Ϊ�²�������ݷ���һ��������id��
	(ǰ����������id����Ϊ��������,��Mysql�������ʱ��AUTO_INCREMENT�ͱ�ʾ������)
	 
	CREATE TABLE hero (
	  id int(11) AUTO_INCREMENT,
	  ...
	}
	 
	
	����������execute����executeUpdate�����᷵�����������id�Ƕ��١���Ҫͨ��Statement��getGeneratedKeys��ȡ��id
	ע�� ��20�еĴ��룬������˸�Statement.RETURN_GENERATED_KEYS��������ȷ���᷵��������ID�� 
	ͨ������²���Ҫ��������е�ʱ����Ҫ�ӣ������ȼ��ϣ�����һЩ
	 
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
	          	ps.setString(1, "����");
	            ps.setFloat(2, 616);
	            ps.setInt(3, 100);
	   
	            // ִ�в������
	            ps.execute();
	            // ��ִ�����������MySQL��Ϊ�²�������ݷ���һ��������id
	            // JDBCͨ��getGeneratedKeys��ȡ��id
	            ResultSet rs = ps.getGeneratedKeys();
	            if(rs.next()){
	            	int id = rs.getInt(1);
	            	System.out.println(id);
	            }
	            
	            //��ȡ���Ԫ����
	            /*
			             Ԫ���ݸ��
				�����ݿ��������ص����ݣ��������ݿ�汾������Щ��������Щ�ֶΣ��ֶ�������ʲô�ȵȡ�
	             */
	            DatabaseMetaData dbmd = c.getMetaData();
	            
	            // ��ȡ���ݿ��������Ʒ����
	            System.out.println("���ݿ��Ʒ����:\t"+dbmd.getDatabaseProductName());
	            // ��ȡ���ݿ��������Ʒ�汾��
	            System.out.println("���ݿ��Ʒ�汾:\t"+dbmd.getDatabaseProductVersion());
	            // ��ȡ���ݿ�������������ͱ���֮��ķָ��� ��test.user
	            System.out.println("���ݿ�ͱ�ָ���:\t"+dbmd.getCatalogSeparator());
	            // ��ȡ�����汾
	            System.out.println("�����汾:\t"+dbmd.getDriverVersion());
	  
	            System.out.println("���õ����ݿ��б�");
	            // ��ȡ���ݿ�����
	            ResultSet rs2 = dbmd.getCatalogs();
	  
	            while (rs2.next()) {
	                System.out.println("���ݿ�����:\t"+rs2.getString(1));
	            }
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
