package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarExam {

	/**
	 * �ҳ��¸��µĵ�����3��������
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat f= new SimpleDateFormat("yyy/MM/dd");
        //���õ���ģʽ��ȡ��������Calendar.getInstance();
        Calendar c = Calendar.getInstance();
           
        //ͨ����������õ����ڶ���
        Date now = c.getTime();
        System.out.println("��ǰ����:"+f.format(now));
        System.out.print("�¸��µĵ���������:");
         
        c.add(c.MONTH, 1);    //������1
        int  d=c.getMaximum(c.DATE);  //��ȡ�����������
        c.set(c.DATE, d-3);    //���� ����
         
        Date nextT = c.getTime();
        System.out.println(f.format(nextT));
	}

}
