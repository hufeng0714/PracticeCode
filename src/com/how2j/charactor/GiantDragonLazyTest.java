package com.how2j.charactor;

public class GiantDragonLazyTest {

	public static void main(String[] args) {
		//ͨ��newʵ�����ᱨ��
		//GiantDragonLazy gdl = new GiantDragonLazyTest();
		
		//ֻ��ͨ��getInstance�õ�����
		GiantDragonLazy gdl1 = GiantDragonLazy.getInstance();
		GiantDragonLazy gdl2 = GiantDragonLazy.getInstance();
		GiantDragonLazy gdl3 = GiantDragonLazy.getInstance();
		
		//����ͬһ������
		System.out.println(gdl1==gdl2);
		System.out.println(gdl1==gdl3);
	}

}
