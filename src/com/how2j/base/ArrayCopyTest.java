package com.how2j.base;

public class ArrayCopyTest {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] b = new int[8];
		
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		System.out.println("+++++++++");
		
		for(int j=0;j<b.length;j++){
			b[j] = (int)(Math.random()*100);
			System.out.println(b[j]);
		}
		
		System.out.println("+++++++++");
		
		int [] c = new int[13];
		
		System.arraycopy(a, 0, c, 0, 5);
		
		for(int k=0;k<c.length;k++){
			System.out.println(c[k]);
		}
		
		System.out.println("+++++++++");
		System.arraycopy(b, 0, c, 5, 8);
		
		for(int k=0;k<c.length;k++){
			System.out.println(c[k]);
		}

	}

}
