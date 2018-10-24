package com.how2j.property;

public class ItemLazy {
	String name;
	int price;
	
	private ItemLazy(){
		
	}
	
	private static ItemLazy instance = new ItemLazy();
	
	public static ItemLazy getInstance(){
		if(null==instance){
			instance = new ItemLazy();
		}
		return instance;
	}
}
