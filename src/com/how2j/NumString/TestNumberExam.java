package com.how2j.NumString;

public class TestNumberExam {

	/**
	1. ��byte,short,float,double�����Զ�������Զ�װ��
	2. byte��Integer֮���ܷ�����Զ�������Զ�װ��
	3. ͨ��Byte��ȡbyte�����ֵ
 
	 */
	public static void main(String[] args) {
		
	//  1. ��byte,short,float,double�����Զ�������Զ�װ��
        byte b1 = 5;
        Byte by = new Byte(b1);//�Զ�װ��
        System.out.println("�Զ�װ���Ľ��: " + by);
        byte b2 = by.byteValue();//�Զ�����
        System.out.println("�Զ������Ľ��: " + b2);
         
        short s1 = 4;
        Short st = new Short(s1);//�Զ�װ��
        System.out.println("�Զ�װ���Ľ��: " + st);
        short s2 = st.shortValue();//�Զ�����
        System.out.println("�Զ������Ľ��: " + s2);
         
        float f1 = 3.5f;
        Float ft = new Float(f1);//�Զ�װ��
        System.out.println("�Զ�װ���Ľ��: " + ft);
        float f2 = ft.floatValue();//�Զ�����
        System.out.println("�Զ������Ľ��: " + f2);
         
        double d1 = 4.5;
        Double de = new Double(d1);//�Զ�װ��
        System.out.println("�Զ�װ���Ľ��: " + de);
        double d2 = de.doubleValue();//�Զ�����
        System.out.println("�Զ������Ľ��: " + d2);
         
         
    //  2. byte��Integer֮���ܷ�����Զ�������Զ�װ��
        byte b3 = 6;
        Integer it = new Integer(b3);
        System.out.println("�Զ�װ���Ľ��: " + it);
        byte b4 = (byte)it.intValue();
        System.out.println("�Զ������Ľ��: " + b4);
         
    //  3. ͨ��Byte��ȡbyte�����ֵ
        System.out.println("byte�����ֵ: " + Byte.MAX_VALUE);
        System.out.println("byte�����ֵ: " + Byte.MIN_VALUE);

	}

}
