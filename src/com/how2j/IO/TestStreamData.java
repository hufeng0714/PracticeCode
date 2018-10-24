package com.how2j.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStreamData {

	/**
	DataInputStream ���������� 
	DataOutputStream ���������
	 */
	
	public void read(File f){
		try(FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);){
			boolean b = dis.readBoolean();
			int i = dis.readInt();
			String str = dis.readUTF();
			
			System.out.println(b);
			System.out.println(i);
			System.out.println(str);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public void write(File f){
		try(FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);){
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeUTF("123 this is gareen");
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	/*
	  Ҫ��
         ��һ�ַ�ʽ�� ʹ�û������������������ַ�������ʽд���ļ�����û��������ַ�������ʽ��ȡ������Ȼ��ת��Ϊ�������֡�
         ע�� ��������֮��Ҫ�зָ��������������������֡� ����������31��15�������ʹ�÷ָ�������ô����3115��
         ��ȡ�������޷�ʶ�𵽵������������֡� ʹ�÷ָ���31@15�ܽ��������⡣
	 */
	public void firstMethodRead(File f){
		try(FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				){
			while(true){
				String line = br.readLine();
				if(line == null)
					break;
				int b2 = br.read();
				System.out.println(line);
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void firstMethodWrite(File f){
		try(FileWriter fw = new FileWriter(f);
				BufferedWriter bw = new BufferedWriter(fw);){
			//д����������
            String a1 = "31";
            String b1 = "15";
            bw.write(a1);
            bw.write('@');
            bw.write(b1);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	/*
	 * �ڶ��ַ�ʽ�� ʹ��������DataOutputStream���ļ�����д���������֣�Ȼ����DataInpuStream������ȡ��������
	 */
	public void secondeMethodRead(File f){
		try(FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);){
			int a = dis.readInt();
			int b = dis.readInt();
			System.out.println(a);
			System.out.println(b);
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	public void secondeMethodWrite(File f){
		try(FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);){
			//��Ӧ���ļ��е����ݿ�����������������������ݵĸ�ʽ�����Ͳ������ĵ�
			dos.writeInt(31);
			dos.writeInt(25);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {

		/*
		 ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
		�籾����ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ����� Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�

		ע�� Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ�
		��������EOFException����ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�
		ֻ��DataInputStream ���ܳɹ��Ķ�ȡ
		 */
		TestStreamData tsd = new TestStreamData();
		File f1 = new File("E:/filetest/heroData.txt");
		tsd.write(f1);
		tsd.read(f1);
		
		File f2 = new File("E:/filetest/heroDateTest1.txt");
		tsd.firstMethodWrite(f2);
		tsd.firstMethodRead(f2);
		
		File f3 = new File("E:/filetest/heroDateTest2.txt");
		tsd.secondeMethodWrite(f3);
		tsd.secondeMethodRead(f3);
		
	}

}
