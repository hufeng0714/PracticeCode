package com.how2j.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStreamExam {

	/**
	 	���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
		���ǣ������д�����ݵ�d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
		��ô��ô�Զ�����xyzĿ¼��
		����Ƕ��Ŀ¼ d:/xyz/abc/def/lol2.txt �أ�
	 */
	public void createFile(File file){
		try {
			byte data[] = { 88, 89,67 };
			if(file.exists()){	
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(data);
			fos.close();
			System.out.println("�ļ�����");
			}else
			{
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(file);
				fos.write(data);
				fos.close();
				System.out.println("�ļ�������");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		TestStreamExam tse = new TestStreamExam();
		
		//�ļ��д��ڵ����
		File file = new File("E:/filetest/dota.txt");
		tse.createFile(file);
		
		//�ļ��в����ڵ����
		File fileD = new File("E:/filetest/dev/dota.txt");
		String s = fileD.getPath();
		
		//�ж��ļ����Ƿ����
		//����ķ�������
		if(!fileD.exists()&&!fileD.isDirectory())
		{	
			//����ļ����ڵ�·��
			int i = s.lastIndexOf("\\");
			String ss = s.substring(i+1,s.length());			
			//��ȥ�ļ�����·���ַ���
			String sss = s.replaceAll(ss, "");
			File f = new File(sss);
			f.mkdirs();
			
			tse.createFile(fileD);
			
			}else
		{
			tse.createFile(fileD);
		}	
		
        //��ΪĬ������£��ļ�ϵͳ�в����� E:/filetest/abc/def/lol3.txt�����������ʧ��
		File file2 = new File("E:/filetest/abc/def/lol3.txt"); 
		File dir = file2.getParentFile();
		if(!dir.exists()) {
		    dir.mkdirs();
		}
		tse.createFile(file2);
	}

}
