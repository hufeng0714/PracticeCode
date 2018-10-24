package com.how2j.thread;

public class TestThread05 {

	public static void main(String[] args) {
		//��ǰ�߳���ͣ
		/*
		 Thread.sleep(1000); ��ʾ��ǰ�߳���ͣ1000���� �������̲߳���Ӱ�� 
		 Thread.sleep(1000); ���׳�InterruptedException �ж��쳣��
		   ��Ϊ��ǰ�߳�sleep��ʱ���п��ܱ�ֹͣ����ʱ�ͻ��׳� InterruptedException
		 */
		
		Thread t1 = new Thread(){
			public void run(){
				int seconds = 0;
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.printf("�Ѿ�����LOL %d ��%n", seconds++);
				}
			}
		};	
		t1.start();
	}

}
