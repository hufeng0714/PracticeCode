package com.how2j.base;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int number = sc.nextInt();
		int fact = 1;
		
		while(number>1){
			fact = fact * number;
			number --;
		}
		System.out.println(fact);
	}
}
