package com.how2j.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/*
		���һ���̣߳�ÿ��100���룬�Ͱѽ������Ľ���+1��
		��0%һֱ�ӵ�100%
		�տ�ʼ�ӵıȽϿ죬��ÿ��100������ٶ����ӣ����Ž��ȵ����ӣ�Խ��Խ�����ô�Ů����ʹ���ߣ����ż�
		��ö������������Ǻʹ�Ů��ͬѧ�����ѵ��ദ���飬�Լ��ѿ�
		 */

public class TestGUI25 {

	 public static void main(String[] args) {

	        JFrame f = new JFrame("LoL");
	        f.setSize(400, 300);
	        f.setLocation(200, 200);

	        f.setLayout(new FlowLayout());

	        final JProgressBar pb = new JProgressBar();

	        pb.setMaximum(100);
	        pb.setValue(0);
	        pb.setStringPainted(true);

	        new Thread() {
	            public void run() {
	                int sleep = 100;
	                for (int i = 0; i < 100; i++) {
	                    pb.setValue(i + 1);
	                    try {

	                        Thread.sleep(sleep + i * 10);
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
	        }.start();

	        f.add(pb);

	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        f.setVisible(true);
	    }
}
