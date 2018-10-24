package com.how2j.base;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1-12的整数：");
		int month = sc.nextInt();
		while(month<=0||month>12){
			System.out.println("输入的值不正确，请重输");
			month = sc.nextInt();
		}
		
		int dMonth = month/4;
		System.out.println(dMonth);
		
		switch(dMonth){
		case 0:
			System.out.println("Spring");
			break;
		case 1:
			System.out.println("Summer");
			break;
		case 2:
			System.out.println("Autumn");
			break;
		case 3:
			System.out.println("Winter");
			break;
		default:
			System.out.println("Wrong");
		}
		
	}
}
