package com.how2j.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestStreamBuffer {

	/**
	 * @param args
	 */
	//缓存字符输入流 BufferedReader 可以一次读取一行数据
	
	public void bufferedReader(File f){
		try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);){
			while(true){
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//PrintWriter 缓存字符输出流， 可以一次写出一行数据
	
	public void printWriter(File f){
		try(FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw);){
			pw.println("abcdef");
			pw.println("1234567");
			pw.println("ABCDEFG");
			pw.println("一二三四五六七");
		} catch (IOException e) {
					e.printStackTrace();
				}
		
	}
	
	//有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
	
	public void testFlush(File f){
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
        try(FileWriter fr = new FileWriter(f);
        		PrintWriter pw = new PrintWriter(fr);) {
            pw.println("garen kill teemo");
            //强制把缓存中的数据写入硬盘，无论缓存是否已满
                pw.flush();           
            pw.println("teemo revive after 1 minutes");
                pw.flush();
            pw.println("teemo try to garen, but killed again");
                pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	//设计一个方法，用于移除Java文件中的注释
	//一进一出
	/*
	 设计一个方法，用于移除Java文件中的注释
 
	public void removeComments(File javaFile)
 

	比如，移出以//开头的注释行
 
File f = new File("d:/LOLFolder/LOL.exe");
System.out.println("当前文件是：" +f);
//文件是否存在
System.out.println("判断是否存在："+f.exists());
//是否是文件夹
System.out.println("判断是否是文件夹："+f.isDirectory());
	 */
	public void removeComments(File f1,File f2){
	       try (FileReader fr=new FileReader(f1);
	            BufferedReader br=new BufferedReader(fr);
	    		FileWriter fw = new FileWriter(f2);   
	            PrintWriter pw=new PrintWriter(fw);){
	            while(true) {
	                String line=br.readLine();
	                if(line==null)
	                    break;
	                System.out.println(line);
	                if(line.startsWith("//")) {
	                    line="";
	                    continue;
	                }
	                pw.flush();
	                pw.println(line);  
	            }
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	}
	
	public static void main(String[] args) {
		
		TestStreamBuffer tsb = new TestStreamBuffer();
		
		File file = new File("E:/filetest/monkey.txt");
		tsb.bufferedReader(file);
		
		File file2 = new File("E:/filetest/monkey2.txt");
		tsb.printWriter(file2);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file2);
		
		File file3 = new File("E:/filetest/monkey3.txt");
		tsb.testFlush(file3);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file3);
		System.out.println("++++++++++++++++++++++++");
		
		File file4 = new File("E:/filetest/monkey4.txt");
		File file5 = new File("E:/filetest/monkey5.txt");
		tsb.removeComments(file4,file5);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file4);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file5);
	}

}
