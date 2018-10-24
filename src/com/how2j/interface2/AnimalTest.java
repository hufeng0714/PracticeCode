package com.how2j.interface2;

public class AnimalTest {

	public static void main(String[] args) {
		
		Spider spider = new Spider();
		String spiderName = spider.name;
		System.out.println(spiderName);
		spider.eat();
		spider.walk();
		
		System.out.println("=========================");
		
		Cat cat = new Cat("Сè");
		String catName = cat.name;
		System.out.println(catName);
		cat.eat();
		cat.walk();
		cat.play();

		System.out.println("=========================");
		
		Fish fish = new Fish();
		String fishName = fish.getName();
		System.out.println(fishName);
		fish.eat();
		fish.walk();
		fish.play();
	}

}
