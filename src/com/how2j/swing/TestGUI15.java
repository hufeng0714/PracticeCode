package com.how2j.swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestGUI15 {

	public static void main(String[] args) {
		/*
		ʹ�ô�����������������ַ�ʽ
		1. �ڴ���JScrollPane���������Ϊ��������ȥ
		JScrollPane sp = new JScrollPane(ta);
		2. ϣ�����������������ʾ���������ʱ�򣬵���setViewportView
		sp.setViewportView(ta);
		*/
		JFrame f = new JFrame("wow");
		f.setSize(400,300);
		f.setLocation(200, 200);
		f.setLayout(null);
		
		//׼��һ���ı���������źܶ�����
        JTextArea ta = new JTextArea();
        for (int i = 0; i < 1000; i++) {
            ta.append(String.valueOf(i));
        }
        //�Զ�����
        ta.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta);
        f.setContentPane(sp); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}

}
