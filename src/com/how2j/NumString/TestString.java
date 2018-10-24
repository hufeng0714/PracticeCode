package com.how2j.NumString;

public class TestString {

	/**
	 方法1： 使用String类的静态方法valueOf 
	方法2： 先把基本类型装箱为对象，然后调用对象的toString
	 */
	public static void main(String[] args) {

		int i = 5;
		//方法1
		String str = String.valueOf(i);
		//方法2
		Integer it = i;
		String str2 = it.toString();
		
		String str3 = "999";
		int i2 = Integer.parseInt(str3);
		System.out.println(i2);
	}

}
