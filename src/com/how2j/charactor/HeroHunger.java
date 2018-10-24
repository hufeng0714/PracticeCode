package com.how2j.charactor;

public class HeroHunger {

	private String name;
	float hp;
	float armor;
	int moveSpeed;
	
	private HeroHunger(){
		
	}
	
	private static HeroHunger instance = new HeroHunger();
	
	public static HeroHunger getInstance(){
		return instance;
	}
}
