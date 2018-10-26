package com.how2j.swing;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestGUI11 {

	public static void main(String[] args) {
		/*
		JTextField �����
		setText �����ı�
		getText ��ȡ�ı�
		JTextField �ǵ����ı������Ҫ����������ݣ���ʹ��JTextArea
		
		tfPassword.grabFocus(); ��ʾ������������ȡ����
		 */
		
		JFrame f = new JFrame("WOW");
		f.setSize(300,400);
		f.setLocation(200, 200);
		f.setLayout(new FlowLayout());

		
		JLabel lName = new JLabel("�˺ţ�");
		JTextField tfName = new JTextField("");
		tfName.setText("�������˺�");
		/*
		1.setPreferredSize��Ҫ��ʹ�ò��ֹ�������ʱ��ʹ�ã����ֹ��������ȡ�ռ��preferredsize�����������Ч��
		����borderlayout��north�з���һ��panel��panel�ĸ߶ȿ���ͨ������ʵ�֣�panel.setPreferredSize(new Dimension(0, 100));
		������������һ���߶�Ϊ100��panel������洰�ڱ仯��
		
		2.setSize,setLocation,setBounds������Ҫ�ڲ�ʹ�ò��ֹ�������ʱ��ʹ�ã�Ҳ����setLayout(null)��ʱ�����ʹ���������������Ʋ��֡�
		 */
		tfName.setPreferredSize(new Dimension(80, 30));
		
		JLabel lPassword = new JLabel("���룺");
		JTextField tfPassword = new JTextField("");
		tfPassword.setText("����������");
		tfName.setPreferredSize(new Dimension(80, 30));
		
		/*
		JPasswordField ����� 
		���ı���ͬ����ȡ�����������ݣ��Ƽ�ʹ��getPassword���÷����᷵��һ���ַ����飬�����ַ���
		 */
		
		JLabel lPassword1 = new JLabel("��������");
		JPasswordField pf = new JPasswordField("");
		pf.setText("&48kdh4@#");
		pf.setPreferredSize(new Dimension(80,30));
		// ���ı���ͬ����ȡ�����������ݣ��Ƽ�ʹ��getPassword���÷����᷵��һ���ַ����飬�����ַ���
		char[] password = pf.getPassword();
		String p = String.valueOf(password);
		System.out.println(p);
		
		/*
			JTextArea���ı���
			���ı���JTextField��ͬ���ǣ��ı�����������������
			���Ҫ���ı����ʼ�ı���ͨ��\n��ʵ�ֻ���Ч��
			JTextAreaͨ�����õ�append����������׷��
			����ı�̫�������ܳ�ȥ������ͨ��setLineWrap(true) �������Զ�����
		 */
		
		JLabel lta = new JLabel("�ı���");
		JTextArea ta = new JTextArea();
		ta.setPreferredSize(new Dimension(200,150));
        //\n���з�
        ta.setText("����ͷ��\n�����ð�����\n");
        //׷������
        ta.append("��ȥ��������������������������������������������������");
        //�����Զ�����
        ta.setLineWrap(true);
		
        /*
         * JProgressBar
         * ������
         */
        final JProgressBar pb = new JProgressBar();
      //���������100
        pb.setMaximum(100);
        //��ǰ������50
        //pb.setValue(50);
        new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<101;i++) {
					try {
						Thread.sleep(100);
						pb.setValue(i);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
        	
        }).start();
        //��ʾ��ǰ����
        pb.setStringPainted(true);
        
        
		f.add(lName);
		f.add(tfName);
		f.add(lPassword);
		f.add(tfPassword);		
		
		f.add(lPassword1);
		f.add(pf);
		
		f.add(lta);
		f.add(ta);
		
		f.add(pb);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
