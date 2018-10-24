package com.how2j.IO;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class TestFile {

	/*
	 �ļ����ļ��ж�����File����
	 */
    public static void main(String[] args) throws IOException {
        // ����·��
       File f1 = new File("E:/filetest");//  ���ļ�·����"\\"��Ч��"/"
       System.out.println("f1�ľ���·����" + f1.getAbsolutePath());
       // ���·��,����ڹ���Ŀ¼�������eclipse�У�������ĿĿ¼
       File f2 = new File("LOL.exe");
       System.out.println("f2�ľ���·����" + f2.getAbsolutePath());
       // ��f1��Ϊ��Ŀ¼�����ļ�����
       File f3 = new File(f1, "LOL.txt");
       System.out.println("f3�ľ���·����" + f3.getAbsolutePath());
       f3.createNewFile();
       System.out.println("----------------------------------------------------------------" );
        
        
//     �ļ����÷���1
       File f = new File("E:/filetest/LOL.txt");
       System.out.println("��ǰ�ļ��ǣ�" +f);
       //�ļ��Ƿ����
       System.out.println("�ж��Ƿ���ڣ�"+f.exists());
         
       //�Ƿ����ļ���
       System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
          
       //�Ƿ����ļ������ļ��У�
       System.out.println("�ж��Ƿ����ļ���"+f.isFile());
          
       //�ļ�����
       System.out.println("��ȡ�ļ��ĳ��ȣ�"+f.length());
          
       //�ļ�����޸�ʱ��
       long time = f.lastModified();
       Date d = new Date(time);
       System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+time);
       //�����ļ��޸�ʱ��Ϊ1970.1.1 08:00:00
       f.setLastModified(0);
          
       //�ļ�������
       File f4 =new File("d:/LOLFolder/DOTA.exe"); // ��LOL.exe��������DOTA.exe
       f.renameTo(f4);
       System.out.println("��ǰ�ļ��ǣ�" +f);
         
//     ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ
        
        
       System.out.println("----------------------------------------------------------------" );
        
        
//       �ļ����÷���2
       File f6 = new File("e:/filetest/skin/red.ski");
       File f5 = new File("e:/filetest/skin");
       // ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
       String[] fList = f5.list();
       System.out.println(Arrays.toString(fList));
       for(String s:fList){
    	   System.out.println(s);
       }
  
       // ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
       File[]fs= f5.listFiles();
       System.out.println(Arrays.toString(fs));
  
       // ���ַ�����ʽ���ػ�ȡ�����ļ���
       String pPath = f5.getParent();
       System.out.println(pPath);
       
  
       // ���ļ���ʽ���ػ�ȡ�����ļ���
       f5.getParentFile();
       // �����ļ��У�������ļ���skin�����ڣ���������Ч
       f5.mkdir();
  
       // �����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
       f5.mkdirs();
  
       // ����һ�����ļ�,������ļ���skin�����ڣ��ͻ��׳��쳣
       f5.createNewFile();
       // ���Դ���һ�����ļ�֮ǰ��ͨ�����ᴴ����Ŀ¼
       f5.getParentFile().mkdirs();
  
       // �г����е��̷�c: d: e: �ȵ�
       f5.listRoots();
  
       // �h���ļ�
       //f5.delete();
  
       // JVM������ʱ�򣬄h���ļ�����������ʱ�ļ���ɾ��
       //f5.deleteOnExit();
        
        
       System.out.println("----------------------------------------------------------------" );
    }
}
