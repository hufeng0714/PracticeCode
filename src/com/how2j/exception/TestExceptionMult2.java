package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestExceptionMult2 {

	/**
	 * ���쳣��׽�취2
	 */
	public static void main(String[] args) {
		/*
		 ��һ���ְ취�ǰѶ���쳣������һ��catch��ͳһ��׽ 
 
		catch (FileNotFoundException | ParseException e) {
 

		���ַ�ʽ�� JDK7��ʼ֧�֣��ô��ǲ�׽�Ĵ�������գ�����֮���ǣ�һ�������쳣������ȷ�������������쳣����Ҫͨ��instanceof �����жϾ�����쳣����
 
		if (e instanceof FileNotFoundException)
		System.out.println("d:/LOL.exe������");
		if (e instanceof ParseException)
		System.out.println("���ڸ�ʽ��������");
		 */
		File f = new File("d:/LOL.exe");
		 
        try {
            System.out.println("��ͼ�� d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe������");
            if (e instanceof ParseException)
                System.out.println("���ڸ�ʽ��������");
 
            e.printStackTrace();
        }
        finally{
        	//�����Ƿ�����쳣��finally�еĴ��붼�ᱻִ��
        	System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
        }

	}

}
