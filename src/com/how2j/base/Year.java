package com.how2j.base;

import java.util.Scanner;

public class Year {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = sc.nextInt();
		System.out.println(year);
		
		if(year%400==0||(year%4==0&&year%100!=0))
		{
			System.out.println(year + "年是闰年");
		}else
		{
			System.out.println(year + "年bu是闰年");
		}
	}

}
