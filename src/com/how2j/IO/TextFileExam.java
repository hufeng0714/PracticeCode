package com.how2j.IO;

import java.io.File;
import java.util.Arrays;

public class TextFileExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	       /**
	       һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��

	       �������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)

	       �ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
	        */
	        
	       File file = new File("C:/WINDOWS");
	       String[] files1 = file.list();
	       System.out.println(Arrays.toString(files1));
	       System.out.println("----------------------------------------------------------------" );
	       File[] files2 = file.listFiles();
	       long max = 0;
	       long min = Integer.MAX_VALUE;
	       String maxName = "";
	       String minName = "";
	       File maxFile = null;
	       File minFile = null;
	       for(File each : files2) {
	           if(each.isFile()) {  //�ж��Ƿ�Ϊ�ļ�
	               System.out.println(each.getName()+"�ļ�");
	               if(each.length()>max) {
	                   max = each.length();
	                   maxName  = each.getName();
	                   maxFile = each;
	               }
	               if(each.length() != 0 && each.length()<min ) {
	                   min = each.length();
	                   minName  = each.getName();
	                   minFile = each;
	               }
	               }
	                
	              /**
	            *
	            * Ҫ��ͬ�ϣ�������Ŀ¼��
	            *
	            */
	            
	           else if(each.isDirectory()) {
	               System.out.println(each.getName()+"�ļ���");
	               File[] fd =each.listFiles();
	               if(fd != null) {
	                   for(File sd : fd) {
	                       System.out.println(sd.getName()+"���ļ�");
//	                     listFiles();
	                   }
	               }
	               }
	       }
	    System.out.println("----------------------------------------------------------------" );
	               System.out.println("�����ļ��������ǣ�"+maxName+"\t�䳤���ǣ�"+max);
	               System.out.println("��С���ļ��������ǣ�"+minName+"\t�䳤���ǣ�"+min);
	               System.out.println("�����ļ���·���ǣ�"+maxFile+"\t�䳤���ǣ�"+max);
	               System.out.println("��С���ļ���·���ǣ�"+minFile+"\t�䳤���ǣ�"+min);

	}

}
