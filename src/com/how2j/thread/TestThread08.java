package com.how2j.thread;

public class TestThread08 {

	  
    public static void main(String[] args) {
          
        final Hero2 gareen = new Hero2();
        gareen.name = "����";
        gareen.hp = 616;
        gareen.damage = 1;
  
        final Hero2 teemo = new Hero2();
        teemo.name = "��Ī";
        teemo.hp = 300;
        teemo.damage = 1;
          
        final Hero2 bh = new Hero2();
        bh.name = "�ͽ�����";
        bh.hp = 500;
        bh.damage = 1;
          
        final Hero2 leesin = new Hero2();
        leesin.name = "äɮ";
        leesin.hp = 450;
        leesin.damage = 1;
          
        Thread t1= new Thread(){
            public void run(){
 
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);
                }              
            }
        };
          
        Thread t2= new Thread(){
            public void run(){
                while(!leesin.isDead()){
                    //��ʱ��ͣ��ʹ��t1����ռ��CPU��Դ
                    Thread.yield();
                     
                    bh.attackHero(leesin);
                }              
            }
        };
         
        t1.setPriority(5);
        t2.setPriority(5);
        t1.start();
        t2.start();
          
    }
      
}
