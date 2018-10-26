package com.how2j.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

		/*
		 首先设计一个JFrame,上面有一个按钮，文字是 "打开一个模态窗口"。
		点击该按钮后，随即打开一个模态窗口。
		在这个模态窗口中有一个按钮，文本是 "锁定大小", 点击后，这个模态窗口的大小就被锁定住，不能改变。 再次点击，就回复能够改变大小
		 */


public class TestGUI08 {

	public static void main(String[] args) {

		JFrame f = new JFrame("WOW");
		f.setSize(800, 600);
		f.setLocation(100, 100);
		f.setLayout(null);
		
		final JDialog d = new JDialog(f);
		d.setTitle("这是个模态窗口");
		d.setSize(600, 300);
		d.setLocation(200, 330);
		d.setModal(true);
		d.setLayout(null);
		
		JButton b1 = new JButton("打开一个模态窗口");		
		b1.setBounds(100, 100, 600, 30);
		//这种监控方式也行
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
		
		final JButton b2 = new JButton("锁定大小");
		b2.setBounds(100, 100, 400, 30);
//		b2.addMouseListener(new MouseAdapter() {
//			
//			public void mouseClicked(MouseEvent e) {
//				if(b2.getText().equals("锁定大小")) {
//					b2.setText("解锁大小");
//					d.setResizable(false);
//				}else {
//					b2.setText("锁定大小");
//					d.setResizable(true);
//				}
//			}	
//		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(b2.getText().equals("锁定大小")) {
					b2.setText("解锁大小");
					d.setResizable(false);
				}else {
					b2.setText("锁定大小");
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
