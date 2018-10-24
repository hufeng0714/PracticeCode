package com.how2j.super1;

public class HeroTest {

	String name;
	float hp;
	/**
	父类Hero提供了一个有参的构造方法:
 
	public Hero(String name){
  	this.name = name;
	}
	但是没有提供无参的构造方法
	子类应该怎么处理？
	 */
	
	public HeroTest(String name){
		System.out.println("有参的构造函数");
		this.name = name;
	}
	
	public static void main(String[] args) {
		//报错
		//new HeroTest();
		
		new HeroTest("剑圣");

	}

}
