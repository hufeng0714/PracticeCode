package com.how2j.thread;

		//�߳����ȼ�
		/*
			 ���̴߳��ھ�����ϵ��ʱ�����ȼ��ߵ��̻߳��и���ļ��ʻ��CPU��Դ 
			Ϊ����ʾ��Ч����Ҫ����ͣʱ��ȥ���������̸߳��Իᾡ��ȥռ��CPU��Դ 
			ͬʱ��Ӣ�۵�Ѫ������100�����������͵�1�������㹻��ʱ��۲쵽���ȼ�����ʾ 
			��ͼ�ɼ����߳�1�����ȼ���MAX_PRIORITY����������ȡ���˸����CPU��Դִ�д���
		 */
public class TestThread07 {

	public static void main(String[] args) {

		final Hero2 gareen = new Hero2();
        gareen.name = "����";
        gareen.hp = 6160;
        gareen.damage = 1;
  
        final Hero2 teemo = new Hero2();
        teemo.name = "��Ī";
        teemo.hp = 3000;
        teemo.damage = 1;
          
        final Hero2 bh = new Hero2();
        bh.name = "�ͽ�����";
        bh.hp = 5000;
        bh.damage = 1;
          
        final Hero2 leesin = new Hero2();
        leesin.name = "äɮ";
        leesin.hp = 4505;
        leesin.damage = 1;
        
        Thread t1 = new Thread(){
        	public void run(){
        		while(!teemo.isDead()){
        			gareen.attackHero(teemo);
        		}
        	}
        };
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead()){
        			bh.attackHero(leesin);
        		}
        	}
        };
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
	}
}
