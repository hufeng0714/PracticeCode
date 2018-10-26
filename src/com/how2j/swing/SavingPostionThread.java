package com.how2j.swing;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

		/**
		 * �����λ����Ϣ
		 * 
		 �������ʹ���������(TestGUI01.java)�����´��ڱ��ƶ��������½ǡ� �ر�������ڣ���һ����������ʱ�򣬾ͻ��Զ����������½ǡ�
		
		˼·��ʾ�� 
		����һ���̣߳�ÿ��100�����ȡ��ǰ��λ����Ϣ���������ļ��У�����location.txt�ļ��� 
		������ʱ�򣬴�����ļ��ж�ȡλ����Ϣ������ǿյģ���ʹ��Ĭ��λ�ã�������ǿյģ��Ͱ�λ����Ϣ�����ڴ����ϡ�
		��ȡλ����Ϣ�İ취�� f.getX() ��ȡ��������Ϣ��f.getY()��ȡ��������Ϣ��
		
		ע�������ϰҪ��ʹ�ö��߳�����ɡ� ������һ��˼·����ɣ�����ʹ�ü���������Ϊ�տ�ʼѧϰGUI����û�����ռ�������ʹ�ã�������ʱʹ�ö��߳������������ܡ�
		 
		 */

public class SavingPostionThread extends Thread{

	private JFrame f;
	File file = new File("D:\\EcliWorkSpace201809\\mypro\\src\\com\\how2j\\swing\\location.txt");
	
	SavingPostionThread(JFrame f){
		this.f = f;
	}
	
	public void run() {
		while(true) {
			int x = f.getX();
			int y = f.getY();
			
			try(FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos);
				) {
				dos.writeInt(x);
				dos.writeInt(y);				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
