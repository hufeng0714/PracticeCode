package com.how2j.base;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���������(m)��");
		float height = sc.nextFloat();
		System.out.println("����������(kg)��");
		float weight = sc.nextFloat();
		
		float bmi = weight/(height*height);
		
		System.out.print("��ǰBMIֵ�ǣ�");
		System.out.println(bmi);
		
		if(bmi<18.5){
			System.out.println("����״̬�ǣ����ع��ᣡ");
		}else if(18.5<=bmi && bmi<24){
			System.out.println("����״̬�ǣ�������Χ��");
		}else if(24<=bmi && bmi<27){
			System.out.println("����״̬�ǣ����ع��أ�");
		}else if(27<=bmi && bmi<30){
			System.out.println("����״̬�ǣ���ȷ��֣�");
		}else if(30<=bmi && bmi<35){
			System.out.println("����״̬�ǣ��жȷ��֣�");
		}else {
			System.out.println("����״̬�ǣ��ضȷ��֣�");
		}
	}
}
