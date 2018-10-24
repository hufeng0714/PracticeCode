package com.how2j.interface2;

public interface Pet {
	/**
	 根据UML类创建pet（宠物）接口
	1. 提供getName() 返回该宠物的名字
	2. 提供setName(String name) 为该宠物命名
	3. 提供 play()方法
	 */
	public String getName();
	public void setName(String name);
	public void play();
}
