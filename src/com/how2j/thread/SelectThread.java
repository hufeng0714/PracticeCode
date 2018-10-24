package com.how2j.thread;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SelectThread extends Thread{
	
	public File file;
	
	public SelectThread(File file){
		
		this.file = file;
	}
	
	public char[] readFile(File file){
		
		try {
			FileReader fr = new FileReader(file);
			char[] ch = new char[(int)file.length()];
			fr.read(ch);
			fr.close();
			return ch;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void run(){
		if(file.isFile()){
			System.out.println("找到了一个后缀为txt的文件，启动了一个新的线程：" + file.getName());
			System.out.println("该文件的内容为："+String.valueOf(readFile(file)));
		}else{
			selectTxt(file);
		}
	}

	private void selectTxt(File file) {

		File[] files = file.listFiles();
		if(files!=null){
			for(File f:files){
				//先判断是否为文件
				if(f.isFile()){
					if(f.getName().endsWith("txt")){
						new SelectThread(f).start();
					}
				}
				//再判断是否为文件夹 递归
				if(f.isDirectory()){
					selectTxt(f);
				}
			}
		}
	}
}
