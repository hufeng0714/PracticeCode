package com.how2j.thread;

public class TestThread04 {

	/**
	ʹ�������࣬�̳�Thread,��дrun������ֱ����run������дҵ�����
	�������һ���ô��ǿ��Ժܷ���ķ����ⲿ�ľֲ�������
	ǰ�����ⲿ�ľֲ�������Ҫ������Ϊfinal��(JDK7�Ժ�Ͳ���Ҫ��)
	 */
	
	public static void main(String[] args) {

        final Hero gareen = new Hero();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 50;
 
        final Hero teemo = new Hero();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 30;
         
        final Hero bh = new Hero();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 65;
         
        final Hero leesin = new Hero();
        leesin.name = "äɮ";
        leesin.hp = 455;
        leesin.damage = 80;
      //������ 		
        Thread t1 = new Thread(){
        	public void run(){
        		//���������õ��ⲿ�ľֲ�����teemo�������teemo����Ϊfinal
                //������JDK7�Ժ󣬾Ͳ��Ǳ����final����
        		while(!teemo.isDead()){
        			gareen.attackHero(teemo);
        		}
        	}
        };
        
        t1.start();
        
        Thread t2 = new Thread(){
        	public void run(){
        		while(!leesin.isDead()){
        			bh.attackHero(leesin);
        		}
        	}        	
        };
        t2.start();
	}

}
