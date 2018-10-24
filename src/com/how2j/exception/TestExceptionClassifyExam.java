package com.how2j.exception;

public class TestExceptionClassifyExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//测试运行时异常是否能被捕捉
		try{
			int a[]=new int[123];
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				a[i]=4;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组下标越界");
		}
		
		//测试错误能否被捕捉
		StringBuffer sb=new StringBuffer();
		try{
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				sb.append('s');
			}
		}catch(Error e){
			System.out.println("这是一个错误Error");
		}
		
	}
}

//都可以捕捉到
