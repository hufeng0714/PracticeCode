package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormatExam {

	/**
	 * 准备一个长度是9的日期数组
	 * 使用1970年-2000年之间的随机日期初始化该数组
	 * 按照这些日期的时间进行升序排序
	 * 比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
	 */
	    public static void main(String[]args)
	    {
	        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
	        String from1970="1970";
	        String to2000="2001";
	        Date[] randomDateArr=new Date[9];//长度为9的随机日期数组
	        try
	        {
	            Date d1970=sdf.parse(from1970);//取得1970/1/1 0:00:00日期格式
	            Date d2000=sdf.parse(to2000);//取得2000/1/1 0:00:00日期格式  
	            long sec1970=(d1970.getTime());//取得1970/1/1 0:00:00毫秒
	            long sec2000=(d2000.getTime()-1);//取得2001/1/1 0:00:00-1的毫秒即2000/12/31 23:59:59毫秒
	            for(int i=0;i<randomDateArr.length;++i)
	            {//对随机时间数组进行赋值
	                long randomSec=(long)(Math.random()*(sec2000-sec1970)+sec1970);//随机毫秒
	                Date randomDate=new Date(randomSec);//根据随机毫秒构造随机日期
	                randomDateArr[i]=randomDate;
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }  
	        System.out.println("随机时间数组为:");//3行3列打印该随机时间数组
	        for(int i=0;i<randomDateArr.length;++i)
	        {
	            System.out.printf(randomDateArr[i]+" /");
	            if((i+1)%3==0)
	            {
	                System.out.println();  
	            }
	        }
	        //排序：(按照这些日期的时间进行升序排序)
	        SimpleDateFormat sdf2=new SimpleDateFormat("HHmmss");//sdf2 格式化只取时分秒
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
	         
	        System.out.println("排序后随机时间数组为:");//3行3列打印该随机时间数组
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