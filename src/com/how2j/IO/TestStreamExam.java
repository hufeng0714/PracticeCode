package com.how2j.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamExam {

	/**
	 	以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
		但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
		那么怎么自动创建xyz目录？
		如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
	 */
	public void createFile(File file){
		try {
			byte data[] = { 88, 89,67 };
			if(file.exists()){	
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data);
			fos.close();
			System.out.println("文件存在");
			}else
			{
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(data);
				fos.close();
				System.out.println("文件不存在");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		TestStreamExam tse = new TestStreamExam();
		
		//文件夹存在的情况
		File file = new File("E:/filetest/dota.txt");
		tse.createFile(file);
		
		//文件夹不存在的情况
		File fileD = new File("E:/filetest/dev/dota.txt");
		String s = fileD.getPath();
		
		//判断文件夹是否存在
		//下面的方法更好
		if(!fileD.exists()&&!fileD.isDirectory())
		{	
			//获得文件所在的路径
			int i = s.lastIndexOf("\\");
			String ss = s.substring(i+1,s.length());			
			//除去文件名的路径字符串
			String sss = s.replaceAll(ss, "");
			File f = new File(sss);
			f.mkdirs();
			
			tse.createFile(fileD);
			
			}else
		{
			tse.createFile(fileD);
		}	
		
        //因为默认情况下，文件系统中不存在 E:/filetest/abc/def/lol3.txt，所以输出会失败
		File file2 = new File("E:/filetest/abc/def/lol3.txt"); 
		File dir = file2.getParentFile();
		if(!dir.exists()) {
		    dir.mkdirs();
		}
		tse.createFile(file2);
	}

}
