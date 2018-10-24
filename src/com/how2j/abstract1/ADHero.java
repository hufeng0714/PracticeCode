package com.how2j.abstract1;

public class ADHero extends Hero implements AD{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack() {
		physicAttack();
		
	}

	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
		
	}

}
