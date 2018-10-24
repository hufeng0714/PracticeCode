package com.how2j.NumString;

import java.util.Locale;

public class TestStringOptionExam {

	/**
	 ����һ��Ӣ�ľ��ӣ� "let there be light"
	�õ�һ���µ��ַ�����ÿ�����ʵ�����ĸ��ת��Ϊ��д
	 */
	
	public void toUpper(){
		String str = "let there be light";
		String[] sub = str.split(" ");//�ȷָ�Ϊ����
		String str1 = "";
	/*	//��ǿfor
	 * for(String str2:sub){
			str1 = str1+str2.replace(str2.charAt(0), Character.toUpperCase(str2.charAt(0)))+" ";
		}
		System.out.println(str1);
		
		*/
		
		for(int i=0;i<sub.length;i++){
			str1 = str1 + sub[i].replace(sub[i].charAt(0), Character.toUpperCase(sub[i].charAt(0))) + " ";
		}
		
		System.out.println(str1);
	}
	
	/**
	 Ӣ���ƿ���
	peter piper picked a peck of pickled peppers
	ͳ������ƿ����ж��ٸ���p��ͷ�ĵ��� 
	 */
	
	public void countP(){
		String str = "peter piper picked a peck of pickled peppers";
		int count = 0;
		String[] sub = str.split(" ");
		for(String str1:sub){
			if(str1.charAt(0)=='p'||str1.charAt(0)=='P'){
				count++;
			}
		}
		System.out.println(count);
	}
	
	/**
	 �� lengendary �ĳɼ����дСдģʽ���� LeNgEnDaRy
	 */
	
	public void intervaltoUpper(){
		String str = "lengendary";
		String str2 = "";
		
		for(int i=0;i<str.length();i++){
			char c = ' ';
			if(i%2==0){
				c = Character.toUpperCase(str.charAt(i));
			}else{
				c = str.charAt(i);
			}
			str2 +=c;
		}
		
		System.out.println(str2);
	}
	
	/**
	 * �� lengendary ���һ����ĸ���д
	 */
	
	public void lastChartoUpper(){
		String str = "lengendary";
		char c = ' ';
		String str2 ="";
		int strLength = str.length();
		
		for(int i=0;i<strLength;i++){
			if(i==(strLength-1)){
				c = Character.toUpperCase(str.charAt(i));
			}else{
				c = str.charAt(i);
			}
			str2 += c;
		}									
		System.out.println(str2);
	}
	
	/**
	 * Nature has given us that two ears, two eyes, and but one tongue, 
	 to the end that we should hear and see more than we speak
	�����һ��two��������ĸ��д
	 */
	
	public void lastTwotoUpper(){
		String str = "Nature has given us that two ears," +
				" two eyes, and but one tongue, to the end " +
				"that we should hear and see more [two] than we speak";
		int index = str.lastIndexOf("two");
		char[] c = str.toCharArray();
		c[index] = Character.toUpperCase(c[index]);
		System.out.println(c);
	}
	
	public static void main(String[] args) {

		TestStringOptionExam tsoe = new TestStringOptionExam();
		tsoe.toUpper();
		
		tsoe.countP();
		
		tsoe.intervaltoUpper();
		
		tsoe.lastChartoUpper();
		
		tsoe.lastTwotoUpper();

	}

}
