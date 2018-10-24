package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestExceptionThrows {

	/*
	 �������������
	����������method1
	method1����method2
	method2�д��ļ�
	
	method2����Ҫ�����쳣����
	����method2�����㴦�����ǰ�����쳣ͨ��throws�׳�ȥ
	��ômethod1�ͻ�ӵ����쳣�� ����취Ҳ�����֣�Ҫô��try catch�������ҪôҲ���׳�ȥ��
	method1ѡ�񱾵�try catchס һ��try catchס�ˣ����൱�ڰ�����쳣�������ˣ��������ڵ���method1��ʱ�򣬾Ͳ���Ҫ�����쳣������
	 */
	public static void main(String[] args) {
		method1();

	}
	
    private static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
 
    }
 
    /*
     throws��throw�������ؼ��ֽӽ����������岻һ��������������
		1. throws �����ڷ��������ϣ���throwͨ���������ڷ������ڡ�
		2. throws ��ʾ�����쳣��һ�ֿ����ԣ�����һ���ᷢ����Щ�쳣��throw�����׳����쳣��ִ��throw��һ���׳���ĳ���쳣����
     */
    private static void method2() throws FileNotFoundException {
 
        File f = new File("d:/LOL.exe");
 
        System.out.println("��ͼ�� d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("�ɹ���");
 
    }

}
