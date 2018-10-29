package com.how2j.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.how2j.jdbc.Hero;

/*
		 ͨ��table���Ի�ȡһ�� TableSelectionModel��ר�����ڼ���jtableѡ����ı仯
		 */

public class TestGUI31 {
    public static void main(String[] args) {
    	  
        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(200, 200);
        f.setLayout(new BorderLayout());
  
        final HeroTableModelDAO htm = new HeroTableModelDAO();
  
        final JTable t = new JTable(htm);
        // ׼��һ��Panel�����һ��Label������ʾ������ѡ����
        JPanel p = new JPanel();
        final JLabel l = new JLabel("��ʱδѡ����Ŀ");
        p.add(l);
  
        JScrollPane sp = new JScrollPane(t);
  
        // ʹ��selection������������table���ĸ���Ŀ��ѡ��
        t.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
  
                    // ��ѡ����ĳһ�е�ʱ�򴥷����¼�
                    public void valueChanged(ListSelectionEvent e) {
                        // ��ȡ��һ�б�ѡ����
                        int row = t.getSelectedRow();
                        // ����ѡ�е��У���HeroTableModel�л�ȡ��Ӧ�Ķ���
                        Hero h = htm.heros.get(row);
                        // ���±�ǩ����
                        l.setText("��ǰѡ�е�Ӣ���ǣ� " + h.name);
  
                    }
                });
  
        f.add(p, BorderLayout.NORTH);
        f.add(sp, BorderLayout.CENTER);
  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        f.setVisible(true);
    }
}
