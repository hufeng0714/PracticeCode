package com.how2j.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.how2j.jdbc.Hero;
import com.how2j.jdbc.HeroDAO;

/*
		 以新增数据到数据库中，然后更新Table为例
		 */

public class TestGUI32 {

    public static void main(String[] args) {
    	 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        final HeroTableModelDAO htm = new HeroTableModelDAO();
 
        final JTable t = new JTable(htm);
        // 增加 一个 panel用于放置名称，血量输入框和增加 按钮
        JPanel p = new JPanel();
 
        final JLabel lName = new JLabel("名称");
        final JTextField tfName = new JTextField("");
        final JLabel lHp = new JLabel("血量");
        final JTextField tfHp = new JTextField("");
        JButton bAdd = new JButton("增加");
        tfName.setPreferredSize(new Dimension(80, 30));
        tfHp.setPreferredSize(new Dimension(80, 30));
 
        p.add(lName);
        p.add(tfName);
        p.add(lHp);
        p.add(tfHp);
        p.add(bAdd);
 
        // 为增加按钮添加监听
        bAdd.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
 
                HeroDAO dao = new HeroDAO();
 
                // 根据输入框数据创建一个Hero对象
                Hero h = new Hero();
                h.name = tfName.getText();
                h.hp = Integer.parseInt(tfHp.getText());
 
                // 通过dao把该对象加入到数据库
                dao.add(h);
 
                // 通过dao更新tablemodel中的数据
                htm.heros = dao.list();
                // 调用JTable的updateUI，刷新界面。
                // 刷新界面的时候，会到tablemodel中去取最新的数据
                // 就能看到新加进去的数据了
 
                t.updateUI();
            }
        });
 
        JScrollPane sp = new JScrollPane(t);
 
        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
