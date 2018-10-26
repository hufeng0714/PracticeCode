package com.how2j.swing;

import javax.swing.JButton;
import javax.swing.JDialog;


		/*
		 JFrame是最常用的窗体型容器，默认情况下，在右上角有最大化最小化按钮
		 JDialog也是窗体型容器，右上角没有最大和最小化按钮
		 */
public class TestGUI06 {

	public static void main(String[] args) {

		JDialog d = new JDialog();
		d.setTitle("wow");
		d.setSize(400,300);
		d.setLocation(200, 200);
		d.setLayout(null);
		
		JButton b = new JButton("一键秒对方基地挂");
		b.setBounds(20, 20, 280, 30);
		
		d.add(b);
		
		d.setVisible(true);
		
	}

}
