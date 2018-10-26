package com.how2j.swing;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUI01 {

	/*
	 	JFrame��GUI�е����� 
		JButton����������- ��ť 
		ע�⣺f.setVisible(true); ������е����������Ⱦ������һ��Ҫ���������
	 */

	public static void main(String[] args) {
		
        // ������
        JFrame f = new JFrame("LoL");
 
        // ���������ô�С
        f.setSize(400, 300);
 
        // ����������λ��
        //f.setLocation(200, 200);
        Point p = getPointFromLocationFile();
        if(p!=null) 
        	f.setLocation(p.x, p.y);	
        else 
        	f.setLocation(200,200);
        
        
        // �������е��������Ϊ���Զ�λ
        f.setLayout(null);
 
        // ��ť���
        JButton b = new JButton("һ����Է����ع�");
 
        // ͬʱ��������Ĵ�С��λ��
        b.setBounds(50, 50, 280, 30);
 
        // �Ѱ�ť���뵽��������
        f.add(b);
 
        //�����С���ɱ仯
        f.setResizable(false);
        // �رմ����ʱ���˳�����
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // �ô����ÿɼ�
        f.setVisible(true);
        
        new SavingPostionThread(f).start();

	}
	
	static class Point {
		 int x;
		 int y;
	}
	
	public static Point getPointFromLocationFile() {
		
		File file = new File("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\location.txt");
		Point p = null;
		try(FileInputStream fis = new FileInputStream(file);
			DataInputStream dis = new DataInputStream(fis);
			) {
			int x = dis.readInt();
			int y = dis.readInt();
			
			p = new Point();
			p.x = x;
			p.y = y;
			
		 	} catch (FileNotFoundException e) 
			{
            //��һ�����У���û������λ���ļ������Ի����FileNotFoundException
		 		e.printStackTrace();
			}
			catch (Exception e1) {
			e1.printStackTrace();
		}
		return p;
	}

}
