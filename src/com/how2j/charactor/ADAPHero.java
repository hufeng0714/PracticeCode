package com.how2j.charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void magicAttack() {
		System.out.println("接口方法重写");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("接口方法重写");
		
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public void die() {
		System.out.println("ADAPHero die");
	}

}
