package com.how2j.NumString;

		/**
		 * 创建一个长度是100的字符串数组
		使用长度是2的随机字符填充该字符串数组
		统计这个字符串数组里重复的字符串有多少种
		
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
        System.out.println("\n其中有重复的字符串：");
        for(int i=0;i<100;i++){
            for(int j=i+1;j<100;j++){
            	//使用equals进行字符串内容的比较，必须大小写一致             	
            	//equalsIgnoreCase，忽略大小写判断内容是否一致
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
