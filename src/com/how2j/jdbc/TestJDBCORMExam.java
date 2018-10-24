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
	 	根据ORM的思想，设计其他几个常见的ORM方法：
		把一个Hero对象插入到数据库中
		public static void add(Hero h)  
		把这个Hero对象对应的数据删除掉
		public static void delete(Hero h)  
		更新这条Hero对象
		public static void update(Hero h) 
		把所有的Hero数据查询出来，转换为Hero对象后，放在一个集合中返回
		public static List<Hero> list(); 
	 */
	/*
	 * 数据库的hero表创建：create table hero(id int,name varchar(20),hp float,damage int);
	 * 注意id字段不能设置为自增，否则后面的增加删除函数不能演示运行效果
	 */

public class TestJDBCORMExam {
	//从数据库的特定id字段下的记录所有值，在jvm上生成一个对象，该对象拥有该记录的有所值
    public static Hero get(int id) {
        //初始化一个Hero对象
        Hero hero=new Hero();
        //初始化驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //连接数据库，执行sql语句
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                Statement s=c.createStatement()){
            String sql="select * from hero where id="+id;
            //查询结果返回一个set集合
            ResultSet rs=s.executeQuery(sql);
            if(rs.next()) {
                //jvm获得数据库特定记录下的所有值，并修改对象的成员变量
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
        //关键这个,将sql语句与后面的设置参数分开写，否则拼接字符串看不懂
        String sql="insert into hero values(?,?,?,?)";
        try(Connection c=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
        		"?characterEncoding=UTF-8","root", "");
                PreparedStatement ps=c.prepareStatement(sql);){
            // 设置参数并执行
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
            //类似循环的，游标查询每个记录
            while(rs.next()) {
                //从当前记录，jvm获得数据
                int id=rs.getInt(1);
                String name=rs.getString(2);
                float hp=rs.getFloat(3);
                int damage=rs.getInt(4);
                //创建一个Hero对象，把获得数据修改对象的成员变量
                Hero h=new Hero();
                h.id=id;
                h.name=name;
                h.hp=hp;
                h.damage=damage;
                //把这个对象添加到集合
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
    	Hero h=new Hero(120,"带帽子的提莫",500,48);
    	add(h);
    	*/
    	/*
    	Hero h = new Hero(120,"带帽子的提莫",500,48);
     	delete(h);
 		*/
    	
    	/*
    	Hero h=new Hero(1,"带巨人腰带的提莫",700,50);
      	update(h);
        //下面应输出hero表id=1的记录下的teemo
    	System.out.println(h.name);
    	 */
    	 
      	
        List<Hero> resultlist=list();
        for(Hero h:resultlist) {
            System.out.println(h.id);
        }
        
    }
}
