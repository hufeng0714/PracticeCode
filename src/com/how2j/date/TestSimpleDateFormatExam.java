package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormatExam {

	/**
	 * ׼��һ��������9����������
	 * ʹ��1970��-2000��֮���������ڳ�ʼ��������
	 * ������Щ���ڵ�ʱ�������������
	 * ���� 1988-1-21 12:33:22 �ͻ����� 1978-4-21 19:07:23 ǰ�棬��Ϊ����ʱ���С����Ȼ���ڸ���
	 */
	    public static void main(String[]args)
	    {
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
	        String from1970="1970";
	        String to2000="2001";
	        Date[] randomDateArr=new Date[9];//����Ϊ9�������������
	        try
	        {
	            Date d1970=sdf.parse(from1970);//ȡ��1970/1/1 0:00:00���ڸ�ʽ
	            Date d2000=sdf.parse(to2000);//ȡ��2000/1/1 0:00:00���ڸ�ʽ  
	            long sec1970=(d1970.getTime());//ȡ��1970/1/1 0:00:00����
	            long sec2000=(d2000.getTime()-1);//ȡ��2001/1/1 0:00:00-1�ĺ��뼴2000/12/31 23:59:59����
	            for(int i=0;i<randomDateArr.length;++i)
	            {//�����ʱ��������и�ֵ
	                long randomSec=(long)(Math.random()*(sec2000-sec1970)+sec1970);//�������
	                Date randomDate=new Date(randomSec);//����������빹���������
	                randomDateArr[i]=randomDate;
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }  
	        System.out.println("���ʱ������Ϊ:");//3��3�д�ӡ�����ʱ������
	        for(int i=0;i<randomDateArr.length;++i)
	        {
	            System.out.printf(randomDateArr[i]+" /");
	            if((i+1)%3==0)
	            {
	                System.out.println();  
	            }
	        }
	        //����(������Щ���ڵ�ʱ�������������)
	        SimpleDateFormat sdf2=new SimpleDateFormat("HHmmss");//sdf2 ��ʽ��ֻȡʱ����
	        //String s0=sdf2.format(randomDateArr[0]);
	        //int i0=Integer.parseInt(s0);
	        //String s1=sdf2.format(randomDateArr[1]);
	        //int i1=Integer.parseInt(s1);
	        for(int i=0;i<randomDateArr.length;++i)
	        {
	            for(int j=i+1;j<randomDateArr.length;++j)
	            {
	                String s0=sdf2.format(randomDateArr[i]);
	                int i0=Integer.parseInt(s0);
	                String s1=sdf2.format(randomDateArr[j]);
	                int i1=Integer.parseInt(s1);
	                if(i0>i1)
	                {
	                    Date temp=randomDateArr[i];
	                    randomDateArr[i]=randomDateArr[j];
	                    randomDateArr[j]=temp;
	                }
	            }
	        }
	         
	        System.out.println("��������ʱ������Ϊ:");//3��3�д�ӡ�����ʱ������
	        for(int i=0;i<randomDateArr.length;++i)
	        {
	            System.out.printf(randomDateArr[i]+" /");
	            if((i+1)%3==0)
	            {
	                System.out.println();  
	            }
	        }
	    }
	}