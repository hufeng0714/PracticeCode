package com.how2j.base;

public class NumberGame {

	/**
	 * a+b=8
	 * c-d=6
	 * a+c=14
	 * b+d=10
	 */
	public static void main(String[] args) {


		int a=1;
		int b=1;
		int c=1;
		int d=1;
		
		for(a=1;a<8;a++){
			for(b=1;b<8;b++){
				for(c=1;c<14;c++){
					for(d=1;d<10;d++){
						if(a+b==8&&c-d==6&&a+c==14&&b+d==10){
							System.out.println("a="+a+" "+"b="+b+" "+"c="+c+" "+"d="+d);
						}
					}
				}
			}
			
		}

	}

}
