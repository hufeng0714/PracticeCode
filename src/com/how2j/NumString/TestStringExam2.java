package com.how2j.NumString;

import java.util.Arrays;

public class TestStringExam2 {

	/**
	创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
	给点提示: 数字和字符之间可以通过互相转换
	char c = 'A';
	short s = (short) c;
	通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
	需要用到ASCII码对照表
	 * @return 
	 * @return 
	 */
	
	public String randomString(){
		char[] cs = new char[3];
		String str = "";
		for(int i=0;i<cs.length;i++){
			int m1 = 65 + (int) (Math.random()* (90-65));//大写字母
			int m2 = 97 + (int) (Math.random()* (122-97));//小写字母
			int m3 = 48 + (int) (Math.random()* (57-48));//数字
			int[] m ={m1,m2,m3};
			//System.out.println(m.length);
			//随机产生0,1,2数,由于Math.random生成的是左闭右开的性质，所有使用Math.floor做向下取整
			int index = (int)Math.floor((Math.random()*(m.length)));
			//System.out.println(index);
			cs[i] =(char)(m[index]);
			str+=cs[i];
		}
		System.out.println(str);
		return str;
	}
	
		/**
		 创建一个长度是8的字符串数组
		使用8个长度是5的随机字符串初始化这个数组
		对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

		注1： 不能使用Arrays.sort() 要自己写
		注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
		 */
	 
	public void randomStringArraySort(){
        String[] str = new String[8];
        for (int i = 0; i < str.length; i++) {
             str[i]= randomString();
        }
        System.out.println("排序前：");
        System.out.println(Arrays.toString(str));
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - j -1; j++) {
                char char1 = str[j].charAt(0);
                char char2 = str[j + 1].charAt(0);
                 
                char1 = Character.toLowerCase(char1);
                char2 = Character.toLowerCase(char2);
                 
                if(char1 > char2) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        System.out.println(Arrays.toString(str));
	}
	
	/**
	 	1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
		2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
		要求： 分别使用多层for循环 和 递归解决上述问题
	 */
	
	public void matchThree(){
        String pass = randomString();
        System.out.println(pass);
        System.out.println("-----------------");
        char[] str = new char[3];
        outLoop:
        for (short i = '0'; i <= 'z'; i++) {
            for (short j = '0'; j <='z'; j++) {
                for (short k = '0'; k <= 'z'; k++) {
                    if(!isLetterOrDigit(i,j,k)) {
                        continue;
                    }
                    str[0] = (char)i;
                    str[1] = (char)j;
                    str[2] = (char)k;
                    String rpass= String.valueOf(str);
                    //System.out.println(rpass);
                     
                    if(rpass.equals(pass)) {
                        System.out.println("找到密码：" + rpass);
                        break outLoop;
                    }
                }
            }
        }
	}
	
    private static boolean isLetterOrDigit(short i, short j, short k) {
        return Character.isLetterOrDigit(i) && Character.isLetterOrDigit(j) && Character.isLetterOrDigit(k);
    }
	
	
	public static void main(String[] args) {
		
		TestStringExam2 tse2 = new TestStringExam2();
		tse2.randomString();
		
		tse2.randomStringArraySort();
		
		tse2.matchThree();

	}

}
