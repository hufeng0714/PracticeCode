package com.how2j.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStreamReaderWriter {

	/**
	 Reader字符输入流 
	 Writer字符输出流 
	   专门用于字符的形式读取和写入数据
	 */
	//FileReader 是Reader子类，以FileReader 为例进行文件读取
	// 创建基于文件的Reader
	public void testFileReader(File f){
		try(FileReader fr = new FileReader(f)) {
			// 创建字符数组，其长度就是文件的长度
			char [] all = new char[(int)f.length()];
			// 以字符流的形式读取文件所有内容
			fr.read(all);
			 // 打印出来是字符
			for(char b:all){
				System.out.println(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
	public void testFileWriter(File f){
		try(FileWriter fw = new FileWriter(f)){
			String data = "abcdef";
			char[] cs = data.toCharArray();
			fw.write(cs);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		TestStreamReaderWriter tsrw = new TestStreamReaderWriter();
		
		File f1 = new File("E:/filetest/LOL.txt");
		tsrw.testFileWriter(f1);
			
		File f2 = new File("E:/filetest/dota.txt");
		tsrw.testFileReader(f1);
		System.out.println("==============================");
		tsrw.testFileReader(f2);		

	}

}
