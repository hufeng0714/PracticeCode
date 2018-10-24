package com.how2j.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStreamReaderWriter {

	/**
	 Reader�ַ������� 
	 Writer�ַ������ 
	   ר�������ַ�����ʽ��ȡ��д������
	 */
	//FileReader ��Reader���࣬��FileReader Ϊ�������ļ���ȡ
	// ���������ļ���Reader
	public void testFileReader(File f){
		try(FileReader fr = new FileReader(f)) {
			// �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
			char [] all = new char[(int)f.length()];
			// ���ַ�������ʽ��ȡ�ļ���������
			fr.read(all);
			 // ��ӡ�������ַ�
			for(char b:all){
				System.out.println(b);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
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
