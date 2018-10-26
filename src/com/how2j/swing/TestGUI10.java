package com.how2j.swing;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

		/*
		 JAVA的图形界面下有两组控件，一组是awt,一组是swing。 
		一般都是使用swing
		 */
public class TestGUI10 {

	public static void main(String[] args) {

		JFrame f = new JFrame("WOW");
		f.setSize(400,600);
		f.setLocation(200, 200);
		f.setLayout(null);
		/*
		 * Label用于显示文字
		 */
//		JLabel l = new JLabel();
//		l.setText("LOL文字");
		JLabel l = new JLabel("LOL文字");
		l.setBounds(50, 50, 280, 30);
		l.setForeground(Color.red);;
		
		//使用JLabel显示图片
		//java GUI 显示图片是通过在label上设置图标实现的
		JLabel l1 = new JLabel();
		
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		//设置ImageIcon
		l1.setIcon(i);
		//label的大小设置为ImageIcon,否则显示不完整
		l1.setBounds(50,100,i.getIconWidth(),i.getIconHeight());
		
		//JButton 普通按钮
		JButton b = new JButton("测试");
		b.setBounds(50, 150, 200, 30);
		
		
		/*
		JCheckBox 复选框
		使用isSelected来获取是否选中了
		 */
		
		JCheckBox bCheckBox = new JCheckBox("物理英雄");
		bCheckBox.setSelected(true);
		bCheckBox.setBounds(50, 200, 130, 30);
		
		JCheckBox bCheckBox2 = new JCheckBox("魔法英雄");
		bCheckBox2.setBounds(50, 250, 130, 30);
		
		System.out.println(bCheckBox2.isSelected());
		
		/*
		 JRadioButton 单选框
		   使用isSelected来获取是否选中了 
		    在这个例子里，两个单选框可以被同时选中，为了实现只能选中一个，还需要用到ButtonGroup
		 */
		
		JRadioButton rb1 = new JRadioButton("物理英雄");
		rb1.setSelected(true);
		rb1.setBounds(50, 300, 130, 30);
		
		JRadioButton rb2 = new JRadioButton("魔法英雄");
		rb2.setBounds(50, 350, 130, 30);
		
		JRadioButton rb3 = new JRadioButton("坦克英雄");
		rb3.setSelected(true);
		rb3.setBounds(50, 400, 130, 30);
		
		JRadioButton rb4 = new JRadioButton("治疗英雄");
		rb4.setBounds(50, 450, 130, 30);
		
		// 按钮分组
		ButtonGroup bg = new ButtonGroup();
		// 把b3，b4放在 同一个 按钮分组对象里 ，这样同一时间，只有一个 按钮 会被选中
		bg.add(rb3);
		bg.add(rb4);
		
		/*
			JComboBox 下拉框
			使用getSelectedItem来获取被选中项
			使用setSelectedItem() 来指定要选中项
		 */
		
        //下拉框出现的条目
        String[] heros = new String[] { "卡特琳娜", "库奇" };
		JComboBox cb = new JComboBox(heros);
		cb.setBounds(50, 500, 130, 30);
				
		f.add(l);
		f.add(l1);
		f.add(b);
		
		f.add(bCheckBox);
		f.add(bCheckBox2);
		
		f.add(rb1);
		f.add(rb2);
		
		f.add(rb3);
		f.add(rb4);
		
		f.add(cb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		/*
		JOptionPane 用于弹出对话框

		JOptionPane.showConfirmDialog(f, "是否 使用外挂 ？");
		表示询问，第一个参数是该对话框以哪个组件对齐
		JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
		接受用户的输入
		JOptionPane.showMessageDialog(f, "你使用外挂被抓住！ 罚拣肥皂3次！");
		显示消息
		 */
		int option = JOptionPane.showConfirmDialog(f, "是否使用外挂?");
		if(JOptionPane.OK_OPTION == option) {
			String answer = JOptionPane.showInputDialog(f, "请输入yes，表明使用外挂后果自负");
			if("yes".equals(answer))
				JOptionPane.showMessageDialog(f,"封号3年");
		}
	}

}
