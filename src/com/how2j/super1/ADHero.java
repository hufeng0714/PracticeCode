package com.how2j.super1;

import com.how2j.charactor.AD;
import com.how2j.property.ItemPolymorphism;
import com.how2j.property.LifePotion;

public class ADHero extends Hero implements AD{

	int moveSpeed = 400;
	
	@Override
	public void physicAttack() {
		
		System.out.println("进行物理打击");
	}
	
	public ADHero(){
		System.out.println("ADHero的无参构造方法");
	}
	
	public ADHero(String name){
		super(name);
		System.out.println("ADHero的有参构造方法");
	}	

	public int getMoveSpeed(){
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2(){
		return super.moveSpeed;
	}
	
	public void useItem(ItemPolymorphism i){
		System.out.println("ADHero use item!!!");
		super.useItem(i);
	}

	public static void main(String[] args) {
		new ADHero("德莱文");
		ADHero ad = new ADHero();
		System.out.println(ad.getMoveSpeed());
		System.out.println(ad.getMoveSpeed2());
		
		LifePotion lp = new LifePotion();
	}

}
