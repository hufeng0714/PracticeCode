package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;

public class TestExceptionThrowable {

	/**
	Throwable是类，Exception和Error都继承了该类
	所以在捕捉的时候，也可以使用Throwable进行捕捉
	如图： 异常分Error和Exception
	Exception里又分运行时异常和可查异常
	 */
	public static void main(String[] args) {

        File f = new File("d:/LOL.exe");
        try {
            new FileInputStream(f);
            //使用Throwable进行异常捕捉
        } catch (Throwable t) {
            t.printStackTrace();
        }
        
        try {
            method();
        }
        catch (Throwable e) {
            e.printStackTrace();
        }

	}
	/*
	 在方法声明上，可以抛出指定的异常，比如FileNotFoundException
	那么能否抛出Throwable这个类？ 

	这个方法的调用者又该如何处理？
	可以抛出
	 */
    private static void method() throws Throwable{
        File f = new File("f:/LOL.exe");
        new FileInputStream(f);
    }

}
