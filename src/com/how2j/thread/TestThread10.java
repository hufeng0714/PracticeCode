package com.how2j.thread;

public class TestThread10 {

	/*
		 英雄有可以放一个技能叫做: 波动拳-a du gen。 
		每隔一秒钟，可以发一次，但是只能连续发3次。 
		
		发完3次之后，需要充能5秒钟，充满，再继续发
	 */
	public static void main(String[] args) {
		
		Thread t1 = new Thread(){
			public void run(){
				while(true){
					for(int i=1;i<4;i++){
						System.out.printf("波动拳第%d发\n",i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("开始为时5秒的充能");
					for(int j=5;j>0;j--){
						try {
							System.out.printf("倒计时：%d秒\n",j);
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
