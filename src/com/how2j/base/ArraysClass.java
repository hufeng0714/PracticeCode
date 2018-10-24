package com.how2j.base;

import java.util.Arrays;

public class ArraysClass {

	/**
	 copyOfRange	���鸴��
	 toString()		ת��Ϊ�ַ���
	 sort			����
	 binarySearch	����
	 equals			�Ƿ���ͬ��������ȣ�ֵ��ͬ��
	 fill			���
	 */
	public static void main(String[] args) {
		
		int[] a = new int[]{18,32,22,45,7,89};
        // copyOfRange(int[] original, int from, int to)
        // ��һ��������ʾԴ����
        // �ڶ���������ʾ��ʼλ��(ȡ�õ�)
        // ������������ʾ����λ��(ȡ����)
		int[] b = Arrays.copyOfRange(a, 0, 6);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		String arrayContent = Arrays.toString(a);
		System.out.println(arrayContent);
		
		Arrays.sort(a);
		arrayContent = Arrays.toString(a);
		System.out.println(arrayContent);
		
		System.out.println(Arrays.binarySearch(a, 32));
		
		int[] c = new int[]{18,32,22,45,7,89};
		
		System.out.println(Arrays.equals(b, c));
		
		int[] d = new int[5];
		
		Arrays.fill(d, 66);
		System.out.println(Arrays.toString(d));
	}

}
