package com.how2j.super1;

public class ADHeroTest extends HeroTest{

	/**
	 当创建一个子类对象时，会自动先调用父类的构造方法。

	如果父类无构造方法，系统会默认一个无参的构造方法。
	如果父类有两个构造方法，一个有参 一个无参 ，系统会默认调用无参的构造方法 。此时如果你想调用有参的构造方法必须使用super关键字
	如果父类只有一个有参构造方法时，在子类中创建对象时，必须用super调用有参的父类构造方法。否则报错
	原因：有了有参构造方法系统不会再默认给出无参构造方法，而不用super关键字调用有参构造方法时，是默认调用父类无参构造方法的。
	而此时父类没有无参构造方法，系统也不会自动补一个。
	 */
	public ADHeroTest(String name) {
		super(name);
	}
	
	
	public static void main(String[] args) {
		//报错
		//new ADHeroTest();
		new ADHeroTest("潮汐");
	}

}
