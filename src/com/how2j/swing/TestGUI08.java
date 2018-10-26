package com.how2j.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

		/*
		 �������һ��JFrame,������һ����ť�������� "��һ��ģ̬����"��
		����ð�ť���漴��һ��ģ̬���ڡ�
		�����ģ̬��������һ����ť���ı��� "������С", ��������ģ̬���ڵĴ�С�ͱ�����ס�����ܸı䡣 �ٴε�����ͻظ��ܹ��ı��С
		 */


public class TestGUI08 {

	public static void main(String[] args) {

		JFrame f = new JFrame("WOW");
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.setLayout(null);
		
		final JDialog d = new JDialog(f);
		d.setTitle("���Ǹ�ģ̬����");
		d.setSize(600, 300);
		d.setLocation(200, 330);
		d.setModal(true);
		d.setLayout(null);
		
		JButton b1 = new JButton("��һ��ģ̬����");		
		b1.setBounds(100, 100, 600, 30);
		//���ּ�ط�ʽҲ��
//		b1.addMouseListener(new MouseAdapter() {
//			
//			public void mouseClicked(MouseEvent e) {
//				d.setVisible(true);
//			}
//		});
		
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				d.setVisible(true);				
			}
			
		});
		
		final JButton b2 = new JButton("������С");
		b2.setBounds(100, 100, 400, 30);
//		b2.addMouseListener(new MouseAdapter() {
//			
//			public void mouseClicked(MouseEvent e) {
//				if(b2.getText().equals("������С")) {
//					b2.setText("������С");
//					d.setResizable(false);
//				}else {
//					b2.setText("������С");
//					d.setResizable(true);
//				}
//			}	
//		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(b2.getText().equals("������С")) {
					b2.setText("������С");
					d.setResizable(false);
				}else {
					b2.setText("������С");
					d.setResizable(true);
				}
			}
		});

		f.add(b1);
		d.add(b2);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
