package com.how2j.super1;

import com.how2j.property.ItemPolymorphism;

public class Hero {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public void useItem(ItemPolymorphism i){
		System.out.println("Hero use Item");
		i.effect();
	}
	
	public Hero(){
		System.out.println("Hero的无参构造方法！");
	}
	
	public Hero(String name){
		System.out.println("Hero有一个参数的构造方法");
		this.name = name;
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	
	public static void main(String[] args) {
		new Hero();
	}
}
