package com.how2j.InnerClass;

public class Weapon extends Item{
	
	String name = "大刀";
	
	@Override
	public boolean disposable() {
		System.out.println("使用了武器,依然还在.0.0.");
		return false;
	}

}
