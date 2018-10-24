package com.how2j.NumString;

public class TestNumberExam {

	/**
	1. 对byte,short,float,double进行自动拆箱和自动装箱
	2. byte和Integer之间能否进行自动拆箱和自动装箱
	3. 通过Byte获取byte的最大值
 
	 */
	public static void main(String[] args) {
		
	//  1. 对byte,short,float,double进行自动拆箱和自动装箱
        byte b1 = 5;
        Byte by = new Byte(b1);//自动装箱
        System.out.println("自动装箱后的结果: " + by);
        byte b2 = by.byteValue();//自动拆箱
        System.out.println("自动拆箱后的结果: " + b2);
         
        short s1 = 4;
        Short st = new Short(s1);//自动装箱
        System.out.println("自动装箱后的结果: " + st);
        short s2 = st.shortValue();//自动拆箱
        System.out.println("自动拆箱后的结果: " + s2);
         
        float f1 = 3.5f;
        Float ft = new Float(f1);//自动装箱
        System.out.println("自动装箱后的结果: " + ft);
        float f2 = ft.floatValue();//自动拆箱
        System.out.println("自动拆箱后的结果: " + f2);
         
        double d1 = 4.5;
        Double de = new Double(d1);//自动装箱
        System.out.println("自动装箱后的结果: " + de);
        double d2 = de.doubleValue();//自动拆箱
        System.out.println("自动拆箱后的结果: " + d2);
         
         
    //  2. byte和Integer之间能否进行自动拆箱和自动装箱
        byte b3 = 6;
        Integer it = new Integer(b3);
        System.out.println("自动装箱后的结果: " + it);
        byte b4 = (byte)it.intValue();
        System.out.println("自动拆箱后的结果: " + b4);
         
    //  3. 通过Byte获取byte的最大值
        System.out.println("byte的最大值: " + Byte.MAX_VALUE);
        System.out.println("byte的最大值: " + Byte.MIN_VALUE);

	}

}
