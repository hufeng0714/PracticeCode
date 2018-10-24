package com.how2j.base;

public class Narcissistic {

	/**
水仙花数定义：
1. 一定是3位数
2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3

寻找所有的水仙花数
	 */
	public static void main(String[] args) {
		
		
		for(int a=1;a<10;a++){
			for(int b=0;b<10;b++){
				for(int c=0;c<10;c++){
					int yuanzhi=a*100+b*10+c;
					int bai = (int)Math.pow(a, 3);
					int shi = (int)Math.pow(b, 3);
					int ge = (int)Math.pow(c, 3);
				
				int sum = bai + shi +ge;
					if(yuanzhi==sum){
						System.out.println(sum);
					}
				}
			}
		}
		
		
//		for(int i=100;i<1000;i++){
//			
//			int a = i/100;
//			int b = (i/10)%10;
//			int c = (i%10)%10;
//			
//			int bai = (int)Math.pow(a, 3);
//			int shi = (int)Math.pow(b, 3);
//			int ge = (int)Math.pow(c, 3);
//			
//			int sum = bai + shi +ge;
//			
//			
//			
//			if(i==sum){
//				System.out.println(i);
//			}
//			}
			
		}

	}
