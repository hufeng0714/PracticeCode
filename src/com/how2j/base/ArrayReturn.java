package com.how2j.base;

public class ArrayReturn {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		for(int i=0;i<a.length;i++){
			
			a[i] = (int)(Math.random()*100);
			System.out.println(a[i]);
		}
		
		System.out.println("=====================");		
		
		int[] b = new int[5];
		
		for(int j=0;j<a.length;j++){
			b[j]=a[a.length-1-j];
			System.out.println(b[j]);
		}
		
		System.out.println("++++++++++++++++++++");	
		
		for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                int m = 0;
                m = a[j+1];
                a[j+1] = a[j];
                a[j] = m;
            }
        }
        System.out.println("转换后数组为：");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

	}

}
