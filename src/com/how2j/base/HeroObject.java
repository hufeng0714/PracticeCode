package com.how2j.base;

public class HeroObject {

	public static void main(String[] args) {
		//h4��ָ��Ķ����h2��ָ��Ķ����Ƿ���ͬһ������		
		HeroObject h1 = new HeroObject();
		HeroObject h2 = new HeroObject();
		HeroObject h3;
		HeroObject h4;
		h3=h1;
		h4=h3;
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		System.out.println(h4);
	}

}
