package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestExceptionMult1 {

	/*
	 ���쳣��׽�취1
	 �е�ʱ��һ�δ�����׳������쳣������
	 new FileInputStream(f);
	 Date d = sdf.parse("2016-06-03");
	 
	 ��δ��룬���׳� �ļ��������쳣 FileNotFoundException �� �����쳣ParseException
	 ����취֮һ�Ƿֱ����catch
	 
	 catch (FileNotFoundException e) {
	 System.out.println("d:/LOL.exe������");
	 e.printStackTrace();
	 } catch (ParseException e) {
	 System.out.println("���ڸ�ʽ��������");
	 e.printStackTrace();
	 }
	 */
    public static void main(String[] args) {
    	 
        File f = new File("d:/lol.exe");
 
        try {
            System.out.println("��ͼ�� d:/lol.exe");
            new FileInputStream(f);
            System.out.println("�ɹ���");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
            
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe������");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("���ڸ�ʽ��������");
            e.printStackTrace();
        }
    }

}
