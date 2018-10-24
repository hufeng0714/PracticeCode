package com.how2j.charactor;

public class HeroHungerTest {

	public static void main(String[] args) {
		
		HeroHunger hh1 = HeroHunger.getInstance();
		HeroHunger hh2 = HeroHunger.getInstance();
		HeroHunger hh3 = HeroHunger.getInstance();
		
		System.out.println(hh1==hh2);
		System.out.println(hh1==hh3);

	}

}
