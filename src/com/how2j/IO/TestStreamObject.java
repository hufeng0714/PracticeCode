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
		
		//׼��һ���ļ����ڱ���ö���
		File f = new File("E:/filetest/heroDateTest3.txt");
		
		try(	//�������������,�Գ���������������Ӳ����д����
				FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//�����������������Գ������������Ǵ�Ӳ���������
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
