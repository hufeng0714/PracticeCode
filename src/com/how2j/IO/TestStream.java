package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	/**
	比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流
	输入流： InputStream
	输出流：OutputStream
	
	InputStream字节输入流 
	OutputStream字节输出流 
	用于以字节的形式读取和写入数据
	 */
	public void inputStreamMethod(File f){
		/*
	 	InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
		FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
		*/
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int)f.length()];
			fis.read(all);
			for(byte b:all){
				//打印出来是ASCII码
				System.out.println(b);
			}
			//每次使用完流，都应该进行关闭
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void outputStreamMethod(File f){
		/*
		OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
		FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
		
		注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。 
		但是如果是文件 d:/xyz/lol2.txt，而目录xyz又不存在，会抛出异常
		 */
		try {
			// 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };
            
			FileOutputStream fos = new FileOutputStream(f);
			// 把数据写入到输出流
			fos.write(data);
			// 关闭输出流
			fos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		TestStream ts = new TestStream();
		File file = new File("E:/filetest/lol.txt");
		ts.inputStreamMethod(file);
		ts.outputStreamMethod(file);


		
	}

}
