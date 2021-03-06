package com.how2j.swing;

		import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.ImageIcon;

		/**
		MouseAdapter 鼠标监听适配器
		一般说来在写监听器的时候，会实现MouseListener。
		但是MouseListener里面有很多方法实际上都没有用到，比如mouseReleased ，mousePressed，mouseExited等等。
		这个时候就可以使用 鼠标监听适配器，MouseAdapter 只需要重写必要的方法即可。
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
		
		// MouseAdapter 适配器，只需要重写用到的方法，没有用到的就不用写了
		l.addMouseListener(new MouseAdapter() {
			// 只有mouseEntered用到了
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
