package com.how2j.thread;

public class TestThread06 {

	/**
		首先解释一下主线程的概念
		所有进程，至少会有一个线程即主线程，即main方法开始执行，就会有一个看不见的主线程存在。
		在42行执行t.join，即表明在主线程中加入该线程。
		主线程会等待该线程结束完毕， 才会往下运行。
	 */
	public static void main(String[] args) {
		//加入到当前线程中
		final Hero gareen = new Hero();
		gareen.name = "盖伦";
		gareen.hp = 616;
		gareen.damage = 50;
		
        final Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 300;
        teemo.damage = 30;
          
        final Hero bh = new Hero();
        bh.name = "赏金猎人";
        bh.hp = 500;
        bh.damage = 65;
          
        final Hero leesin = new Hero();
        leesin.name = "盲僧";
        leesin.hp = 455;
        leesin.damage = 80;
        
        Thread t1 = new Thread(){
        	public void run(){
        		while(!teemo.isDead()){
        			gareen.attackHero(teemo);
        		}
        	}
        };
        t1.start();
      //代码执行到这里，一直是main线程在运行
        try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead()){
        			bh.attackHero(leesin);
        		}
        	}
        };
      //会观察到盖伦把提莫杀掉后，才运行t2线程
        t2.start();
	}
}
