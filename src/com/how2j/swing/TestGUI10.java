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
		 JAVA��ͼ�ν�����������ؼ���һ����awt,һ����swing�� 
		һ�㶼��ʹ��swing
		 */
public class TestGUI10 {

	public static void main(String[] args) {

		JFrame f = new JFrame("WOW");
		f.setSize(400,600);
		f.setLocation(200, 200);
		f.setLayout(null);
		/*
		 * Label������ʾ����
		 */
//		JLabel l = new JLabel();
//		l.setText("LOL����");
		JLabel l = new JLabel("LOL����");
		l.setBounds(50, 50, 280, 30);
		l.setForeground(Color.red);;
		
		//ʹ��JLabel��ʾͼƬ
		//java GUI ��ʾͼƬ��ͨ����label������ͼ��ʵ�ֵ�
		JLabel l1 = new JLabel();
		
		ImageIcon i = new ImageIcon("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\dd.png");
		//����ImageIcon
		l1.setIcon(i);
		//label�Ĵ�С����ΪImageIcon,������ʾ������
		l1.setBounds(50,100,i.getIconWidth(),i.getIconHeight());
		
		//JButton ��ͨ��ť
		JButton b = new JButton("����");
		b.setBounds(50, 150, 200, 30);
		
		
		/*
		JCheckBox ��ѡ��
		ʹ��isSelected����ȡ�Ƿ�ѡ����
		 */
		
		JCheckBox bCheckBox = new JCheckBox("����Ӣ��");
		bCheckBox.setSelected(true);
		bCheckBox.setBounds(50, 200, 130, 30);
		
		JCheckBox bCheckBox2 = new JCheckBox("ħ��Ӣ��");
		bCheckBox2.setBounds(50, 250, 130, 30);
		
		System.out.println(bCheckBox2.isSelected());
		
		/*
		 JRadioButton ��ѡ��
		   ʹ��isSelected����ȡ�Ƿ�ѡ���� 
		    ����������������ѡ����Ա�ͬʱѡ�У�Ϊ��ʵ��ֻ��ѡ��һ��������Ҫ�õ�ButtonGroup
		 */
		
		JRadioButton rb1 = new JRadioButton("����Ӣ��");
		rb1.setSelected(true);
		rb1.setBounds(50, 300, 130, 30);
		
		JRadioButton rb2 = new JRadioButton("ħ��Ӣ��");
		rb2.setBounds(50, 350, 130, 30);
		
		JRadioButton rb3 = new JRadioButton("̹��Ӣ��");
		rb3.setSelected(true);
		rb3.setBounds(50, 400, 130, 30);
		
		JRadioButton rb4 = new JRadioButton("����Ӣ��");
		rb4.setBounds(50, 450, 130, 30);
		
		// ��ť����
		ButtonGroup bg = new ButtonGroup();
		// ��b3��b4���� ͬһ�� ��ť��������� ������ͬһʱ�䣬ֻ��һ�� ��ť �ᱻѡ��
		bg.add(rb3);
		bg.add(rb4);
		
		/*
			JComboBox ������
			ʹ��getSelectedItem����ȡ��ѡ����
			ʹ��setSelectedItem() ��ָ��Ҫѡ����
		 */
		
        //��������ֵ���Ŀ
        String[] heros = new String[] { "��������", "����" };
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
		JOptionPane ���ڵ����Ի���

		JOptionPane.showConfirmDialog(f, "�Ƿ� ʹ����� ��");
		��ʾѯ�ʣ���һ�������ǸöԻ������ĸ��������
		JOptionPane.showInputDialog(f, "������yes������ʹ����Һ���Ը�");
		�����û�������
		JOptionPane.showMessageDialog(f, "��ʹ����ұ�ץס�� �������3�Σ�");
		��ʾ��Ϣ
		 */
		int option = JOptionPane.showConfirmDialog(f, "�Ƿ�ʹ�����?");
		if(JOptionPane.OK_OPTION == option) {
			String answer = JOptionPane.showInputDialog(f, "������yes������ʹ����Һ���Ը�");
			if("yes".equals(answer))
				JOptionPane.showMessageDialog(f,"���3��");
		}
	}

}
