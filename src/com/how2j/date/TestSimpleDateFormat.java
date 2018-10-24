package com.how2j.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        //y ������
        //M ������
        //d ������
        //H ����24���Ƶ�Сʱ
        //h ����12���Ƶ�Сʱ
        //m �������
        //s ������
        //S �������
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd HH:mm:ss SSS ��ʽ��������: "+str);
         
        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("��ǰʱ��ͨ�� yyyy-MM-dd ��ʽ��������: "+str1);
        
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        
        String str2 = "2016/1/5 12:12:12";
          
        try {
            Date d2 = sdf2.parse(str2);
            System.out.printf("�ַ��� %s ͨ����ʽ  yyyy/MM/dd HH:mm:ss %nת��Ϊ���ڶ���: %s",str2,d2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

	}

}
