package com.how2j.swing;

		/**
		MouseListener 鼠标监听器
		mouseReleased 鼠标释放
		mousePressed 鼠标按下
		mouseExited 鼠标退出
		mouseEntered 鼠标进入
		mouseClicked 鼠标点击
		在本例中，使用mouseEntered，当鼠标进入图片的时候，图片就移动位置
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

			// 按下释放组合动作为点击鼠标
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}

			// 按下鼠标
			@Override
			public void mousePressed(MouseEvent e) {
				
			}

			// 释放鼠标
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}

			// 鼠标进入
			@Override
			public void mouseEntered(MouseEvent e) {
				Random r = new Random();
				int x = r.nextInt(f.getWidth() - l.getWidth());
				int y = r.nextInt(f.getHeight() - l.getHeight());
				l.setLocation(x, y);
			}

			 // 鼠标退出
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
			
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
