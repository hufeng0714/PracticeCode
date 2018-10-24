package com.how2j.NumString;

public class TestStringExam {

	/**
	 把浮点数 3.14 转换为 字符串 "3.14"
	再把字符串 “3.14” 转换为 浮点数 3.14

	如果字符串是 3.1a4，转换为浮点数会得到什么？
	 */
	public static void main(String[] args) {

		float f = 3.14f;
		String s = "3.14";
		String s1 = "3.14a4";
		
		//String方法转换（数字-字符串）：
		String s2 = String.valueOf(f);
		System.out.println(s2);
		
		//装箱方法转换（数字-字符串）：
        Float f0 = new Float(f);
        System.out.println("装箱方法（数字-字符串）-包装类-浮点型f2:\t"+f0);
        String s3 = f0.toString();
        System.out.println("装箱方法（数字-字符串）-字符串str2: \t"+s3);
        System.out.println("--------------------------------------");
		
		//静态方法（字符串-数字）：
		float f2 = Float.parseFloat(s);
		System.out.println(f2);
		
		//会抛异常
		//float f3 = Float.parseFloat(s1);
		//System.out.println(f3);
	}

}
