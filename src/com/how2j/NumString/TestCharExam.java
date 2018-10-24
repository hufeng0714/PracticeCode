package com.how2j.NumString;

import java.util.Scanner;

public class TestCharExam {

	/**
	 	通过Scanner从控制台读取字符串，然后把字符串转换为字符数组
		
		参考的转换方式:
 
		String str = "abc123";
		char[] cs = str.toCharArray(); 
		
		转换为字符数组后，筛选出控制台读取到的字符串中的大写字母和数字，并打印出来
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char[] cs = str.toCharArray();
		
		String strA = "";
		String strB = "";
		String strC = "";
		String strD = "";
		
		for(int i=0;i<cs.length;i++){
			if(Character.isLetter(cs[i])){
				strA+=cs[i];
			}
			if(Character.isDigit(cs[i])){
				strB+=cs[i];
			}
			if(Character.isUpperCase(cs[i])){
				strC+=cs[i];
			}
			if(Character.isUpperCase(cs[i])||Character.isDigit(cs[i])){
				strD+=cs[i];
			}
			
		}
		
		System.out.println(strA);
		System.out.println(strB);
		System.out.println(strC);
		System.out.println(strD);


	}

}
