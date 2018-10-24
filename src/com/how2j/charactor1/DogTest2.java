package com.how2j.charactor1;

public class DogTest2 {

	/**
	 *转型时转的类型必须是父类对象所指的真实子类对象,不是任意的强制类型转换。
	 */
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Dog dog = (Dog)animal;//向下转型，强制转换为狗对象
		dog.Play();
		dog.eat();
		
		animal.Play();
		//Cat cat=(Cat)animal;//运行出错

	}

}
