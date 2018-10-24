package com.how2j.charactor;

public class APHero extends Hero implements AP,Mortal {

	@Override
	public void magicAttack() {
		System.out.println("接口方法重写");
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void die() {
		
		System.out.println("APHero die");
		
	}



}
