package com.how2j.base;

public class Break {

	public static void main(String[] args) {
		
		/*
复利公式：
F = p* ( (1+r)^n );
F 最终收入
p 本金
r 年利率
n 存了多少年

假设情景一：
p = 10000
r = 0.05
n = 1

解读：
本金是10000
年利率是5%
存了一年 1次
复利收入 10000*( (1+0.05)^1 ) = 10500

假设情景二：
p = 10000
r = 0.05
n = 2

解读：
本金是10000
年利率是5%
存了两年
复利收入 10000*( (1+0.05)^2 ) = 11025
			
			
			以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
（复利计算按照每年12000投入计算，不按照每月计息）
			
		 * */
				
		int n=1;
		double F=0;
		double i=0;
		for(;;n++){
			
			i=i+Math.pow(1.2, n);
			F=12000*i;
			
			if(F>1000000)
				break;
		}
		System.out.println(n);
	}
}
