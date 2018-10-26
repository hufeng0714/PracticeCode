package com.how2j.swing;

		/**
		 * 创建一个匿名类实现ActionListener接口，当按钮被点击时，actionPerformed方法就会被调用
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
		//匿名类只能访问外部类的final变量
		final JLabel l = new JLabel();
		
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		l.setIcon(i);
		l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());
		
		final JButton b = new JButton("隐藏图片");
		b.setBounds(150,200,100,30);
		
		// 给按钮 增加 监听
		b.addActionListener(new ActionListener(){
			
            // 当按钮被点击时，就会触发 ActionEvent事件
            // actionPerformed 方法就会被执行
			@Override
			public void actionPerformed(ActionEvent e) {
				//l.setVisible(false);
				/*
					把按钮监听中的按钮上的文字从“隐藏图片” 改为 "显示图片"。
					第一次点击的时候，会使得图片隐藏，第二次点击的时候，会使得图片显示，如此循环下去。
					一旦点击了"隐藏图片"，按钮上的文字就要变成“显示图片” 。。。 如此循环
					提示： 调用JButton对象的setText改变按钮上的文字
				 */
				if(b.getText().equals("隐藏图片")) {
                    l.setVisible(false);
                b.setText("显示图片");
				}else {
                l.setVisible(true);
                b.setText("隐藏图片");
                }              
			}
		});
		f.add(l);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
