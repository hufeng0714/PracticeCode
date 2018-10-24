package com.how2j.InnerClass;

public class LifePotion extends Item{
	
	String name = "药剂";
	
	@Override
	public boolean disposable() {
		System.out.println("使用了药剂,消耗品没了.0.0.");
		return true;
	}

}
