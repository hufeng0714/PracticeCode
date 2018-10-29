package com.how2j.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

import com.how2j.jdbc.Hero;
import com.how2j.jdbc.HeroDAO;

/*
		1. table��ʼ����Ӧ��Ĭ��ѡ�е�һ�� 
		2. �������ݺ�ҲӦ��ѡ����������һ��
		 */

public class TestGUI34 {
    public static void main(String[] args) {
    	 
        final JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        final HeroTableModelDAO htm = new HeroTableModelDAO();
 
        final JTable t = new JTable(htm);
        // ����ѡ��ģʽΪ ֻ��ѡ��һ��
        t.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // ѡ�е�һ�� ������0��
        t.getSelectionModel().setSelectionInterval(0, 0);
 
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
 
        bAdd.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent e) {
 
                HeroDAO dao = new HeroDAO();
 
                Hero h = new Hero();
                String name = tfName.getText();
 
                if (name.length() == 0) {
 
                    JOptionPane.showMessageDialog(f, "���Ʋ���Ϊ��");
 
                    tfName.grabFocus();
                    return;
                }
 
                String hp = tfHp.getText().trim();
 
                try {
 
                    Float.parseFloat(hp);
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(f, "Ѫ��ֻ����С�� ");
                    tfHp.grabFocus();
                    return;
                }
 
                h.name = name;
 
                h.hp = Float.parseFloat(hp);
 
                dao.add(h);
 
                htm.heros = dao.list();
 
                t.updateUI();
 
                // ѡ�� ��һ�� ����Ϊ DAO�ǰ��� ID�������ѯ�����Ե�һ�о����¼��������
                t.getSelectionModel().setSelectionInterval(0, 0);
            }
        });
 
        JScrollPane sp = new JScrollPane(t);
 
        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
