package com.how2j.InnerClass;

public abstract class Item {

	/**
	 ����һ��Item��������
	Item�г��󷽷�disposable(), �����������ϰ ��Ҫ���������
	 */

	String name;
	float price;
	
	public abstract boolean disposable();
	
	public static void main(String[] args) {
		LifePotion lp = new LifePotion();
		Weapon wp = new Weapon();
		
		lp.disposable();
		wp.disposable();
	}
	
}
