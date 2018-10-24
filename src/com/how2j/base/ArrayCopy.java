package com.how2j.base;

public class ArrayCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		System.out.println("++++++++++++++++++");
		
		int[] b = new int[5];
		
		for(int j=0;j<b.length;j++){
			b[j]=a[j];
			System.out.println(b[j]);
		}
		
		System.out.println("++++++++++++++++++");
		
		int[] c = new int[5];
		System.arraycopy(b, 0, c, 0, 5);
		for(int k=0;k<b.length;k++){
			System.out.println(c[k]);
		}

	}

}
