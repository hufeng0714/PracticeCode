package com.how2j.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/* 
 * TestGUI19�������� 
 */

public class TestGUI18 {

	public static void main(String[] args) {

		JFrame f = new JFrame("LOL");
		f.setSize(400,300);
		f.setLocation(200, 200);
		f.setLayout(null);
		
		JPanel pLeft = new JPanel();
		pLeft.setBounds(50, 50, 300, 60);
		pLeft.setBackground(Color.GRAY);
		pLeft.setLayout(new FlowLayout());
		
        JButton b1 = new JButton("����");
        JButton b2 = new JButton("��Ī");
        JButton b3 = new JButton("����");
  
        pLeft.add(b1);
        pLeft.add(b2);
        pLeft.add(b3);
        
        JPanel pRight = new JPanel();
        pRight.setBounds(10, 150, 300, 60);
        pRight.setBackground(Color.GRAY);
        
        final JLabel l = new JLabel();
        pRight.add(l);
        
        //����һ��ˮƽJSplitPane�������p1,�ұ���p2
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,pLeft,pRight);
        // ���÷ָ�����λ��
        sp.setDividerLocation(80);
        // ��sp����ContentPane
        f.setContentPane(sp);
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\gareen.jpg");
		        l.setIcon(i);
		        //l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
			}
        });
        
        b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\teemo.jpg");
		        l.setIcon(i);
		        //l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
			}
        });
        
        b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
		        ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\annie.jpg");
		        l.setIcon(i);
		        //l.setBounds(50,50,i.getIconWidth(),i.getIconHeight());
			}
        });
        
	}

}
