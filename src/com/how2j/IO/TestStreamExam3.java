package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 把上述拆分出来的文件，合并成一个原文件。以是否能正常运行，验证合并是否正确
 */

public class TestStreamExam3 {
	
    public static void main(String[] args) {
        murgeFile("E:/","/filetest/monkey_log.txt");
    }
    /*合并的思路，就是从eclipse.exe-0开始，读取到一个文件，就开始写出到 eclipse.exe中，直到没有文件可以读 */
    private static void murgeFile(String folder, String fileName) {
        try {
            //合并的目标文件
            File f = new File(folder,fileName);            
            FileOutputStream fos = new FileOutputStream(f);     //写入
            int index = 0;
            while(true) {
                File eachFile = new File(folder,fileName + '-' + (index++));    //子文件
                if(!eachFile.exists()) {
                    break;      //如果子文件不存在就退出
                }
                //读取子文件的内容
                FileInputStream fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);
                fis.close();
                 
                fos.write(eachContent); //把子文件的内容写进入
                fos.flush();
                System.out.printf("把子文件%s写入到目标文件中%n",eachFile);
            }  
            fos.close();
            System.out.printf("最后目标文件的大小：%,d字节",f.length());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
