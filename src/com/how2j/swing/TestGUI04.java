package com.how2j.swing;

		/**
		MouseListener ��������
		mouseReleased ����ͷ�
		mousePressed ��갴��
		mouseExited ����˳�
		mouseEntered ������
		mouseClicked �����
		�ڱ����У�ʹ��mouseEntered����������ͼƬ��ʱ��ͼƬ���ƶ�λ��
		 */

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI04 {

	public static void main(String[] args) {

		final JFrame f = new JFrame("WOW");
		f.setSize(800,600);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		final JLabel l = new JLabel();
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		l.setIcon(i);
		l.setBounds(375, 375, i.getIconWidth(), i.getIconHeight());
		
		f.add(l);
		
		l.addMouseListener(new MouseListener() {

			// �����ͷ���϶���Ϊ������
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			// �������
			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			// �ͷ����
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			// ������
			@Override
			public void mouseEntered(MouseEvent e) {
				Random r = new Random();
				int x = r.nextInt(f.getWidth() - l.getWidth());
				int y = r.nextInt(f.getHeight() - l.getHeight());
				l.setLocation(x, y);
			}

			 // ����˳�
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
