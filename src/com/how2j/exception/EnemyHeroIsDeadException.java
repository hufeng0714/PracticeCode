package com.how2j.exception;

		
		/*
		 �����Զ����쳣
		 */
public class EnemyHeroIsDeadException extends Exception{

	/*
		 һ��Ӣ�۹�����һ��Ӣ�۵�ʱ�����������һ��Ӣ���Ѿ����ˣ��ͻ��׳�EnemyHeroIsDeadException
		����һ����EnemyHeroIsDeadException�����̳�Exception
		�ṩ�������췽��
		1. �޲εĹ��췽��
		2. ���εĹ��췽���������ø���Ķ�Ӧ�Ĺ��췽��
	 */
	
	public EnemyHeroIsDeadException(){
		
	}
	
	public EnemyHeroIsDeadException(String msg){
		super(msg);
	}

}
