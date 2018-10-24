package com.how2j.NumString;

public class TestMathExam {

	/**
	 这个图是自然对数的计算方式。(当n趋向无穷大时（1+1/n）的n次方=e)
	借助Math的方法，把自然对数计算出来，看看经过自己计算的自然对数和Math.E的区别有多大
	 */
	
	/**
	 统计找出一千万以内，一共有多少质数

	质数概念: 只能被1和自己整除的数
	举例:
	5只能被 1和5整除，所以是质数
	8可以被2整除，所以不是质数
	 */
	public static void main(String[] args) {
		
		int n = Integer.MAX_VALUE;
		double db = Math.pow((1+1.0/n),n);
		System.out.println(Math.E);
		System.out.println(db);
		
		float i = 66.4f;
		int j = (int)i;
		System.out.println(j);
		
		int count = 0;
		for(int a=2;a<10000000;a++){
			if(pd(a))
				count++;
		}
		
		System.out.println(count);
		
			
	}
	
	static boolean pd(int n){
		int k = (int) Math.sqrt(n) + 1;
		if(n==2){
			return true;
		}
		for(int m=2;m<k;m++){
			if(n%m==0)
				return false;
		}
		return true;
	}

}
