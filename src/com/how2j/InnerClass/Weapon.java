package com.how2j.InnerClass;

public class Weapon extends Item{
	
	String name = "��";
	
	@Override
	public boolean disposable() {
		System.out.println("ʹ��������,��Ȼ����.0.0.");
		return false;
	}

}
