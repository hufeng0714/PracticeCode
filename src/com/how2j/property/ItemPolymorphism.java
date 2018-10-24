package com.how2j.property;

public class ItemPolymorphism {

	String name;
	int price;
	/**
	 要实现类的多态，需要如下条件
	1. 父类（接口）引用指向子类对象
	2. 调用的方法有重写
	 */
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("有效果");
	}
	
	public static void main(String[] args) {
		
		/**
		 1. i1和i2都是Item类型
		 2. 都调用effect方法
		 3. 输出不同的结果
		 */
		ItemPolymorphism i1 = new LifePotion();
		ItemPolymorphism i2 = new MagicPotion();
		
		System.out.println("i1  是Item类型，执行effect打印:");
		i1.effect();
		
		System.out.println("i2  是Item类型，执行effect打印:");
		i2.effect();

	}

}
