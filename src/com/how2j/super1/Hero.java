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
		System.out.println("Hero���޲ι��췽����");
	}
	
	public Hero(String name){
		System.out.println("Hero��һ�������Ĺ��췽��");
		this.name = name;
	}
	
	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	
	public static void main(String[] args) {
		new Hero();
	}
}
