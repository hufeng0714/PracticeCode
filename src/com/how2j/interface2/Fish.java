package com.how2j.interface2;

public class Fish extends Animal implements Pet{
	/**
 	1. ����Fish�࣬���̳�Animal��
	2. ��дAnimal��walk�����Ա����㲻������û���ȡ�
	3. ʵ��Pet�ӿ�
	4. �޲ι��췽��
	5. �ṩһ��private ��name����
	 */
	
	private String name;
	
	public Fish(){
		name = "С��";
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void play() {
		System.out.println("Fish play");
	}

	@Override
	public void eat() {
		System.out.println("Fish eat");
	}
	
	public void walk(){
		System.out.println("Fish swim!");
	}
	
}
