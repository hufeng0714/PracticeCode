package com.how2j.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


	/**
	 	����ORM��˼�룬�����������������ORM������
		��һ��Hero������뵽���ݿ���
		public static void add(Hero h)  
		�����Hero�����Ӧ������ɾ����
		public static void delete(Hero h)  
		��������Hero����
		public static void update(Hero h) 
		�����е�Hero���ݲ�ѯ������ת��ΪHero����󣬷���һ�������з���
		public static List<Hero> list(); 
	 */
	/*
	 * ���ݿ��hero������create table hero(id int,name varchar(20),hp float,damage int);
	 * ע��id�ֶβ�������Ϊ������������������ɾ������������ʾ����Ч��
	 */

public class TestJDBCORMExam {
	//�����ݿ���ض�id�ֶ��µļ�¼����ֵ����jvm������һ�����󣬸ö���ӵ�иü�¼������ֵ
    public static Hero get(int id) {
        //��ʼ��һ��Hero����
        Hero hero=new Hero();
        //��ʼ������
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //�������ݿ⣬ִ��sql���
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                Statement s=c.createStatement()){
            String sql="select * from hero where id="+id;
            //��ѯ�������һ��set����
            ResultSet rs=s.executeQuery(sql);
            if(rs.next()) {
                //jvm������ݿ��ض���¼�µ�����ֵ�����޸Ķ���ĳ�Ա����
                String name=rs.getString(2);
                Float hp=rs.getFloat("hp");
                int damage=rs.getInt(4);
                hero.name=name;
                hero.hp=hp;
                hero.damage=damage;
                hero.id=id;
            }
        }catch(SQLException e) {
                e.printStackTrace();
            }  
        return hero;
    }
     
    public static void add(Hero h) {
        int id=h.id;
        String name=h.name;
        float hp=h.hp;
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //�ؼ����,��sql������������ò����ֿ�д������ƴ���ַ���������
        String sql="insert into hero values(?,?,?,?)";
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                PreparedStatement ps=c.prepareStatement(sql);){
            // ���ò�����ִ��
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setFloat(3, hp);
            ps.setInt(4, h.damage);
            ps.execute();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
     
    public static void delete(Hero h) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String sql="delete from hero where id="+h.id;
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                PreparedStatement ps=c.prepareStatement(sql);){
            ps.execute();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
     
    public static void update(Hero h) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                Statement s=c.createStatement();){
            String sql="select * from hero where id="+h.id;
            ResultSet rs=s.executeQuery(sql);
            if(rs.next()) {
                int id=rs.getInt(1);
                String name=rs.getString(2);
                float hp=rs.getFloat(3);
                int damage=rs.getInt(4);
                h.id=id;
                h.name=name;
                h.hp=hp;
                h.damage=damage;
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
     
    public static List<Hero> list(){
        List<Hero> list=new LinkedList<>();
        String sql="select * from hero";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                Statement s=c.createStatement()){
            ResultSet rs=s.executeQuery(sql);
            //����ѭ���ģ��α��ѯÿ����¼
            while(rs.next()) {
                //�ӵ�ǰ��¼��jvm�������
                int id=rs.getInt(1);
                String name=rs.getString(2);
                float hp=rs.getFloat(3);
                int damage=rs.getInt(4);
                //����һ��Hero���󣬰ѻ�������޸Ķ���ĳ�Ա����
                Hero h=new Hero();
                h.id=id;
                h.name=name;
                h.hp=hp;
                h.damage=damage;
                //�����������ӵ�����
                list.add(h);
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
     
    public static void main(String[] args) {
    	/*
    	Hero h=get(20555);
      	System.out.println(h.name);
      	*/
    	/*
    	Hero h=new Hero(120,"��ñ�ӵ���Ī",500,48);
    	add(h);
    	*/
    	/*
    	Hero h = new Hero(120,"��ñ�ӵ���Ī",500,48);
     	delete(h);
 		*/
    	
    	/*
    	Hero h=new Hero(1,"��������������Ī",700,50);
      	update(h);
        //����Ӧ���hero��id=1�ļ�¼�µ�teemo
    	System.out.println(h.name);
    	 */
    	 
      	
        List<Hero> resultlist=list();
        for(Hero h:resultlist) {
            System.out.println(h.id);
        }
        
    }
}
