package com.how2j.exception;

public class TestExceptionExam {

	/*
	 假设有一个方法 public int method()， 会返回一个整数
	在这个方法中有try catch 和 finally.
	try 里返回 1
	catch 里 返回 2
	finally 里 返回3
	那么，这个方法到底返回多少？
	 */
	public static void main(String[] args) {
		
		int flag = -1;
		flag = method();
		System.out.println("返回值："+flag);
		
		System.out.println("+++++++++++++++");
		
		flag = method2();
		System.out.println("返回值："+flag);
		
	}
	
	public static int method(){
		try{
			int x = 1;
			int y = 0;
			int j = x/y;
			System.out.println(j);
			System.out.println("打印1");
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("打印2");
			return 2;
		}
		finally {
			System.out.println("打印3");
			return 3;
		}
	}
	
    public static int method2(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }
        finally{
            return 3;
        }
    }

}
