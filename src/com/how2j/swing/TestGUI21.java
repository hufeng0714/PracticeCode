package com.how2j.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class TestGUI21 {

	public static void main(String[] args) {

		final JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200, 200);
		f.setLayout(new FlowLayout());
		
		final JTextField tf = new JTextField();
		tf.setPreferredSize(new Dimension(80,30));
		
		JButton b = new JButton("���");
		
//		b.addActionListener(new ActionListener() {
//
//			/*
//			��ϰ-Ϊ���ж�
//			��JTextField���������ݣ����Ա߼�һ����ťJButton,�������ť��ʱ��
//			�ж�JTextFiled����û�����ݣ���ʹ��JOptionPane������ʾ
//			 */
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String text = tf.getText();
//				if(text.length() == 0) {
//					JOptionPane.showMessageDialog(f, "��");
//					tf.grabFocus();
//				}else {
//					JOptionPane.showMessageDialog(f, "��");
//				}
//			}
//			
//		});
		
		
		/*
		���� 3 : ��ϰ-����У��  
		��JTextField���������ݣ����Ա߼�һ����ťJButton,�������ť��ʱ��
		�ж�JTextFiled�е������Ƿ������֣���ʹ��JOptionPane������ʾ
		 */
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String text = tf.getText();
				try {
					Integer.parseInt(text);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(f, "��������");
					tf.grabFocus();
				}
			}
			
		});
		
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
