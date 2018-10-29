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
		 ���������ݵ����ݿ��У�Ȼ�����TableΪ��
		 */

public class TestGUI32 {

    public static void main(String[] args) {
    	 
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        final HeroTableModelDAO htm = new HeroTableModelDAO();
 
        final JTable t = new JTable(htm);
        // ���� һ�� panel���ڷ������ƣ�Ѫ������������ ��ť
        JPanel p = new JPanel();
 
        final JLabel lName = new JLabel("����");
        final JTextField tfName = new JTextField("");
        final JLabel lHp = new JLabel("Ѫ��");
        final JTextField tfHp = new JTextField("");
        JButton bAdd = new JButton("����");
        tfName.setPreferredSize(new Dimension(80, 30));
        tfHp.setPreferredSize(new Dimension(80, 30));
 
        p.add(lName);
        p.add(tfName);
        p.add(lHp);
        p.add(tfHp);
        p.add(bAdd);
 
        // Ϊ���Ӱ�ť��Ӽ���
        bAdd.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
 
                HeroDAO dao = new HeroDAO();
 
                // ������������ݴ���һ��Hero����
                Hero h = new Hero();
                h.name = tfName.getText();
                h.hp = Integer.parseInt(tfHp.getText());
 
                // ͨ��dao�Ѹö�����뵽���ݿ�
                dao.add(h);
 
                // ͨ��dao����tablemodel�е�����
                htm.heros = dao.list();
                // ����JTable��updateUI��ˢ�½��档
                // ˢ�½����ʱ�򣬻ᵽtablemodel��ȥȡ���µ�����
                // ���ܿ����¼ӽ�ȥ��������
 
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
