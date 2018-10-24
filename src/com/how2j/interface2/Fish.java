package com.how2j.interface2;

public class Fish extends Animal implements Pet{
	/**
 	1. 创建Fish类，它继承Animal类
	2. 重写Animal的walk方法以表明鱼不能走且没有腿。
	3. 实现Pet接口
	4. 无参构造方法
	5. 提供一个private 的name属性
	 */
	
	private String name;
	
	public Fish(){
		name = "小鱼";
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Fish play");
	}

	@Override
	public void eat() {
		System.out.println("Fish eat");
	}
	
	public void walk(){
		System.out.println("Fish swim!");
	}
	
}
