package com.how2j.InnerClass;

public abstract class Item {

	/**
	 创建一个Item的匿名类
	Item有抽象方法disposable(), 就像抽象类练习 中要求的那样。
	 */

	String name;
	float price;
	
	public abstract boolean disposable();
	
	public static void main(String[] args) {
		LifePotion lp = new LifePotion();
		Weapon wp = new Weapon();
		
		lp.disposable();
		wp.disposable();
	}
	
}
