package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	/**
	�����ȡ�ļ������ݵ������У�վ�ڳ���ĽǶ��������ͽ���������
	�������� InputStream
	�������OutputStream
	
	InputStream�ֽ������� 
	OutputStream�ֽ������ 
	�������ֽڵ���ʽ��ȡ��д������
	 */
	public void inputStreamMethod(File f){
		/*
	 	InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
		FileInputStream ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ
		*/
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all){
				//��ӡ������ASCII��
				System.out.println(b);
			}
			//ÿ��ʹ����������Ӧ�ý��йر�
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputStreamMethod(File f){
		/*
		OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
		FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������
		
		ע: ����ļ�d:/lol2.txt�����ڣ�д���������Զ��������ļ��� 
		����������ļ� d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڣ����׳��쳣
		 */
		try {
			// ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
            byte data[] = { 88, 89 };
            
			FileOutputStream fos = new FileOutputStream(f);
			// ������д�뵽�����
			fos.write(data);
			// �ر������
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		TestStream ts = new TestStream();
		File file = new File("E:/filetest/lol.txt");
		ts.inputStreamMethod(file);
		ts.outputStreamMethod(file);


		
	}

}
