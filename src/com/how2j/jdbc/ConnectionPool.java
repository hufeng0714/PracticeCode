package com.how2j.jdbc;

	/**
	 * 数据库连接池原理-使用池
	 与传统方式不同，连接池在使用之前，就会创建好一定数量的连接。
	如果有任何线程需要使用连接，那么就从连接池里面借用，而不是自己重新创建. 
	使用完毕后，又把这个连接归还给连接池供下一次或者其他线程使用。
	倘若发生多线程并发情况，连接池里的连接被借用光了，那么其他线程就会临时等待，直到有连接被归还回来，再继续使用。
	整个过程，这些连接都不会被关闭，而是不断的被循环使用，从而节约了启动和关闭连接的时间。
	 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
  
public class ConnectionPool {
  
    List<Connection> cs = new ArrayList<Connection>();
  
    int size;
  
    public ConnectionPool(int size) {
        this.size = size;
        init();
    }
  
    public void init() {
          
        //这里恰恰不能使用try-with-resource的方式，因为这些连接都需要是"活"的，不要被自动关闭了
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for (int i = 0; i < size; i++) {
                Connection c = DriverManager
                        .getConnection("jdbc:mysql://127.0.0.1:3306/how2java" +
                        		"?characterEncoding=UTF-8", "root", "admin");
  
                cs.add(c);
  
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    public synchronized Connection getConnection() {
        while (cs.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Connection c = cs.remove(0);
        return c;
    }
  
    public synchronized void returnConnection(Connection c) {
        cs.add(c);
        this.notifyAll();
    }
  
}