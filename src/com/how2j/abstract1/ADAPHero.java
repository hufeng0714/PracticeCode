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

		System.out.println("�ȿ��Խ������������ֿ��Խ���ħ������");
	}

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
		
	}

	@Override
	public void physicAttack() {
		System.out.println("����������");
		
	}

}
