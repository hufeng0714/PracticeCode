package com.how2j.IO;

import java.io.File;
import java.util.Arrays;

public class TextFileExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	       /**
	       一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。

	       遍历这个目录下所有的文件(不用遍历子目录)

	       找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
	        */
	        
	       File file = new File("C:/WINDOWS");
	       String[] files1 = file.list();
	       System.out.println(Arrays.toString(files1));
	       System.out.println("----------------------------------------------------------------" );
	       File[] files2 = file.listFiles();
	       long max = 0;
	       long min = Integer.MAX_VALUE;
	       String maxName = "";
	       String minName = "";
	       File maxFile = null;
	       File minFile = null;
	       for(File each : files2) {
	           if(each.isFile()) {  //判断是否为文件
	               System.out.println(each.getName()+"文件");
	               if(each.length()>max) {
	                   max = each.length();
	                   maxName  = each.getName();
	                   maxFile = each;
	               }
	               if(each.length() != 0 && each.length()<min ) {
	                   min = each.length();
	                   minName  = each.getName();
	                   minFile = each;
	               }
	               }
	                
	              /**
	            *
	            * 要求同上，遍历子目录！
	            *
	            */
	            
	           else if(each.isDirectory()) {
	               System.out.println(each.getName()+"文件夹");
	               File[] fd =each.listFiles();
	               if(fd != null) {
	                   for(File sd : fd) {
	                       System.out.println(sd.getName()+"子文件");
//	                     listFiles();
	                   }
	               }
	               }
	       }
	    System.out.println("----------------------------------------------------------------" );
	               System.out.println("最大的文件夹名字是："+maxName+"\t其长度是："+max);
	               System.out.println("最小的文件夹名字是："+minName+"\t其长度是："+min);
	               System.out.println("最大的文件夹路径是："+maxFile+"\t其长度是："+max);
	               System.out.println("最小的文件夹路径是："+minFile+"\t其长度是："+min);

	}

}
