package com.how2j.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class TestGUI12 {

	public static void main(String[] args) {
		/*
		 JFileChooser ��ʾ�ļ�ѡ����
		   ʹ��FileFilter���ڽ�ѡ��.txt�ļ�
		 */
		
		final JFrame f = new JFrame("WOW");
		f.setLayout(new FlowLayout());
		final JFileChooser fc = new JFileChooser();
		fc.setFileFilter(new FileFilter() {

			@Override
			public boolean accept(File f) {
				return f.getName().toLowerCase().endsWith(".txt");
			}

			@Override
			public String getDescription() {
				return ".txt";
			}
			
		});
		
		JButton bOpen = new JButton("���ļ�");
		JButton bSave = new JButton("�����ļ�");
		
		f.add(bOpen);
		f.add(bSave);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(250,150);
		f.setLocationRelativeTo(null);
		
		f.setVisible(true);
		
        bOpen.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
                int returnVal =  fc.showOpenDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f, "�ƻ����ļ�:" + file.getAbsolutePath());
                }
			}
        });
        bSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int returnVal =  fc.showSaveDialog(f);
                File file = fc.getSelectedFile();
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(f, "�ƻ����浽�ļ�:" + file.getAbsolutePath());
                }
            }
        });
	}

}
