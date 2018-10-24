package com.how2j.abstract1;

public abstract class Hero {

	/**
	  	在类中声明一个方法，这个方法没有实现体，是一个“空”方法 
	 	这样的方法就叫抽象方法，使用修饰符“abstract" 
		当一个类有抽象方法的时候，该类必须被声明为抽象类
	 */
	/**
	 	为Hero增加一个抽象方法 attack，并且把Hero声明为abstract的。
		APHero,ADHero,ADAPHero是Hero的子类，继承了Hero的属性和方法。
		但是各自的攻击手段是不一样的，所以继承Hero类后，这些子类就必须提供不一样的attack方法实现。
	 */
	
	/**
	 	Hero类可以在不提供抽象方法的前提下，声明为抽象类 
		一旦一个类被声明为抽象类，就不能够被直接实例化
		
		虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
	 */
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
	public abstract void attack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
