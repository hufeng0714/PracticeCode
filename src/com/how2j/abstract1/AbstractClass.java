package com.how2j.abstract1;

public class AbstractClass {

	public static void main(String[] args) {
		ADHero adh = new ADHero();
		APHero aph = new APHero();
		ADAPHero adaph = new ADAPHero();
		
		adh.attack();
		aph.attack();
		adaph.attack();
		
		System.out.println("========================");
		
		Armor ar = new Armor();
		LifePotion lp = new LifePotion();
		Weapon wp = new Weapon();
		
		ar.disposable();
		lp.disposable();
		wp.disposable();
	}
}
