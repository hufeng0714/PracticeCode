package com.how2j.exception;

public class TestExceptionExam {

	/*
	 ������һ������ public int method()�� �᷵��һ������
	�������������try catch �� finally.
	try �ﷵ�� 1
	catch �� ���� 2
	finally �� ����3
	��ô������������׷��ض��٣�
	 */
	public static void main(String[] args) {
		
		int flag = -1;
		flag = method();
		System.out.println("����ֵ��"+flag);
		
		System.out.println("+++++++++++++++");
		
		flag = method2();
		System.out.println("����ֵ��"+flag);
		
	}
	
	public static int method(){
		try{
			int x = 1;
			int y = 0;
			int j = x/y;
			System.out.println(j);
			System.out.println("��ӡ1");
			return 1;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("��ӡ2");
			return 2;
		}
		finally {
			System.out.println("��ӡ3");
			return 3;
		}
	}
	
    public static int method2(){
        try{
            return 1;
        }catch(Exception e){
            return 2;
        }
        finally{
            return 3;
        }
    }

}
