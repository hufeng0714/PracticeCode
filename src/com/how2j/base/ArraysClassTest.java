package com.how2j.base;

import java.util.Arrays;

public class ArraysClassTest {

	/**
���ȶ���һ��5X8�Ķ�ά���飬Ȼ��ʹ��������������
����Arrays�ķ����Զ�ά�����������
�ο�˼·��
�ȰѶ�ά����ʹ��System.arraycopy�������鸴�Ƶ�һ��һά����
Ȼ��ʹ��sort��������
����ٸ��ƻص���ά���顣
	 */
	public static void main(String[] args) {
		
		int[][] a = new int[5][8];
		int[] b = new int[40];
		int[][] c = new int[5][8];
		System.out.println("a.length = "+a.length);
		System.out.println("a[1].length = "+a[1].length);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*100);
			}
		}
		//��ӡ��ά����	
		String arraysContent = Arrays.deepToString(a);
		System.out.println(arraysContent);
		
		System.out.println("����ά����a��Ԫ�����ϵ�һά����b��");		
		
		for(int k=0;k<a.length;k++){
			System.arraycopy(a[k], 0, b, k*a[k].length,a[k].length);
		}
		
		String strB = Arrays.toString(b);
		System.out.println(strB);
		//��������
		Arrays.sort(b);
		strB = Arrays.toString(b);
		System.out.println(strB);
		
		System.out.println("��һά����b��Ԫ�����ϵ���ά����c��");
		for(int m=0;m<c.length;m++){
			System.arraycopy(b, m*c[m].length, c[m], 0, c[m].length);
		}
		arraysContent = Arrays.deepToString(c);
		System.out.println(arraysContent);
		
	}

}
