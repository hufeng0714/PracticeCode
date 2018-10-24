package com.how2j.base;

public class SelectionSort {

	/**
选择法排序的思路： 
把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来 
比较完后，第一位就是最小的 
然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来 
比较完后，第二位就是第二小的 
以此类推
	 */
	/**
	 首先创建一个长度是5的数组,并填充随机数。
	首先用选择法正排序，然后再对其使用冒泡法倒排序
	注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
	 */
	public static void main(String[] args) {

		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		System.out.println("+++++++++++++++++");
		
		for(int j=0;j<a.length-1;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[j]>a[k]){
					int temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		
		for(int m=0;m<a.length;m++){
			System.out.println(a[m]);
		}
	}
}
