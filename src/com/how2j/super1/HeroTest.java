package com.how2j.super1;

public class HeroTest {

	String name;
	float hp;
	/**
	����Hero�ṩ��һ���вεĹ��췽��:
 
	public Hero(String name){
  	this.name = name;
	}
	����û���ṩ�޲εĹ��췽��
	����Ӧ����ô����
	 */
	
	public HeroTest(String name){
		System.out.println("�вεĹ��캯��");
		this.name = name;
	}
	
	public static void main(String[] args) {
		//����
		//new HeroTest();
		
		new HeroTest("��ʥ");

	}

}
