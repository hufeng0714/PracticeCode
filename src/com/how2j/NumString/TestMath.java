package com.how2j.NumString;

public class TestMath {

	/**
	 * ��������, ��������������η����У���Ȼ����
	 */
	public static void main(String[] args) {

        float f1 = 5.4f;
        float f2 = 5.5f;
        //5.4�������뼴5
        System.out.println(Math.round(f1));
        //5.5�������뼴6
        System.out.println(Math.round(f2));
         
        //�õ�һ��0-1֮��������������ȡ����1��
        System.out.println(Math.random());
         
        //�õ�һ��0-10֮���������� ��ȡ����10��
        System.out.println((int)( Math.random()*10));
        //����
        System.out.println(Math.sqrt(9));
        //�η���2��4�η���
        System.out.println(Math.pow(2,4));
         
        //��
        System.out.println(Math.PI);
         
        //��Ȼ����
        System.out.println(Math.E);
	}

}
