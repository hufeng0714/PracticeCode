package com.how2j.charactor;

public class GiantDragonHungerTest {

	public static void main(String[] args) {
		//ͨ��newʵ�����ᱨ��
		//GiantDragonHunger gdh = new GiantDragonHunger();
		
		//ֻ��ͨ��getInstance�õ�����
		GiantDragonHunger gdh1 = GiantDragonHunger.getInstance();
		GiantDragonHunger gdh2 = GiantDragonHunger.getInstance();
		GiantDragonHunger gdh3 = GiantDragonHunger.getInstance();
		
		System.out.println(gdh1==gdh2);
		System.out.println(gdh1==gdh3);
	}

}
