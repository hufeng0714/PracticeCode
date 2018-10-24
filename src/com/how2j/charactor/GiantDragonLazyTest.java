package com.how2j.charactor;

public class GiantDragonLazyTest {

	public static void main(String[] args) {
		//通过new实例化会报错
		//GiantDragonLazy gdl = new GiantDragonLazyTest();
		
		//只能通过getInstance得到对象
		GiantDragonLazy gdl1 = GiantDragonLazy.getInstance();
		GiantDragonLazy gdl2 = GiantDragonLazy.getInstance();
		GiantDragonLazy gdl3 = GiantDragonLazy.getInstance();
		
		//都是同一个对象
		System.out.println(gdl1==gdl2);
		System.out.println(gdl1==gdl3);
	}

}
