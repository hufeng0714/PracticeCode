package com.how2j.swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGUI09 {

	public static void main(String[] args) {

//		/*
//		 * ���Զ�λ
//		 * ���Զ�λ����ָ�����ò������������λ�úʹ�С��Ҫ����ָ��
//		 */
//		
//		JFrame f = new JFrame("WOW");
//		f.setSize(400, 300);
//		f.setLocation(200, 200);
//		// ���ò�����Ϊnull�������о��Զ�λ�������ϵ��������Ҫָ��λ�úʹ�С
//		f.setLayout(null);
//		
//		JButton b1 = new JButton("Hero 1");
//		 // ָ��λ�úʹ�С
//		b1.setBounds(50, 50, 80, 30);
//		JButton b2 = new JButton("Hero 2");
//		b2.setBounds(150, 50, 80, 30);
//		JButton b3 = new JButton("Hero 3");
//		b3.setBounds(250, 50, 80, 30);
//		// û��ָ��λ�úʹ�С�����������������
//        JButton b4 = new JButton("Hero 4");
//        
//        f.add(b1);
//        f.add(b2);
//        f.add(b3);
//        // b4û��ָ��λ�úʹ�С�����������������
//        f.add(b4);
//        
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
    
		
		
//      /*
//		FlowLayout
//		���ò�����ΪFlowLayout,˳�򲼾���
//		�����ϵ����ˮƽ�ڷ�
//		���뵽�������ɣ����赥��ָ����С��λ��
//        */
		/*
		 FlowLayout(int align, int hgap, int vgap)   
		 ��������
		 ����һ��FlowLayout��ָ�����뷽ʽ��ˮƽ��ֱ��ࡣ
		 */
//		JFrame f = new JFrame("WOW");
//		f.setSize(400,300);
//		f.setLocation(200, 200);
//        // ���ò�����ΪFlowLayerout
//        // �����ϵ����ˮƽ�ڷ�
//		f.setLayout(new FlowLayout());
//		
//        JButton b1 = new JButton("Ӣ��1");
//        JButton b2 = new JButton("Ӣ��2");
//        JButton b3 = new JButton("Ӣ��3");
//        // ���뵽�������ɣ����赥��ָ����С��λ��
//        f.add(b1);
//        f.add(b2);
//        f.add(b3);
//        
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        
		
		
		
//        /*
//        BorderLayout
//		���ò�����ΪBorderLayout
//		�����ϵ���������ϱ� ���� ���� �Ҷ� �е�˳��ڷ�
//         */
//		JFrame f = new JFrame("WOW");
//		f.setSize(400,300);
//		f.setLocation(200, 200);
//        // ���ò�����ΪBorderLayerout
//        // �����ϵ���������ϱ����������Ҷ��е�˳��ڷ�
//        f.setLayout(new BorderLayout());
// 
//        JButton b1 = new JButton("���߹�");
//        JButton b2 = new JButton("������");
//        JButton b3 = new JButton("ŷ����");
//        JButton b4 = new JButton("��ҩʦ");
//        JButton b5 = new JButton("�ܲ�ͨ");
//        // ���뵽������ʱ����Ҫָ��λ��
//        f.add(b1, BorderLayout.NORTH);
//        f.add(b2, BorderLayout.SOUTH);
//        f.add(b3, BorderLayout.WEST);
//        f.add(b4, BorderLayout.EAST);
//        f.add(b5, BorderLayout.CENTER);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        
        
        
//        /*
//         * GridLayout�������񲼾���
//         */
//		
//		JFrame f = new JFrame("WOW");
//		f.setSize(400,300);
//		f.setLocation(200, 200);
//
//        // ���ò�����ΪGridLayerout�������񲼾���
//        // ��GridLayerout�Ĺ��췽����ʾ��������2��3��
//		f.setLayout(new GridLayout(2, 3));
//		
//        JButton b1 = new JButton("���߹�");
//        JButton b2 = new JButton("������");
//        JButton b3 = new JButton("ŷ����");
//        JButton b4 = new JButton("��ҩʦ");
//        JButton b5 = new JButton("�ܲ�ͨ");
//
//        f.add(b1);
//        f.add(b2);
//        f.add(b3);
//        f.add(b4);
//        f.add(b5);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setVisible(true);
        
        
//        /*
//         * ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С.
//		ע ֻ�Բ��ֲ����������ã�����FlowLayout���������á� ����GridLayout�Ͳ������ã���Ϊ���񲼾����������
//         */
//        
//        JFrame f = new JFrame("LoL");
//        f.setSize(400, 300);
//        f.setLocation(200, 200);
//        f.setLayout(new FlowLayout());
// 
//        JButton b1 = new JButton("Ӣ��1");
//        JButton b2 = new JButton("Ӣ��2");
//        JButton b3 = new JButton("Ӣ��3");
// 
//        // ���� ʹ�� ������ ��Ҳ���� ͨ��setPreferredSize���򲼾�������������ʾ�Ĵ�С
//        b3.setPreferredSize(new Dimension(180, 40));
// 
//        f.add(b1);
//        f.add(b2);
//        f.add(b3);
// 
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 
//        f.setVisible(true);
		
		/*
		 * ��ҵ
		 * ʹ�ò����������������ϵİ�ťЧ��
		 */
		
		JFrame f = new JFrame("calc");
		f.setSize(360, 300);
		f.setLocation(200, 200);
		//4��5��
		f.setLayout(new FlowLayout());
		String s[]={"7","8","9","/","sq","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
        for(int i=0;i<20;i++) {
            JButton b1 = new JButton(s[i]);
            b1.setPreferredSize(new Dimension(58, 58));
            f.add(b1);
        }
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
