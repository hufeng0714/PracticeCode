package com.how2j.base;

public class ArrayTwo {

	/**
����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����
	 */
	/**
	 �г��ȣ�array.length 
	�г��ȣ�array[i].length 
	 */
	public static void main(String[] args) {
		
		int [][]a = new int[5][5];
		
		int max = 0;
		int maxRow = 0;
		int maxColumn = 0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j] = (int)(Math.random()*100);
				System.out.println(a[i][j]);
			}
		}
		
		for(int m=0;m<a.length;m++){
			for(int n=0;n<a[m].length;n++){	
				if(a[m][n]>max){
					max=a[m][n];
					maxRow = m;
					maxColumn=n;
				}
			}
		}
		System.out.println("Row = "+maxRow+"  Column = "+maxColumn+"  Result = "+max);
		
	}

}
