package com.how2j.charactor1;

public class DogTest2 {

	/**
	 *ת��ʱת�����ͱ����Ǹ��������ָ����ʵ�������,���������ǿ������ת����
	 */
	public static void main(String[] args) {
		
		Animal animal = new Dog();
		Dog dog = (Dog)animal;//����ת�ͣ�ǿ��ת��Ϊ������
		dog.Play();
		dog.eat();
		
		animal.Play();
		//Cat cat=(Cat)animal;//���г���

	}

}
