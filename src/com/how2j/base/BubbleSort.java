package com.how2j.base;

public class BubbleSort {

	/**
ð�ݷ������˼·�� 
��һ�����ӵ�һλ��ʼ����������λ���бȽ� 
�������ǰ��ıȺ���Ĵ󣬾ͰѴ�����ݽ����ں��棬ѭ���Ƚ���Ϻ����һλ�������� 
�ڶ����� ����һ�Σ�ֻ�������ñȽ����һλ 
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
		
		for(int j=0;j<a.length;j++){
			for(int k=0;k<a.length;k++){
				// if(a[j]<a[k]){	//��С��������
				if(a[j]>a[k]){		//�Ӵ�С����
					int temp = a[k];
					a[k]=a[j];
					a[j]=temp;
					
					//int temp = a[k];	//a[j]��a[k]ֵ������������3�书��һ��
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
