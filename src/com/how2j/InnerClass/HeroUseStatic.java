package com.how2j.InnerClass;

public class HeroUseStatic {

	/**
	在一个类里面声明一个静态内部类
	比如敌方水晶，当敌方水晶没有血的时候，己方所有英雄都取得胜利，而不只是某一个具体的英雄取得胜利。
	与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
	语法：new 外部类.静态内部类();
	因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
	除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
	 */
	
	public String name;
	float hp;
	float armor;
	int moveSpeed;
	
	private static void battleWin(){
		System.out.println("battle win!");
	}
	
	//敌方的水晶
	static class EnemyCrystal{
		int hp = 5000;
		//如果水晶的血量为0，则宣布胜利
		public void checkIfVictory(){
			if(hp==0){
				HeroUseStatic.battleWin();
				
				//静态内部类不能直接访问外部类的对象属性
				//System.out.println(name + "win this game!");
			}
			else{
				System.out.println("not win");
			}
		}
	}
	
	
	public static void main(String[] args) {
		 //实例化静态内部类
		HeroUseStatic.EnemyCrystal crystal = new HeroUseStatic.EnemyCrystal();
		crystal.checkIfVictory();
	}

}
