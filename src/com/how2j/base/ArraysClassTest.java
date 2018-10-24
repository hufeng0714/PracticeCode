package com.how2j.base;

import java.util.Arrays;

public class ArraysClassTest {

	/**
首先定义一个5X8的二维数组，然后使用随机数填充满。
借助Arrays的方法对二维数组进行排序。
参考思路：
先把二维数组使用System.arraycopy进行数组复制到一个一维数组
然后使用sort进行排序
最后再复制回到二维数组。
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
		//打印二维数组	
		String arraysContent = Arrays.deepToString(a);
		System.out.println(arraysContent);
		
		System.out.println("将二维数组a中元素整合到一维数组b中");		
		
		for(int k=0;k<a.length;k++){
			System.arraycopy(a[k], 0, b, k*a[k].length,a[k].length);
		}
		
		String strB = Arrays.toString(b);
		System.out.println(strB);
		//数组排序
		Arrays.sort(b);
		strB = Arrays.toString(b);
		System.out.println(strB);
		
		System.out.println("将一维数组b中元素整合到二维数组c中");
		for(int m=0;m<c.length;m++){
			System.arraycopy(b, m*c[m].length, c[m], 0, c[m].length);
		}
		arraysContent = Arrays.deepToString(c);
		System.out.println(arraysContent);
		
	}

}
