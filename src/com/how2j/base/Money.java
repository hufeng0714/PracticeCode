package com.how2j.base;

public class Money {
	
	public static void main(String[] args) {
		
		int money=0;
		for(int i=0;i<10;i++){
			 
			int j = (int)Math.pow(2, i);
			//System.out.println(j);
			money = money+j;
		}
		System.out.println(money);
	}
}
