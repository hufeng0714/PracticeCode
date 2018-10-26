package com.how2j.swing;

		/**
		 ���̼������� KeyListener
		keyPressed ���� ��������
		keyReleased ���� ��������
		keyTyped ���� һ�����µ������϶���
		KeyEvent.getKeyCode() ���Ի�ȡ��ǰ�������ĸ���
		 */

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI03 {

	public static void main(String[] args) {

		JFrame f = new JFrame("WOW");
		f.setSize(400,300);
		f.setLocation(580,200);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		l.setIcon(i);
		l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
		// ���Ӽ��̼���
		f.addKeyListener(new KeyListener(){

			// һ�����µ������϶���
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			//��������
			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			/*
			 * 
			�Ѽ��̼����еĴ������ƣ�ʹ���ɵ�ǰ��ֻ�������ƶ�������Ϊ���������ƶ�������
			��ʾ��keyCode�뷽��Ķ�Ӧ��ϵ
			38 �� 
			40 ��
			37 ��
			39 ��		
			*/
			
			// ��������
			@Override
			public void keyReleased(KeyEvent e) {
				// 39�������� ���ҷ������
				if(e.getKeyCode() == 39) {
					// ͼƬ�����ƶ� ��y���겻�䣬x�������ӣ�
					l.setLocation(l.getX()+10, l.getY());
				}
				if(e.getKeyCode() == 38) {
					l.setLocation(l.getX(), l.getY()-10);
				}
				if(e.getKeyCode() == 40) {
					l.setLocation(l.getX(), l.getY()+10);
				}
				if(e.getKeyCode() == 37) {
					l.setLocation(l.getX()-10, l.getY());
				}
			}
			// ��������
		});
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
