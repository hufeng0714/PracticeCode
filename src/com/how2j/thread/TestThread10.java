package com.how2j.thread;

public class TestThread10 {

	/*
		 Ӣ���п��Է�һ�����ܽ���: ����ȭ-a du gen�� 
		ÿ��һ���ӣ����Է�һ�Σ�����ֻ��������3�Ρ� 
		
		����3��֮����Ҫ����5���ӣ��������ټ�����
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					for(int i=1;i<4;i++){
						System.out.printf("����ȭ��%d��\n",i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("��ʼΪʱ5��ĳ���");
					for(int j=5;j>0;j--){
						try {
							System.out.printf("����ʱ��%d��\n",j);
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
//					try {
//						Thread.sleep(5000);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
				}
			}
		};
		t1.start();
	}

}
