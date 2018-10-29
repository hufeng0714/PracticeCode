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

import com.how2j.jdbc.Hero;
import com.how2j.jdbc.HeroDAO;

/*
		 ����û����������Ϊ�գ�����Ѫ������С�������ύ���ݵ�ʱ�򶼻ᱨ�� 
		���о��ϡ� ����Ϳ�ס�ˡ� ���ǲ��Ѻõ��˻�������Ϊ�� 
		������Ҫ�������������֤�������������ݲ��ϸ�Ӧ�õ����Ի�����ʾ�û�����ԭ��
		 */
public class TestGUI33 {

    public static void main(String[] args) {
    	 
        final JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
 
        final HeroTableModelDAO htm = new HeroTableModelDAO();
 
        final JTable t = new JTable(htm);
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
 
                // ͨ��name�����ж� �����Ƿ�Ϊ��
                if (name.length() == 0) {
                    // �����Ի�����ʾ�û�
                    JOptionPane.showMessageDialog(f, "���Ʋ���Ϊ��");
 
                    // ����������ȡ����
                    tfName.grabFocus();
                    return;
                }
 
                String hp = tfHp.getText().trim();
 
                try {
                    // ��hpת��Ϊ�����ͣ���������쳣NumberFormatException��ʾ���Ǹ����͸�ʽ
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
 
            }
        });
 
        JScrollPane sp = new JScrollPane(t);
 
        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);
 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        f.setVisible(true);
    }
}
