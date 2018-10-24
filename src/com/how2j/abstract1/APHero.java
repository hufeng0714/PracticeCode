package com.how2j.abstract1;

public class APHero extends Hero implements AP{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void attack() {
		magicAttack();
		
	}

	@Override
	public void magicAttack() {
		System.out.println("½øÐÐÄ§·¨¹¥»÷");
		
	}

}
