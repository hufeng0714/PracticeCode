package com.how2j.base;

import java.util.Arrays;

public class ArraysClass {

	/**
	 copyOfRange	数组复制
	 toString()		转换为字符串
	 sort			排序
	 binarySearch	搜索
	 equals			是否相同（长度相等，值相同）
	 fill			填充
	 */
	public static void main(String[] args) {
		
		int[] a = new int[]{18,32,22,45,7,89};
        // copyOfRange(int[] original, int from, int to)
        // 第一个参数表示源数组
        // 第二个参数表示开始位置(取得到)
        // 第三个参数表示结束位置(取不到)
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
