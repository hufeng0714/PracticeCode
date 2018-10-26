package com.how2j.swing;

		import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;

		/**
		MouseAdapter ������������
		һ��˵����д��������ʱ�򣬻�ʵ��MouseListener��
		����MouseListener�����кܶ෽��ʵ���϶�û���õ�������mouseReleased ��mousePressed��mouseExited�ȵȡ�
		���ʱ��Ϳ���ʹ�� ��������������MouseAdapter ֻ��Ҫ��д��Ҫ�ķ������ɡ�
		 */

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI05 {

	public static void main(String[] args) {

		final JFrame f = new JFrame("WOW");
		f.setSize(800, 600);
		f.setLocationRelativeTo(null);
		f.setLayout(null);
		
		final JLabel l = new JLabel("");
		
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		l.setIcon(i);
		l.setBounds(375, 375, i.getIconWidth(), i.getIconHeight());
		
		f.add(l);
		
		// MouseAdapter ��������ֻ��Ҫ��д�õ��ķ�����û���õ��ľͲ���д��
		l.addMouseListener(new MouseAdapter() {
			// ֻ��mouseEntered�õ���
			public void mouseEntered(MouseEvent e) {
				Random r = new Random();
				int x = r.nextInt(f.getWidth() - l.getWidth());
				int y = r.nextInt(f.getHeight() - l.getHeight());
				l.setLocation(x, y);
			}
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
