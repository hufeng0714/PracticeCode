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
			System.out.println("�ҵ���һ����׺Ϊtxt���ļ���������һ���µ��̣߳�" + file.getName());
			System.out.println("���ļ�������Ϊ��"+String.valueOf(readFile(file)));
		}else{
			selectTxt(file);
		}
	}

	private void selectTxt(File file) {

		File[] files = file.listFiles();
		if(files!=null){
			for(File f:files){
				//���ж��Ƿ�Ϊ�ļ�
				if(f.isFile()){
					if(f.getName().endsWith("txt")){
						new SelectThread(f).start();
					}
				}
				//���ж��Ƿ�Ϊ�ļ��� �ݹ�
				if(f.isDirectory()){
					selectTxt(f);
				}
			}
		}
	}
}
