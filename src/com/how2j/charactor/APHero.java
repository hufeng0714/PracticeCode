package com.how2j.charactor;

public class APHero extends Hero implements AP,Mortal {

	@Override
	public void magicAttack() {
		System.out.println("�ӿڷ�����д");
	}

	public static void main(String[] args) {
		

	}

	@Override
	public void die() {
		
		System.out.println("APHero die");
		
	}



}
