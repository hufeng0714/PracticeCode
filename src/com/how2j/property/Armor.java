package com.how2j.property;

public class Armor extends Item{
	
	int ac;
	
	public static void main(String[] args) {
		
		Armor cloth_ar = new Armor();
		cloth_ar.name = "²¼¼×";
		cloth_ar.price = 300;
		cloth_ar.ac = 15;
		System.out.println(cloth_ar.name + " "+cloth_ar.price+" "+cloth_ar.ac);
		
		Armor chain_ar = new Armor();
		chain_ar.name = "Ëø¼×";
		chain_ar.price = 500;
		chain_ar.ac = 40;
		System.out.println(chain_ar.name + " "+chain_ar.price+" "+chain_ar.ac);
	}
}
