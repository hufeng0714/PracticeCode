package com.how2j.property;

public class ItemPolymorphism {

	String name;
	int price;
	/**
	 Ҫʵ����Ķ�̬����Ҫ��������
	1. ���ࣨ�ӿڣ�����ָ���������
	2. ���õķ�������д
	 */
	
	public void buy(){
		System.out.println("����");
	}
	
	public void effect(){
		System.out.println("��Ч��");
	}
	
	public static void main(String[] args) {
		
		/**
		 1. i1��i2����Item����
		 2. ������effect����
		 3. �����ͬ�Ľ��
		 */
		ItemPolymorphism i1 = new LifePotion();
		ItemPolymorphism i2 = new MagicPotion();
		
		System.out.println("i1  ��Item���ͣ�ִ��effect��ӡ:");
		i1.effect();
		
		System.out.println("i2  ��Item���ͣ�ִ��effect��ӡ:");
		i2.effect();

	}

}
