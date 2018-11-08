package com.how2j.jdbc;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestSql {

	public static void main(String[] args) {
		
		List list = new List();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try(
				Connection c = DriverManager.getConnection("jdbc:mysql://10.0.3.33:3306/hmc_test" +
						"?characterEncoding=UTF-8","service", "");
				Statement s = c.createStatement();	
				){
			String sql = "select DISTINCT a.count_key from web_ask_count a where a.count_value>'19' "
					+ "and a.update_time>='2018-09-28 00:00:00' and a.update_time<'2018-11-04 00:00:00' and a.count_key IN(\r\n" + 
					"\r\n" + 
					"select DISTINCT model_type from car_model a \r\n" + 
					"LEFT JOIN car_brand_area b ON a.model_brand=b.area_brand \r\n" + 
					"LEFT JOIN car_brand c on b.area_brand = c.brand_id\r\n" + 
					"\r\n" + 
					"where a.model_category IN('1','2','3') and a.data_state='init' and a.model_isStop='0' \r\n" + 
					"and b.area_code='310000' and c.data_state='init')";
			
			ResultSet rs = s.executeQuery(sql);
			
			while(rs.next()) {
				String i = rs.getString(1);
				list.add(i);
			}
			
			System.out.println(list);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
