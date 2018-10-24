package com.how2j.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	/**
	 * Calendar�༴�����࣬�����ڽ��С����������������¸��µĽ����Ƕ��
	 */
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static void main(String[] args) {
        //���õ���ģʽ��ȡ��������Calendar.getInstance();
        Calendar c = Calendar.getInstance();
          
        //ͨ����������õ����ڶ���
        Date d = c.getTime();
        System.out.println(d);
  
        Date d2 = new Date(0);
        c.setTime(d2); //������������������� : 1970.1.1 08:00:00
        System.out.println(d2);
        
        Calendar c2 = Calendar.getInstance();
        Date now = c2.getTime();
        // ��ǰ����
        System.out.println("��ǰ���ڣ�\t" + format(c2.getTime()));
 
        // �¸��µĽ���
        c2.setTime(now);
        c2.add(Calendar.MONTH, 1);
        System.out.println("�¸��µĽ���:\t" +format(c2.getTime()));
 
        // ȥ��Ľ���
        c2.setTime(now);
        c2.add(Calendar.YEAR, -1);
        System.out.println("ȥ��Ľ���:\t" +format(c2.getTime()));
 
        // �ϸ��µĵ�����
        c2.setTime(now);
        c2.add(Calendar.MONTH, -1);
        c2.set(Calendar.DATE, 3);
        System.out.println("�ϸ��µĵ�����:\t" +format(c2.getTime()));
 
    }
	
    private static String format(Date time) {
        return sdf.format(time);
    }

}
