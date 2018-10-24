package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

		/*
		 准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
		然后把该数组序列化到一个文件heros.lol
		接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
		 */

public class TestStreamObjectExam {

	public static void main(String[] args)         {
        
       File f = new File("e:/filetest/heroin.txt");
       String str = "";
       Hero[] harr1 = new Hero[10];
       
       for(int i = 0;i<10;i++) {
           str = "hero"+i;
           harr1[i] = new Hero();
           harr1[i].name = str;
           System.out.println("hero-harr1:"+harr1[i].name);
       }
       System.out.println("- - - - - - - - -");

       
       
       Hero[] harr2 = new Hero[10];
       try(
               //创建对象输出流,写数据
               FileOutputStream fos = new FileOutputStream(f);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               //创建对象输入流，读数据
               FileInputStream fis = new FileInputStream(f);
               ObjectInputStream ois = new ObjectInputStream(fis);
           )
       {
           for(int i=0;i<harr2.length;i++) {
               oos.writeObject(harr1[i]);
               harr2[i] = (Hero)ois.readObject();
               System.out.println("hero-harr2:"+harr2[i].name);
           }
       }
       catch(IOException e) {
           e.printStackTrace();
       }
       catch(ClassNotFoundException e) {
           e.printStackTrace();
       }
        
   }
}
