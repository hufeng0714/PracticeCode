package com.how2j.swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestGUI15 {

	public static void main(String[] args) {
		/*
		使用带滚动条的面板有两种方式
		1. 在创建JScrollPane，把组件作为参数传进去
		JScrollPane sp = new JScrollPane(ta);
		2. 希望带滚动条的面板显示其他组件的时候，调用setViewportView
		sp.setViewportView(ta);
		*/
		JFrame f = new JFrame("wow");
		f.setSize(400,300);
		f.setLocation(200, 200);
		f.setLayout(null);
		
		//准备一个文本域，在里面放很多数据
        JTextArea ta = new JTextArea();
        for (int i = 0; i < 1000; i++) {
            ta.append(String.valueOf(i));
        }
        //自动换行
        ta.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta);
        f.setContentPane(sp); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}

}
