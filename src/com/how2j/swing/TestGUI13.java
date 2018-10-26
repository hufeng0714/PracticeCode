package com.how2j.swing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGUI13 {

	public static void main(String[] args) {
		
		/*
			JPanel即为基本面板 
			面板和JFrame一样都是容器，不过面板一般用来充当中间容器，把组件放在面板上，然后再把面板放在窗体上。 
			一旦移动一个面板，其上面的组件，就会全部统一跟着移动，采用这种方式，便于进行整体界面的设计
		 */
		JFrame f = new JFrame("WOW");
		f.setSize(400,300);
		f.setLocation(100, 100);
		f.setLayout(null);
		
		JPanel p1 = new JPanel();
		// 设置面板大小
		p1.setBounds(50, 50, 300, 40);
		// 设置面板背景颜色
		p1.setBackground(Color.RED);
		// 这一句可以没有，因为JPanel默认就是采用的FlowLayout
		p1.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("hero 1");
		JButton b2 = new JButton("hero 2");
		JButton b3 = new JButton("hero 3");
		
		JPanel p2 = new JPanel();
		p2.setBounds(50, 140, 300, 40);
		p2.setBackground(Color.BLUE);
		JButton b4 = new JButton("hero 4");
		JButton b5 = new JButton("hero 5");
		JButton b6 = new JButton("hero 6");
				
		// 把按钮加入面板
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		f.add(p1);
		f.add(p2);
		
		
        // JFrame上有一层面板，叫做ContentPane
        // 平时通过f.add()向JFrame增加组件，其实是向JFrame上的 ContentPane加东西
        // f.add等同于f.getContentPane().add(b);
        // b.getParent()获取按钮b所处于的容器
        // 打印出来可以看到，实际上是ContentPane而非JFrame
		System.out.println(p1.getParent());
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		
	}

}
