package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	/**
	 * Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
	 */
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();
          
        //通过日历对象得到日期对象
        Date d = c.getTime();
        System.out.println(d);
  
        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(d2);
        
        Calendar c2 = Calendar.getInstance();
        Date now = c2.getTime();
        // 当前日期
        System.out.println("当前日期：\t" + format(c2.getTime()));
 
        // 下个月的今天
        c2.setTime(now);
        c2.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c2.getTime()));
 
        // 去年的今天
        c2.setTime(now);
        c2.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c2.getTime()));
 
        // 上个月的第三天
        c2.setTime(now);
        c2.add(Calendar.MONTH, -1);
        c2.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c2.getTime()));
 
    }
	
    private static String format(Date time) {
        return sdf.format(time);
    }

}
