package com.how2j.abstract1;

public class Weapon extends Item{

	@Override
	public boolean disposable() {
		System.out.println("����������ʧ");
		return false;
	}

}
