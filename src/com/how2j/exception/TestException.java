package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	/**
	 *1.�������׳�FileNotFoundException �ļ��������쳣�Ĵ������try��
	 *2.����ļ����ڣ��ͻ�˳������ִ�У����Ҳ�ִ��catch���еĴ���
	 *3. ����ļ������ڣ�try ��Ĵ����������ֹ���������̻����е���Ӧ��catch����
	 *4. e.printStackTrace(); ���ӡ�������ĵ��úۼ�������������ӡ���쳣��ʼ��TestException�ĵ�18�У������ͱ��ڶ�λ�ͷ���������������쳣
	 */
	public static void main(String[] args) {

		File f = new File("D:/lol.exe");
		
		try{
			System.out.println("��ͼ��D:/lol.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		//}catch(FileNotFoundException e){
		//FileNotFoundException��Exception�����࣬ʹ��ExceptionҲ����catchסFileNotFoundException
		}catch(Exception e){
			System.out.println("D:/lol.exe������");
			e.printStackTrace();
		}
	}

}
