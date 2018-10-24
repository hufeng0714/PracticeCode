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
	DataInputStream 数据输入流 
	DataOutputStream 数据输出流
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
	  要求
         第一种方式： 使用缓存流把两个数字以字符串的形式写到文件里，再用缓存流以字符串的形式读取出来，然后转换为两个数字。
         注： 两个数字之间要有分隔符用于区分这两个数字。 比如数字是31和15，如果不使用分隔符，那么就是3115，
         读取出来就无法识别到底是哪两个数字。 使用分隔符31@15能解决这个问题。
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
			//写入两个数字
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
	 * 第二种方式： 使用数据流DataOutputStream向文件连续写入两个数字，然后用DataInpuStream连续读取两个数字
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
			//对应的文件中的内容看不到，这是数据流存放数据的格式，本就不是明文的
			dos.writeInt(31);
			dos.writeInt(25);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {

		/*
		 使用数据流的writeUTF()和readUTF() 可以进行数据的格式化顺序读写
		如本例，通过DataOutputStream 向文件顺序写出 布尔值，整数和字符串。 然后再通过DataInputStream 顺序读入这些数据。

		注： 要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，
		否则会出现EOFException，因为DataOutputStream 在写出的时候会做一些特殊标记，
		只有DataInputStream 才能成功的读取
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
