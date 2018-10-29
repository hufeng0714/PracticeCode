package com.how2j.swing;

			/*
			首先说下TableModel的设计思想，在Model这种思想的指导下，数据和显示分离开来了。 比如对于JTable而言，有数据部分，也有显示部分(比如列宽等信息)。
			 数据部分，专门做一个类，叫做TableModel，就用于存放要显示的数据。
			
			使用TableModel的方式存放Table需要显示的数据
			HeroTableModel 继承AbstractTableModel ，进而实现了接口TableModel
			在HeroTableModel 中提供一个table显示需要的所有信息
			1. getRowCount 返回一共有多少行
			2. getColumnCount 返回一共有多少列
			3. getColumnName 每一列的名字
			4. isCellEditable 单元格是否可以修改
			5. getValueAt 每一个单元格里的值
			
			当图形界面需要渲染第一个单元格的数据的时候，就会调用方法TabelModel的getValueAt(0,0) ，把返回值拿到并显示
			*/

			/*
			 通过TableModel与DAO结合显示数据库中Hero信息。
			DAO使用HeroDAO
			在TableModel中，使用从DAO返回的List作为TableModel的数据
			
			只需要修改HeroTableModel，无需修改TestGUI。 这正好演绎了Model设计思想中的数据分离的好处，当只需要数据发生变化的时候，修改Model即可，界面GUI部分，不需要做任何改动
			 */

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TestGUI30 {
    public static void main(String[] args) {
    	  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        //创建一个TableModel
        //HeroTableModel htm= new HeroTableModel();
        HeroTableModelDAO htm= new HeroTableModelDAO();
         
        //根据 TableModel来创建 Table
        JTable t = new JTable(htm);
  
        JScrollPane sp = new JScrollPane(t);
  
        f.add(sp, BorderLayout.CENTER);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}
