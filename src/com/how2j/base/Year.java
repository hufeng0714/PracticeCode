package com.how2j.base;

import java.util.Scanner;

public class Year {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������꣺");
		int year = sc.nextInt();
		System.out.println(year);
		
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println(year + "��������");
		}else
		{
			System.out.println(year + "��bu������");
		}
	}

}
