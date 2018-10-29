package com.how2j.swing;

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

public class TestGUI19 {

	public static void main(String[] args) {
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(null);
        JPanel pLeft = new JPanel();
        pLeft.setBounds(50, 50, 300, 60);
        pLeft.setLayout(new FlowLayout());
        JButton b1 = new JButton("����");
        JButton b2 = new JButton("��Ī");
        JButton b3 = new JButton("����");
        pLeft.add(b1);
        pLeft.add(b2);
        pLeft.add(b3);
        
        JPanel pRight = new JPanel();
        JLabel l = new JLabel();
        ImageIcon i = null;
        l.setIcon(i);
        pRight.add(l);
        pRight.setBounds(10, 150, 300, 60);
        
        JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pLeft, pRight);
        sp.setDividerLocation(80);
        f.setContentPane(sp);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        switchpic(b1, "gareen", l);
        switchpic(b2, "teemo", l);
        switchpic(b3, "annie", l);
    }
	//�������е����⣬�Ժ������о�
    private static void switchpic(JButton b, final String fileName, final JLabel l) {
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\"+fileName+".jpg");
                l.setIcon(i);
            }
        });
    }

}
