package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ��������ֳ������ļ����ϲ���һ��ԭ�ļ������Ƿ����������У���֤�ϲ��Ƿ���ȷ
 */

public class TestStreamExam3 {
	
    public static void main(String[] args) {
        murgeFile("E:/","/filetest/monkey_log.txt");
    }
    /*�ϲ���˼·�����Ǵ�eclipse.exe-0��ʼ����ȡ��һ���ļ����Ϳ�ʼд���� eclipse.exe�У�ֱ��û���ļ����Զ� */
    private static void murgeFile(String folder, String fileName) {
        try {
            //�ϲ���Ŀ���ļ�
            File f = new File(folder,fileName);            
            FileOutputStream fos = new FileOutputStream(f);     //д��
            int index = 0;
            while(true) {
                File eachFile = new File(folder,fileName + '-' + (index++));    //���ļ�
                if(!eachFile.exists()) {
                    break;      //������ļ������ھ��˳�
                }
                //��ȡ���ļ�������
                FileInputStream fis = new FileInputStream(eachFile);
                byte[] eachContent = new byte[(int) eachFile.length()];
                fis.read(eachContent);
                fis.close();
                 
                fos.write(eachContent); //�����ļ�������д����
                fos.flush();
                System.out.printf("�����ļ�%sд�뵽Ŀ���ļ���%n",eachFile);
            }  
            fos.close();
            System.out.printf("���Ŀ���ļ��Ĵ�С��%,d�ֽ�",f.length());
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
