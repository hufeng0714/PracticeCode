package com.how2j.thread;

import java.io.Serializable;

public class Hero2 {

    public String name;
    public float hp;
     
    public int damage;
     
    public void attackHero(Hero2 h) {
    	//把暂停时间去掉，多条线程各自会尽力去占有CPU资源
//        try {
//            //为了表示攻击需要时间，每次攻击暂停1000毫秒
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
         
        if(h.isDead())
            System.out.println(h.name +"死了！");
    }
 
    public boolean isDead() {
        return 0>=hp?true:false;
    }
}
