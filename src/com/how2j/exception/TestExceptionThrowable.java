package com.how2j.exception;

import java.io.File;
import java.io.FileInputStream;

public class TestExceptionThrowable {

	/**
	Throwable���࣬Exception��Error���̳��˸���
	�����ڲ�׽��ʱ��Ҳ����ʹ��Throwable���в�׽
	��ͼ�� �쳣��Error��Exception
	Exception���ַ�����ʱ�쳣�Ϳɲ��쳣
	 */
	public static void main(String[] args) {

        File f = new File("d:/LOL.exe");
        try {
            new FileInputStream(f);
            //ʹ��Throwable�����쳣��׽
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
	 �ڷ��������ϣ������׳�ָ�����쳣������FileNotFoundException
	��ô�ܷ��׳�Throwable����ࣿ 

	��������ĵ������ָ���δ���
	�����׳�
	 */
    private static void method() throws Throwable{
        File f = new File("f:/LOL.exe");
        new FileInputStream(f);
    }

}
