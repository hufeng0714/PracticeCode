package com.how2j.swing;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestGUI17 {

	public static void main(String[] args) {
		/*
		CardLayout 布局器 很像TabbedPanel ，在本例里面上面是一个下拉框，下面是一个CardLayout 的JPanel
		这个JPanel里有两个面板，可以通过CardLayout方便的切换
		*/
        JFrame f = new JFrame("CardLayerout");
        
        JPanel comboBoxPane = new JPanel();
        String buttonPanel = "按钮面板";
        String inputPanel = "输入框面板";
        String comboBoxItems[] = { buttonPanel, inputPanel };
        JComboBox<String> cb = new JComboBox<>(comboBoxItems);
        comboBoxPane.add(cb);
 
        // 两个Panel充当卡片
        JPanel card1 = new JPanel();
        card1.add(new JButton("按钮 1"));
        card1.add(new JButton("按钮 2"));
        card1.add(new JButton("按钮 3"));
 
        JPanel card2 = new JPanel();
        card2.add(new JTextField("输入框", 20));
 
        final JPanel cards; // a panel that uses CardLayout
        cards = new JPanel(new CardLayout());
        cards.add(card1, buttonPanel);
        cards.add(card2, inputPanel);
 
        f.add(comboBoxPane, BorderLayout.NORTH);
        f.add(cards, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 150);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
 
        cb.addItemListener(new ItemListener() {
 
            @Override
            public void itemStateChanged(ItemEvent evt) {
                CardLayout cl = (CardLayout) (cards.getLayout());
                cl.show(cards, (String) evt.getItem());
            }
        });
	}

}
