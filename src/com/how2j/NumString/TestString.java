package com.how2j.NumString;

public class TestString {

	/**
	 ����1�� ʹ��String��ľ�̬����valueOf 
	����2�� �Ȱѻ�������װ��Ϊ����Ȼ����ö����toString
	 */
	public static void main(String[] args) {

		int i = 5;
		//����1
		String str = String.valueOf(i);
		//����2
		Integer it = i;
		String str2 = it.toString();
		
		String str3 = "999";
		int i2 = Integer.parseInt(str3);
		System.out.println(i2);
	}

}
