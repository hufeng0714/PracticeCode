package com.how2j.abstract1;

public abstract class Hero {

	/**
	  	����������һ���������������û��ʵ���壬��һ�����ա����� 
	 	�����ķ����ͽг��󷽷���ʹ�����η���abstract" 
		��һ�����г��󷽷���ʱ�򣬸�����뱻����Ϊ������
	 */
	/**
	 	ΪHero����һ�����󷽷� attack�����Ұ�Hero����Ϊabstract�ġ�
		APHero,ADHero,ADAPHero��Hero�����࣬�̳���Hero�����Ժͷ�����
		���Ǹ��ԵĹ����ֶ��ǲ�һ���ģ����Լ̳�Hero�����Щ����ͱ����ṩ��һ����attack����ʵ�֡�
	 */
	
	/**
	 	Hero������ڲ��ṩ���󷽷���ǰ���£�����Ϊ������ 
		һ��һ���౻����Ϊ�����࣬�Ͳ��ܹ���ֱ��ʵ����
		
		��Ȼû�г��󷽷�������һ��������Ϊ�˳����࣬�Ͳ��ܹ�ֱ�ӱ�ʵ����
	 */
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
    // ���󷽷�attack
    // Hero������ᱻҪ��ʵ��attack����
	public abstract void attack();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
