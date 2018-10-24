package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendarExam {

	/**
	 * 找出下个月的倒数第3天是哪天
	 */
	public static void main(String[] args) {
		
		SimpleDateFormat f= new SimpleDateFormat("yyy/MM/dd");
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
           
        //通过日历对象得到日期对象
        Date now = c.getTime();
        System.out.println("当前日期:"+f.format(now));
        System.out.print("下个月的倒数第三天:");
         
        c.add(c.MONTH, 1);    //月数＋1
        int  d=c.getMaximum(c.DATE);  //获取当月最大日期
        c.set(c.DATE, d-3);    //设置 日期
         
        Date nextT = c.getTime();
        System.out.println(f.format(nextT));
	}

}
