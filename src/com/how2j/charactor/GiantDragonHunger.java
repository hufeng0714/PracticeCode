package com.how2j.charactor;

public class GiantDragonHunger {

	/**
	 * ����ģʽ ������
	 */
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private GiantDragonHunger(){
		
	}
	
	//׼��һ�������ԣ�ָ��һ��ʵ�������� ��Ϊ�������ԣ�����ֻ��һ��
	private  static GiantDragonHunger instance = new GiantDragonHunger();
	
	//public static �������ṩ�������߻�ȡ15�ж���Ķ���
	
	public static GiantDragonHunger getInstance(){
		return instance;
	}
}
