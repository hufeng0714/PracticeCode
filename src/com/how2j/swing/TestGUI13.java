package com.how2j.swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGUI13 {

	public static void main(String[] args) {
		
		/*
			JPanel��Ϊ������� 
			����JFrameһ�������������������һ�������䵱�м��������������������ϣ�Ȼ���ٰ������ڴ����ϡ� 
			һ���ƶ�һ����壬�������������ͻ�ȫ��ͳһ�����ƶ����������ַ�ʽ�����ڽ��������������
		 */
		JFrame f = new JFrame("WOW");
		f.setSize(400,300);
		f.setLocation(100, 100);
		f.setLayout(null);
		
		JPanel p1 = new JPanel();
		// ��������С
		p1.setBounds(50, 50, 300, 40);
		// ������屳����ɫ
		p1.setBackground(Color.RED);
		// ��һ�����û�У���ΪJPanelĬ�Ͼ��ǲ��õ�FlowLayout
		p1.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("hero 1");
		JButton b2 = new JButton("hero 2");
		JButton b3 = new JButton("hero 3");
		
		JPanel p2 = new JPanel();
		p2.setBounds(50, 140, 300, 40);
		p2.setBackground(Color.BLUE);
		JButton b4 = new JButton("hero 4");
		JButton b5 = new JButton("hero 5");
		JButton b6 = new JButton("hero 6");
				
		// �Ѱ�ť�������
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		f.add(p1);
		f.add(p2);
		
		
        // JFrame����һ����壬����ContentPane
        // ƽʱͨ��f.add()��JFrame�����������ʵ����JFrame�ϵ� ContentPane�Ӷ���
        // f.add��ͬ��f.getContentPane().add(b);
        // b.getParent()��ȡ��ťb�����ڵ�����
        // ��ӡ�������Կ�����ʵ������ContentPane����JFrame
		System.out.println(p1.getParent());
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
