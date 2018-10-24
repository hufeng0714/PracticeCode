package com.how2j.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
//׼��һ���ı��ļ�(�Ƕ�����)�����а���ASCII����ַ��������ַ���
//���һ������
//
//public static void encodeFile(File encodingFile, File encodedFile);
//
//
//����������а�encodingFile�����ݽ��м��ܣ�Ȼ�󱣴浽encodedFile�ļ��С�
//�����㷨��
//���֣�
//�������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
//�����9�����֣����0
//��ĸ�ַ���
//����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
//�����z��z->a, Z-A��
//�ַ���Ҫ������Сд
//����ĸ�ַ�
//����',&^ �������䣬����Ҳ��������
//���飺 ʹ����ǰѧϰ����ϰ���е�ĳ��Java�ļ�������ѭ����ϰ�����кܶ���ַ�������
 
//�������ļ����������ɵ��ļ���
//���һ������
//
//public static void decodeFile(File decodingFile, File decodedFile);
//
//
//����������а�decodingFile�����ݽ��н��ܣ�Ȼ�󱣴浽decodedFile�ļ��С�
//�����㷨��
//���֣�
//�������0�����֣���ԭ���Ļ����ϼ�1������6���5, 4���3
//�����0�����֣����9
//��ĸ�ַ���
//����Ƿ�a�ַ��������ƶ�һ��������e���d, H���G
//�����a��a->z, A-Z��
//�ַ���Ҫ������Сд
//����ĸ�ַ���
//����',&^ �������䣬����Ҳ��������
public class FileEncryption {
    public static File encodingFile;
    public static File encodedFile;
    public static File decodingFile;
    public static File decodedFile;
    public static void encodeFile(File encodingFile,File encodedFile) {
        try {
            FileReader fr=new FileReader(encodingFile);
            FileWriter fw=new FileWriter(encodedFile);
            char [] encodingChar=new char[(int) encodingFile.length()];
            fr.read(encodingChar);
            System.out.println(Arrays.toString(encodingChar));
            String encodingCharc="";
            for(char c:encodingChar) {
                if(c=='9') {
                    c='0';
                }
                else if(c>='0'&&c<='8') {
                    c=(char) (c+1);
                }
                if(c>='a'&&c<='y') {
                    c=(char) (c+1);
                }
                if(c>='A'&&c<='Y'){
                    c=(char) (c+1);
                }
                if(c=='z') {
                    c='a';
                }
                if(c=='Z') {
                    c='A';
                }  
                encodingCharc+=c;
            }
            char [] encodedCharc=encodingCharc.toCharArray();
            System.out.println(Arrays.toString(encodedCharc));
            fw.write(encodedCharc);
            fr.close();
            fw.close();
             
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void decodeFile(File decodingFile,File decodedFile) {
        //����������а�decodingFile�����ݽ��н��ܣ�Ȼ�󱣴浽decodedFile�ļ��С�
        //�����㷨��
        //���֣�
        //�������0�����֣���ԭ���Ļ����ϼ�1������6���5, 4���3
        //�����0�����֣����9
        //��ĸ�ַ���
        //����Ƿ�a�ַ��������ƶ�һ��������e���d, H���G
        //�����a��a->z, A-Z��
        //�ַ���Ҫ������Сд
        //����ĸ�ַ���
        //����',&^ �������䣬����Ҳ��������
        try {
            FileReader fr=new FileReader(decodingFile);
            FileWriter fw=new FileWriter(decodedFile);
            char [] decodingChar=new char[(int) decodingFile.length()];
            fr.read(decodingChar);
            System.out.println(Arrays.toString(decodingChar));
            
            String decodingCharc="";
            for(char c:decodingChar) {
                if(c>'0'&&c<='9') {
                    c=(char) (c-1);
                }
                else if(c=='0'){
                    c='9';
                }
                if(c>'a'&&c<='z') {
                    c=(char) (c-1);
                }
                else if(c=='a') {
                    c='z';
                }
                if(c>'A'&&c<='Z') {
                    c=(char) (c-1);
                }
                else if(c=='A') {
                    c='Z';
                }
                decodingCharc+=c;
            }
            char []decodedCharc=decodingCharc.toCharArray();
            fw.write(decodedCharc);
            System.out.println(Arrays.toString(decodedCharc));
            fr.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        encodingFile=new File("E:/filetest/encodingFile.txt");
        encodedFile=new File("E:/filetest/encodedFile.txt");
        decodingFile=new File("E:/filetest/decodingFile.txt");
        decodedFile=new File("E:/filetest/decodedFile.txt");
        encodeFile(encodingFile,encodedFile);
        decodeFile(decodingFile,decodedFile);
    }
}