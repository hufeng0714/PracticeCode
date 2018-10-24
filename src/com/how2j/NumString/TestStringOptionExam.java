package com.how2j.NumString;

import java.util.Locale;

public class TestStringOptionExam {

	/**
	 给出一句英文句子： "let there be light"
	得到一个新的字符串，每个单词的首字母都转换为大写
	 */
	
	public void toUpper(){
		String str = "let there be light";
		String[] sub = str.split(" ");//先分割为数组
		String str1 = "";
	/*	//增强for
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
	 英文绕口令
	peter piper picked a peck of pickled peppers
	统计这段绕口令有多少个以p开头的单词 
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
	 把 lengendary 改成间隔大写小写模式，即 LeNgEnDaRy
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
	 * 把 lengendary 最后一个字母变大写
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
	把最后一个two单词首字母大写
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
