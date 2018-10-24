package com.how2j.base;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入身高(m)：");
		float height = sc.nextFloat();
		System.out.println("请输入体重(kg)：");
		float weight = sc.nextFloat();
		
		float bmi = weight/(height*height);
		
		System.out.print("当前BMI值是：");
		System.out.println(bmi);
		
		if(bmi<18.5){
			System.out.println("身体状态是：体重过轻！");
		}else if(18.5<=bmi && bmi<24){
			System.out.println("身体状态是：正常范围！");
		}else if(24<=bmi && bmi<27){
			System.out.println("身体状态是：体重过重！");
		}else if(27<=bmi && bmi<30){
			System.out.println("身体状态是：轻度肥胖！");
		}else if(30<=bmi && bmi<35){
			System.out.println("身体状态是：中度肥胖！");
		}else {
			System.out.println("身体状态是：重度肥胖！");
		}
	}
}
