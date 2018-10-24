package com.how2j.IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
//准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
//设计一个方法
//
//public static void encodeFile(File encodingFile, File encodedFile);
//
//
//在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
//加密算法：
//数字：
//如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
//如果是9的数字，变成0
//字母字符：
//如果是非z字符，向右移动一个，比如d变成e, G变成H
//如果是z，z->a, Z-A。
//字符需要保留大小写
//非字母字符
//比如',&^ 保留不变，中文也保留不变
//建议： 使用以前学习的练习题中的某个Java文件，比如循环练习，就有很多的字符和数字
 
//解密在文件加密中生成的文件。
//设计一个方法
//
//public static void decodeFile(File decodingFile, File decodedFile);
//
//
//在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
//解密算法：
//数字：
//如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
//如果是0的数字，变成9
//字母字符：
//如果是非a字符，向左移动一个，比如e变成d, H变成G
//如果是a，a->z, A-Z。
//字符需要保留大小写
//非字母字符：
//比如',&^ 保留不变，中文也保留不变
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
        //在这个方法中把decodingFile的内容进行解密，然后保存到decodedFile文件中。
        //解密算法：
        //数字：
        //如果不是0的数字，在原来的基础上减1，比如6变成5, 4变成3
        //如果是0的数字，变成9
        //字母字符：
        //如果是非a字符，向左移动一个，比如e变成d, H变成G
        //如果是a，a->z, A-Z。
        //字符需要保留大小写
        //非字母字符：
        //比如',&^ 保留不变，中文也保留不变
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