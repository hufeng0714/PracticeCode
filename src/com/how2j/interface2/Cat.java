package com.how2j.interface2;

public class Cat extends Animal implements Pet{
	
	/**
	 	1. ����������String���������������֡�
		2. ����һ������������ʹ��String����ָ��è�����֣��ù�����������ó��๹������ָ�����е�è���������ȡ�
		3. ����һ���޲εĹ��������ù���������ǰһ������������this�ؼ��֣�������һ�����ַ�����Ϊ����
		4. ʵ��Pet�ӿڷ�����
		5. ʵ��eat������
	 */
	String name;
	
	protected Cat(int legs){
		super(4);
	}
	
	protected Cat(String name){
		super(4);
		this.name = name;
	}

	public Cat(){
		super();
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eat");
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
		System.out.println("Cat play");
	}

}
