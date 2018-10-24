package com.how2j.abstract1;

public class ADAPHero extends Hero implements AD,AP{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack() {

		System.out.println("既可以进行物理攻击，又可以进行魔法攻击");
	}

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
		
	}

}
