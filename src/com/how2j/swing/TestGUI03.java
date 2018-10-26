package com.how2j.swing;

		/**
		 键盘监听器： KeyListener
		keyPressed 代表 键被按下
		keyReleased 代表 键被弹起
		keyTyped 代表 一个按下弹起的组合动作
		KeyEvent.getKeyCode() 可以获取当前点下了哪个键
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
		// 增加键盘监听
		f.addKeyListener(new KeyListener(){

			// 一个按下弹起的组合动作
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			//键被按下
			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			/*
			 * 
			把键盘监听中的代码完善，使得由当前的只能向右移动，完善为上下左右移动都可以
			提示：keyCode与方向的对应关系
			38 上 
			40 下
			37 左
			39 右		
			*/
			
			// 键被弹起
			@Override
			public void keyReleased(KeyEvent e) {
				// 39代表按下了 “右方向键”
				if(e.getKeyCode() == 39) {
					// 图片向右移动 （y坐标不变，x坐标增加）
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
			// 键被弹起
		});
		f.add(l);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
