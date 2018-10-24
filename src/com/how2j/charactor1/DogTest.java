package com.how2j.charactor1;

public class DogTest {
	/**
	 1、将一个父类的引用指向一个子类对象，称为向上转型，自动进行类型转换。
	 2、父类引用变量调用的是子类覆盖或继承父类的方法，不是父类的方法。
     3、父类引用变量无法调用子类特有的方法。
	 */
	public static void main(String[] args) {
		
		Animal animal = new Dog();//向上转型，父类引用指向子类对象
		animal.Play();//正常编译
		//animal.eat();//编译不通过，父类的引用无法调用子类特有的方法
	}

}
