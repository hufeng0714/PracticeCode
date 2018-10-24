package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
 */

public class TestStreamExam2 {

	public static void main(String[] args) {
        int eachSize = 102400;       //100k
        File srcFile = new File("E:/filetest/monkey_log.txt");
        splitFile(srcFile,eachSize);
    }
     
    /*> 拆分思路：先把源文件的所有内容读取到内存中，然后从内存中挨个分到子文件里 <*/
    private static void splitFile(File srcFile, int eachSize) {
        if(srcFile.length() == 0) {
            throw new RuntimeException("文件长度为0,不可拆分");
        }
        byte[] data = new byte[(int) srcFile.length()];
        try {
            FileInputStream fis = new FileInputStream(srcFile);
            fis.read(data);
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
         
    /*------------------------------------------------------*/
         
        int fileNumber; //计算需要被划分成多少份子文件
        if(data.length % eachSize == 0) {
            fileNumber = (int)(data.length / eachSize);
        }else {
            fileNumber = (int)(data.length / eachSize) + 1;
        }
         
        for (int i = 0; i < fileNumber; i++) {
            String eachFileName = srcFile.getName() + "-" + i;
            File eachFile = new File(srcFile.getParent(),eachFileName);
            byte[] eachContent = null;
             
            if(i != fileNumber - 1) {
                //不是最后一个
                eachContent = Arrays.copyOfRange(data, eachSize * i, eachSize * (i + 1));
            }else {
                //最后一个
                eachContent = Arrays.copyOfRange(data, eachSize * i, data.length);
            }
             
            try {
                FileOutputStream fos = new FileOutputStream(eachFile);
                fos.write(eachContent);
                fos.close();
                System.out.println("输出子文件" + eachFile.getAbsolutePath() + "其大小是" + eachFile.length());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
         
    }
}
