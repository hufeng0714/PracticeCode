package com.how2j.property;

public class ItemLazyTest {

	public static void main(String[] args) {
		
		ItemLazy il1 = ItemLazy.getInstance();
		ItemLazy il2 = ItemLazy.getInstance();
		ItemLazy il3 = ItemLazy.getInstance();
		
		System.out.println(il1==il2);
		System.out.println(il1==il3);

	}

}
