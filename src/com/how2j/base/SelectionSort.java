package com.how2j.base;

public class SelectionSort {

	/**
ѡ�������˼·�� 
�ѵ�һλ���������еĽ��бȽϣ�ֻҪ�ȵ�һλС�ģ��ͻ�����һ��λ���� 
�Ƚ���󣬵�һλ������С�� 
Ȼ���ٴӵڶ�λ��ʣ����������н��бȽϣ�ֻҪ�ȵڶ�λС���ͻ����ڶ���λ���� 
�Ƚ���󣬵ڶ�λ���ǵڶ�С�� 
�Դ�����
	 */
	/**
	 ���ȴ���һ��������5������,������������
	������ѡ��������Ȼ���ٶ���ʹ��ð�ݷ�������
	ע ��ν����������Ǵ�С�������򣬵�������ǴӴ�С����
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
