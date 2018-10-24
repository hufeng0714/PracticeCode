package com.how2j.date;

import java.util.Date;

public class TestDateExam {

	/**
	 *���������������һ����1995.1.1 00:00:00 �� 1995.12.31 23:59:59 ֮����������
	 */
	public static void main(String[] args) {
        Date origin = new Date(0);
        System.out.println(origin);
        System.out.println(origin.getTime());
        long second = 1000L;
        long minute = 60 * second;
        long hour = 60 * minute;
        long day = 24 * hour;
        long year = 365 * day;
        //����1975��1995,�ж�������
        int count = 0;
        for(int i = 1970;i<1995;i++) {
            if(i%4==0 || i%400==0 && i%100!=0) {
                count++;
            }
        }
        System.out.println("1970-1995�ڼ�,���깲��:"+count);
        Date start1995 = new Date((1995-1970)*year+count*day-8*hour);
        System.out.println("1995�꿪ʼ��");
        System.out.println(start1995);
        System.out.println(start1995.getTime());
        Date end1995 = new Date(start1995.getTime()+year-1);
        System.out.println("1995�������");
        System.out.println(end1995);
        System.out.println(end1995.getTime());
        long valueOf1995 = end1995.getTime()+1-start1995.getTime();
        long random = (long)(Math.random()*valueOf1995);
        Date random1995 = new Date(random+start1995.getTime());
        System.out.println("1995�������");
        System.out.println(random1995);

	}

}
