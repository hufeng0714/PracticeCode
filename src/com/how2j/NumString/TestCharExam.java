package com.how2j.NumString;

import java.util.Scanner;

public class TestCharExam {

	/**
	 	ͨ��Scanner�ӿ���̨��ȡ�ַ�����Ȼ����ַ���ת��Ϊ�ַ�����
		
		�ο���ת����ʽ:
 
		String str = "abc123";
		char[] cs = str.toCharArray(); 
		
		ת��Ϊ�ַ������ɸѡ������̨��ȡ�����ַ����еĴ�д��ĸ�����֣�����ӡ����
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
