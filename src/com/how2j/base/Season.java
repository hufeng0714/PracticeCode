package com.how2j.base;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������1-12��������");
		int month = sc.nextInt();
		while(month<=0||month>12){
			System.out.println("�����ֵ����ȷ��������");
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
