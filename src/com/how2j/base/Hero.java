package com.how2j.base;

public class Hero {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name="garen";
		garen.hp=650;
		garen.armor=790;
		garen.moveSpeed=65;
		
		System.out.println(garen.name);
		System.out.println(garen.hp);
		System.out.println(garen.armor);
		System.out.println(garen.moveSpeed);
		
	}

}
