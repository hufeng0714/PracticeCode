package com.how2j.InnerClass;

public abstract class HeroLocalClass {

	/**
	 ������������Ϊ�����ֵ������� 
	���ڲ��಻һ�����ǣ��ڲ�����������ڳ�Ա��λ�ã��������Ժͷ���ƽ�ȵ�λ�á� 
	�������������һ����ֱ�������ڴ�������棬��������������forѭ����ȵȵط�
	 */
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public abstract void attack();
	
	public static void main(String[] args) {
		 //����������������ڣ������������Զ��������
		class SomeHero extends HeroLocalClass{
			@Override
			public void attack() {
				System.out.println("�µĹ�������");
			}
		}
		
		SomeHero sh = new SomeHero();
		sh.name = "��ϫ";
		sh.attack();
		
	}

}
