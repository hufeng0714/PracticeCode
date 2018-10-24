package com.how2j.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestStreamBuffer {

	/**
	 * @param args
	 */
	//�����ַ������� BufferedReader ����һ�ζ�ȡһ������
	
	public void bufferedReader(File f){
		try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);){
			while(true){
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//PrintWriter �����ַ�������� ����һ��д��һ������
	
	public void printWriter(File f){
		try(FileWriter fw = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fw);){
			pw.println("abcdef");
			pw.println("1234567");
			pw.println("ABCDEFG");
			pw.println("һ������������");
		} catch (IOException e) {
					e.printStackTrace();
				}
		
	}
	
	//�е�ʱ����Ҫ����������д�뵽Ӳ�̣������ǵȻ������˲�д��ȥ�� ��ʱ�����Ҫ�õ�flush
	
	public void testFlush(File f){
        //�����ļ��ַ���
        //���������뽨����һ�����ڵ����Ļ�����
        try(FileWriter fr = new FileWriter(f);
        		PrintWriter pw = new PrintWriter(fr);) {
            pw.println("garen kill teemo");
            //ǿ�ưѻ����е�����д��Ӳ�̣����ۻ����Ƿ�����
                pw.flush();           
            pw.println("teemo revive after 1 minutes");
                pw.flush();
            pw.println("teemo try to garen, but killed again");
                pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	//���һ�������������Ƴ�Java�ļ��е�ע��
	//һ��һ��
	/*
	 ���һ�������������Ƴ�Java�ļ��е�ע��
 
	public void removeComments(File javaFile)
 

	���磬�Ƴ���//��ͷ��ע����
 
File f = new File("d:/LOLFolder/LOL.exe");
System.out.println("��ǰ�ļ��ǣ�" +f);
//�ļ��Ƿ����
System.out.println("�ж��Ƿ���ڣ�"+f.exists());
//�Ƿ����ļ���
System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
	 */
	public void removeComments(File f1,File f2){
	       try (FileReader fr=new FileReader(f1);
	            BufferedReader br=new BufferedReader(fr);
	    		FileWriter fw = new FileWriter(f2);   
	            PrintWriter pw=new PrintWriter(fw);){
	            while(true) {
	                String line=br.readLine();
	                if(line==null)
	                    break;
	                System.out.println(line);
	                if(line.startsWith("//")) {
	                    line="";
	                    continue;
	                }
	                pw.flush();
	                pw.println(line);  
	            }
	        } catch (Exception e) {
	        	e.printStackTrace();
	        }
	}
	
	public static void main(String[] args) {
		
		TestStreamBuffer tsb = new TestStreamBuffer();
		
		File file = new File("E:/filetest/monkey.txt");
		tsb.bufferedReader(file);
		
		File file2 = new File("E:/filetest/monkey2.txt");
		tsb.printWriter(file2);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file2);
		
		File file3 = new File("E:/filetest/monkey3.txt");
		tsb.testFlush(file3);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file3);
		System.out.println("++++++++++++++++++++++++");
		
		File file4 = new File("E:/filetest/monkey4.txt");
		File file5 = new File("E:/filetest/monkey5.txt");
		tsb.removeComments(file4,file5);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file4);
		System.out.println("++++++++++++++++++++++++");
		tsb.bufferedReader(file5);
	}

}
