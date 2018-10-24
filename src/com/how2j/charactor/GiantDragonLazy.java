package com.how2j.charactor;

public class GiantDragonLazy {

	//׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
	private GiantDragonLazy(){}

	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
	private static GiantDragonLazy instance = new GiantDragonLazy();
	
	//public static ����������ʵ������
	public static GiantDragonLazy getInstance(){
		//��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if(null==instance){
			instance = new GiantDragonLazy();
		}
		//���� instanceָ��Ķ���
		return instance;
	}

}
