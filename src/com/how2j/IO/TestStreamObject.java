package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStreamObject {
	
	public static void main(String[] args) {
	
		Hero h = new Hero();
		h.name = "garen";
		h.hp = 616;
		
		//准备一个文件用于保存该对象
		File f = new File("E:/filetest/heroDateTest3.txt");
		
		try(	//创建对象输出流,对程序而言输出就是往硬盘里写数据
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//创建对象输入流，对程序而言输入就是从硬盘里读数据
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);){
			
			oos.writeObject(h);
			Hero h2 = (Hero)ois.readObject();
			System.out.println(h2.name);
			System.out.println(h2.hp);
			
		}catch(IOException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}	

}
