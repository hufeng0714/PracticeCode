package com.how2j.swing;

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
        f.setLocation(200, 200);
        // �������е��������Ϊ���Զ�λ
        f.setLayout(null);
 
        // ��ť���
        JButton b = new JButton("һ����Է����ع�");
 
        // ͬʱ��������Ĵ�С��λ��
        b.setBounds(50, 50, 280, 30);
 
        // �Ѱ�ť���뵽��������
        f.add(b);
 
        // �رմ����ʱ���˳�����
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // �ô����ÿɼ�
        f.setVisible(true);

	}

}