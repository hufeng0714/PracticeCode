package com.how2j.swing;

import javax.swing.JButton;
import javax.swing.JDialog;


		/*
		 JFrame����õĴ�����������Ĭ������£������Ͻ��������С����ť
		 JDialogҲ�Ǵ��������������Ͻ�û��������С����ť
		 */
public class TestGUI06 {

	public static void main(String[] args) {

		JDialog d = new JDialog();
		d.setTitle("wow");
		d.setSize(400,300);
		d.setLocation(200, 200);
		d.setLayout(null);
		
		JButton b = new JButton("һ����Է����ع�");
		b.setBounds(20, 20, 280, 30);
		
		d.add(b);
		
		d.setVisible(true);
		
	}

}
