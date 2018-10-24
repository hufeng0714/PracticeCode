package com.how2j.charactor;

public class GiantDragonHungerTest {

	public static void main(String[] args) {
		//通过new实例化会报错
		//GiantDragonHunger gdh = new GiantDragonHunger();
		
		//只能通过getInstance得到对象
		GiantDragonHunger gdh1 = GiantDragonHunger.getInstance();
		GiantDragonHunger gdh2 = GiantDragonHunger.getInstance();
		GiantDragonHunger gdh3 = GiantDragonHunger.getInstance();
		
		System.out.println(gdh1==gdh2);
		System.out.println(gdh1==gdh3);
	}

}
