package com.how2j.charactor;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void magicAttack() {
		System.out.println("�ӿڷ�����д");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("�ӿڷ�����д");
		
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public void die() {
		System.out.println("ADAPHero die");
	}

}
