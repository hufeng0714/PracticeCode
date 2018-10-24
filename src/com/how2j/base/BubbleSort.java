package com.how2j.base;

public class BubbleSort {

	/**
冒泡法排序的思路： 
第一步：从第一位开始，把相邻两位进行比较 
如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的 
第二步： 再来一次，只不过不用比较最后一位 
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
		
		for(int j=0;j<a.length;j++){
			for(int k=0;k<a.length;k++){
				// if(a[j]<a[k]){	//从小到大排序
				if(a[j]>a[k]){		//从大到小排序
					int temp = a[k];
					a[k]=a[j];
					a[j]=temp;
					
					//int temp = a[k];	//a[j]和a[k]值互换，和上面3句功能一样
					//a[k]=a[j];
					//a[j]=temp;
				}
			}
		}
		
		for(int m=0;m<a.length;m++){
			System.out.println(a[m]);
		}
		
	}

}
