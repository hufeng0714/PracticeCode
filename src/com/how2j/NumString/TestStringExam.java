package com.how2j.NumString;

public class TestStringExam {

	/**
	 �Ѹ����� 3.14 ת��Ϊ �ַ��� "3.14"
	�ٰ��ַ��� ��3.14�� ת��Ϊ ������ 3.14

	����ַ����� 3.1a4��ת��Ϊ��������õ�ʲô��
	 */
	public static void main(String[] args) {

		float f = 3.14f;
		String s = "3.14";
		String s1 = "3.14a4";
		
		//String����ת��������-�ַ�������
		String s2 = String.valueOf(f);
		System.out.println(s2);
		
		//װ�䷽��ת��������-�ַ�������
        Float f0 = new Float(f);
        System.out.println("װ�䷽��������-�ַ�����-��װ��-������f2:\t"+f0);
        String s3 = f0.toString();
        System.out.println("װ�䷽��������-�ַ�����-�ַ���str2: \t"+s3);
        System.out.println("--------------------------------------");
		
		//��̬�������ַ���-���֣���
		float f2 = Float.parseFloat(s);
		System.out.println(f2);
		
		//�����쳣
		//float f3 = Float.parseFloat(s1);
		//System.out.println(f3);
	}

}
