package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

		/*
		 ׼��һ��������10��������Hero�����飬ʹ��10��Hero�����ʼ��������
		Ȼ��Ѹ��������л���һ���ļ�heros.lol
		����ʹ��ObjectInputStream ��ȡ���ļ�����ת��ΪHero���飬��֤�������е����ݣ��Ƿ�����л�֮ǰһ��
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
               //�������������,д����
               FileOutputStream fos = new FileOutputStream(f);
               ObjectOutputStream oos = new ObjectOutputStream(fos);
               //����������������������
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
