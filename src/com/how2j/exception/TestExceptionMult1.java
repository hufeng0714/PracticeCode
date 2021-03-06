package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestExceptionMult1 {

	/*
	 多异常捕捉办法1
	 有的时候一段代码会抛出多种异常，比如
	 new FileInputStream(f);
	 Date d = sdf.parse("2016-06-03");
	 
	 这段代码，会抛出 文件不存在异常 FileNotFoundException 和 解析异常ParseException
	 解决办法之一是分别进行catch
	 
	 catch (FileNotFoundException e) {
	 System.out.println("d:/LOL.exe不存在");
	 e.printStackTrace();
	 } catch (ParseException e) {
	 System.out.println("日期格式解析错误");
	 e.printStackTrace();
	 }
	 */
    public static void main(String[] args) {
    	 
        File f = new File("d:/lol.exe");
 
        try {
            System.out.println("试图打开 d:/lol.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
            
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
    }

}
