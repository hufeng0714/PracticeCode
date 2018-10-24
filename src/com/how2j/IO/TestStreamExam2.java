package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * �ҵ�һ������100k���ļ�������100kΪ��λ����ֳɶ�����ļ��������Ա����Ϊ�ļ���������
 */

public class TestStreamExam2 {

	public static void main(String[] args) {
        int eachSize = 102400;       //100k
        File srcFile = new File("E:/filetest/monkey_log.txt");
        splitFile(srcFile,eachSize);
    }
     
    /*> ���˼·���Ȱ�Դ�ļ����������ݶ�ȡ���ڴ��У�Ȼ����ڴ��а����ֵ����ļ��� <*/
    private static void splitFile(File srcFile, int eachSize) {
        if(srcFile.length() == 0) {
            throw new RuntimeException("�ļ�����Ϊ0,���ɲ��");
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
         
        int fileNumber; //������Ҫ�����ֳɶ��ٷ����ļ�
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
                //�������һ��
                eachContent = Arrays.copyOfRange(data, eachSize * i, eachSize * (i + 1));
            }else {
                //���һ��
                eachContent = Arrays.copyOfRange(data, eachSize * i, data.length);
            }
             
            try {
                FileOutputStream fos = new FileOutputStream(eachFile);
                fos.write(eachContent);
                fos.close();
                System.out.println("������ļ�" + eachFile.getAbsolutePath() + "���С��" + eachFile.length());
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
         
    }
}
