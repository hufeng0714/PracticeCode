package com.how2j.NumString;

public class TestNumber {
	
	/**
	 所有的基本类型，都有对应的类类型 
	比如int对应的类是Integer 
	这种类就叫做封装类
	 */

	public static void main(String[] args) {
		int i = 5;
        //把一个基本类型的变量,转换为Integer对象
		//基本类型转封装类
		Integer it = new Integer(i);
		//把一个Integer对象，转换为一个基本类型的int
		//封装类转基本类型
		int i2 = it.intValue();
		
		//不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
		Integer it2 = i;
		
		//需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
		int i3 = it;
		/**
		 数字封装类有 
		Byte,Short,Integer,Long,Float,Double 
		这些类都是抽象类Number的子类
		 */
		  //Integer是Number的子类，所以打印true
		System.out.println(it instanceof Number);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
