package com.how2j.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStreamClose {

	/**
	 * ���е����������������������������ʹ�����֮�󣬶�Ӧ�ùرա�
	 * ������رգ����������Դռ�õ��˷ѡ� �����Ƚϴ��ʱ�򣬻�Ӱ�쵽ҵ���������չ��
	 */
	
	/*
	 ��try����������ر��ļ�����������ǰ���ʾ���ж���ʹ�����ַ�ʽ����������һ���׶ˣ�
	����ļ������ڣ����߶�ȡ��ʱ�����������׳��쳣����ô�Ͳ���ִ����һ�йر����Ĵ��룬���ھ޴����Դռ�������� ���Ƽ�ʹ��
	 */
	public void tryClose(){
        try {
            File f = new File("E:/filetest/monkey_log.txt");
            FileInputStream fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            // ��try ��ر���
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	/*
	 ���Ǳ�׼�Ĺر����ķ�ʽ
	1. ���Ȱ���������������try�����棬���������try���棬���������޷��ִ�finally.
	2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��()
	3. �رյ�ʱ����Ҫ��һ�ν���try catch����

���Ǳ�׼���Ͻ��Ĺر����ķ�ʽ�����ǿ���ȥ�ܷ���������д����Ҫ�Ļ��߲��Դ����ʱ�򣬶�����������������try�ķ�ʽ����Ϊ���鷳~
	 */
	public void finallyClose(){
		File f = new File("E:/filetest/monkey_log.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // ��finally ��ر���
        	/*
        	 ��Ȼ��Ҫ���رյĲ������϶�Ҫ��֤��������������ٱ���Ķ��������ð���
        	 �������°࣬��˾Ҫ��������˹��������°࣬
        	 �����°�ǰ��ͻ���һ���Ƿ����������������ŸһؼҰ� 
        	 
        	 ��Ϊ��������ʱ�����ʧ�ܣ�ʧ�ܾͲ������������ǿ�йرգ������쳣��
        	 */
            if (null != fis)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
	}
	
	
	/*
	 ����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
	���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���

	���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ���������try()�н���ʵ������
	 ������try, catch, finally������ʱ���Զ��رգ����������Դ��
	 */
	
	public void autoClose(){
		File f = new File("E:/filetest/monkey_log.txt");
		  
        //����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
        try (FileInputStream fis = new FileInputStream(f)) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void main(String[] args) {

		TestStreamClose tsc = new TestStreamClose();
		tsc.tryClose();
		tsc.finallyClose();
		tsc.autoClose();
	}

}
