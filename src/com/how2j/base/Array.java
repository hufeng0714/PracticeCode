package com.how2j.base;

public class Array {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int min = 100;
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*100);
			System.out.println(a[i]);
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
