package com.how2j.base;

public class HeroObject {

	public static void main(String[] args) {
		//h4所指向的对象和h2所指向的对象，是否是同一个对象？		
		HeroObject h1 = new HeroObject();
		HeroObject h2 = new HeroObject();
		HeroObject h3;
		HeroObject h4;
		h3=h1;
		h4=h3;
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
	}

}
