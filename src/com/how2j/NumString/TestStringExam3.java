package com.how2j.NumString;

		/**
		 * ����һ��������100���ַ�������
		ʹ�ó�����2������ַ������ַ�������
		ͳ������ַ����������ظ����ַ����ж�����
		
		 */

public class TestStringExam3 {

    public static String randomString(){
        char[] cs = new char[2];
        int start = (int)'a';
        int end = (int)'z';
        cs[0]=((char)(Math.random()*(end - start)+start));
        cs[1]=((char)(Math.random()*(end - start)+start));
        String str = new String(cs);
        return str;
         
    }
     public static void main(String[] args) {
          
        String[] str1 = new String[100];
        for(int i=0;i<100;i++){
            str1[i]=randomString();
            System.out.print(str1[i]+"\t");
            if(i%10 == 0 && i != 0)
                System.out.println("\n");
            }
        int count =0 ;
        System.out.println("\n�������ظ����ַ�����");
        for(int i=0;i<100;i++){
            for(int j=i+1;j<100;j++){
            	//ʹ��equals�����ַ������ݵıȽϣ������Сдһ��             	
            	//equalsIgnoreCase�����Դ�Сд�ж������Ƿ�һ��
                if(str1[i].equals(str1[j])){
                    System.out.print(str1[i]+"\t");
                    count++;
                    break;
                }  
            }
            }
        System.out.println(count);
     }

}
