package com.how2j.InnerClass;

public abstract class HeroLocalClass {

	/**
	 本地类可以理解为有名字的匿名类 
	与内部类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。 
	本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
	 */
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public abstract void attack();
	
	public static void main(String[] args) {
		 //与匿名类的区别在于，本地类有了自定义的类名
		class SomeHero extends HeroLocalClass{
			@Override
			public void attack() {
				System.out.println("新的攻击方法");
			}
		}
		
		SomeHero sh = new SomeHero();
		sh.name = "潮汐";
		sh.attack();
		
	}

}
