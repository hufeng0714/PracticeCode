package com.how2j.InnerClass;

import com.how2j.abstract1.ADHero;

public abstract class HeroNickClass {

	/**
	 ������ָ����������һ�����ͬʱʵ��������ʹ������Ӽ�ྫ��
	ͨ������£�Ҫʹ��һ���ӿڻ��߳����࣬�����봴��һ������

	�е�ʱ��Ϊ�˿���ʹ�ã�ֱ��ʵ����һ�������࣬����������ʵ������󷽷���
	��Ȼʵ���˳��󷽷�����ô����һ���µ��ֻ࣬������࣬û��������
	�������࣬����������
	 */
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public abstract void attack();
	
	
	public static void main(String[] args) {

		 ADHero adh=new ADHero();
		//ͨ����ӡadh�����Կ���adh�����������ADHero��
		 adh.attack();
		 System.out.println(adh);
		//����ʵ��attack����
		 HeroNickClass h = new HeroNickClass(){
			 public void attack(){
				 System.out.println("�µĹ�������");
			 }
		 }; 
		//ͨ����ӡh�����Կ���h�����������Hero$1��ôһ��ϵͳ�Զ����������
		 h.attack();
		 System.out.println(h);
	}

}
