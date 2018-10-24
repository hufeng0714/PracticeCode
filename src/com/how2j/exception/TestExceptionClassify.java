package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceptionClassify {

	/*
	�쳣���ࣺ �ɲ��쳣������ʱ�쳣�ʹ���3�� 
	���У�����ʱ�쳣�ʹ����ֽзǿɲ��쳣
	 */
	public static void main(String[] args) {
		//TestCheckedException();
		//TestRuntimeException();
		//TestErrorException();//һֱ���ڴ棬����
	}
	
	public static void TestCheckedException(){
		/*
		 �ɲ��쳣�� CheckedException
		�ɲ��쳣��������д�����쳣��Ҫôtry catchס,Ҫô�����ף�˭���ã�˭�������� FileNotFoundException
		������������������Ͳ�����ͨ��
		 */
		
		 File f= new File("d:/LOL.exe");
        
	        try{
	            System.out.println("��ͼ�� d:/LOL.exe");
	            new FileInputStream(f);
	            System.out.println("�ɹ���");
	        }
	        catch(FileNotFoundException e){
	            System.out.println("d:/LOL.exe������");
	            e.printStackTrace();
	        }
	}
	
	public static void TestRuntimeException(){
        /*
		 ����ʱ�쳣RuntimeExceptionָ�� ���Ǳ������try catch���쳣 
		��������ʱ�쳣: 
		��������Ϊ0�쳣:ArithmeticException 
		�±�Խ���쳣:ArrayIndexOutOfBoundsException 
		��ָ���쳣:NullPointerException 
		�ڱ�д�����ʱ����Ȼ����ʹ��try catch throws���д�����ɲ��쳣��֮ͬ�����ڣ����㲻����try catch��Ҳ�����б������ 
		Java֮���Ի��������ʱ�쳣��ԭ��֮һ������Ϊ�±�Խ�磬��ָ����Щ����ʱ�쳣̫�����ձ飬�������Ҫ���в�׽������Ŀɶ��Ծͻ��ú���⡣
     */
    
    //�κγ�������Ϊ0:ArithmeticException
    int k = 5/0;
     
    //�±�Խ���쳣��ArrayIndexOutOfBoundsException
    int j[] = new int[5];
    j[10] = 10;
     
    //��ָ���쳣��NullPointerException
    String str = null;
    str.length();
	}
	
	public static void TestErrorException(){
		/*
		����Error��ָ����ϵͳ������쳣��ͨ�����ڴ��ù���
		��Ĭ�������£�һ��java����������ʱ��������ʹ��16m���ڴ�
		������ͣ�ĸ�StringBuffer׷���ַ����ܿ�Ͱ��ڴ�ʹ�ù��ˡ��׳�OutOfMemoryError
		������ʱ�쳣һ��������Ҳ�ǲ�Ҫ��ǿ�Ʋ�׽��
		*/
        StringBuffer sb =new StringBuffer();
        
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append('a');
        }
	}

}
