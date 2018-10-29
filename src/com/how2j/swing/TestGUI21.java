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
		
		JButton b = new JButton("检测");
		
//		b.addActionListener(new ActionListener() {
//
//			/*
//			练习-为空判断
//			在JTextField中输入数据，在旁边加一个按钮JButton,当点击按钮的时候，
//			判断JTextFiled中有没有数据，并使用JOptionPane进行提示
//			 */
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String text = tf.getText();
//				if(text.length() == 0) {
//					JOptionPane.showMessageDialog(f, "空");
//					tf.grabFocus();
//				}else {
//					JOptionPane.showMessageDialog(f, "有");
//				}
//			}
//			
//		});
		
		
		/*
		步骤 3 : 练习-数字校验  
		在JTextField中输入数据，在旁边加一个按钮JButton,当点击按钮的时候，
		判断JTextFiled中的数据是否是数字，并使用JOptionPane进行提示
		 */
		
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String text = tf.getText();
				try {
					Integer.parseInt(text);
				}catch(NumberFormatException e1) {
					JOptionPane.showMessageDialog(f, "不是数字");
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
