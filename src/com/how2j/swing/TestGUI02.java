package com.how2j.swing;

		/**
		 * ����һ��������ʵ��ActionListener�ӿڣ�����ť�����ʱ��actionPerformed�����ͻᱻ����
		 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestGUI02 {

	public static void main(String[] args) {

		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(580,200);
		f.setLayout(null);
		//������ֻ�ܷ����ⲿ���final����
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		l.setIcon(i);
		l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
		
		final JButton b = new JButton("����ͼƬ");
		b.setBounds(150,200,100,30);
		
		// ����ť ���� ����
		b.addActionListener(new ActionListener(){
			
            // ����ť�����ʱ���ͻᴥ�� ActionEvent�¼�
            // actionPerformed �����ͻᱻִ��
			@Override
			public void actionPerformed(ActionEvent e) {
				//l.setVisible(false);
				/*
					�Ѱ�ť�����еİ�ť�ϵ����ִӡ�����ͼƬ�� ��Ϊ "��ʾͼƬ"��
					��һ�ε����ʱ�򣬻�ʹ��ͼƬ���أ��ڶ��ε����ʱ�򣬻�ʹ��ͼƬ��ʾ�����ѭ����ȥ��
					һ�������"����ͼƬ"����ť�ϵ����־�Ҫ��ɡ���ʾͼƬ�� ������ ���ѭ��
					��ʾ�� ����JButton�����setText�ı䰴ť�ϵ�����
				 */
				if(b.getText().equals("����ͼƬ")) {
                    l.setVisible(false);
                b.setText("��ʾͼƬ");
				}else {
                l.setVisible(true);
                b.setText("����ͼƬ");
                }              
			}
		});
		f.add(l);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
