package com.how2j.jdbc;

	/**
	 * ���ݿ����ӳ�ԭ��-ʹ�ó�
	 �봫ͳ��ʽ��ͬ�����ӳ���ʹ��֮ǰ���ͻᴴ����һ�����������ӡ�
	������κ��߳���Ҫʹ�����ӣ���ô�ʹ����ӳ�������ã��������Լ����´���. 
	ʹ����Ϻ��ְ�������ӹ黹�����ӳع���һ�λ��������߳�ʹ�á�
	�����������̲߳�����������ӳ�������ӱ����ù��ˣ���ô�����߳̾ͻ���ʱ�ȴ���ֱ�������ӱ��黹�������ټ���ʹ�á�
	�������̣���Щ���Ӷ����ᱻ�رգ����ǲ��ϵı�ѭ��ʹ�ã��Ӷ���Լ�������͹ر����ӵ�ʱ�䡣
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
          
        //����ǡǡ����ʹ��try-with-resource�ķ�ʽ����Ϊ��Щ���Ӷ���Ҫ��"��"�ģ���Ҫ���Զ��ر���
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