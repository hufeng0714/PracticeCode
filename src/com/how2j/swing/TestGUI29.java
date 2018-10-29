package com.how2j.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
		 显示一个Table需要两组数据 
		1. 一维数组： String[]columnNames 表示表格的标题 
		2. 二维数组： String[][] heros 表格中的内容 
		默认情况下，表格的标题是不会显示出来了，除非使用了JScrollPane
		 */
public class TestGUI29 {

	public static void main(String[] args) {
		
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
        // 表格上的title
        String[] columnNames = new String[] { "id", "name", "hp", "damage" };
        // 表格中的内容，是一个二维数组
        String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
                { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
        JTable t = new JTable(heros, columnNames);
        
		/*
		 JScrollPane: 带滚动条的Panel 
		把table放进去就可以看到table的title 
		同样的把textarea放进去，并且textarea内容够长的话，就会看到滚动条        
		 */
        
        // 根据t创建 JScrollPane
        JScrollPane sp = new JScrollPane(t);
 
        //或则创建一个空的JScrollPane，再通过setViewportView把table放在JScrollPane中
        // JScrollPane sp = new JScrollPane(t);
        // sp.setViewportView(t);
 
        // 设置列宽度
        t.getColumnModel().getColumn(0).setPreferredWidth(10);
        
        // 把sp而非JTable加入到JFrame上，
        //f.add(t, BorderLayout.CENTER);
        f.add(sp, BorderLayout.CENTER);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
	}

}
