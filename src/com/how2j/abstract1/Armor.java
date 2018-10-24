package com.how2j.abstract1;

public class Armor extends Item{

	@Override
	public boolean disposable() {
		System.out.println("装甲不会消失");
		return false;
	}

}
