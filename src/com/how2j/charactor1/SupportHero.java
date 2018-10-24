package com.how2j.charactor1;

import com.how2j.charactor.Hero;

public class SupportHero extends Hero{

	public SupportHero(){
		System.out.println("++++++++++++++++");
	}
	
	public void heal(){
		System.out.println("heal");
	}
	
	public void heal(Hero h){
		System.out.println("heal" + h.getName());
	}
	
	public void heal(Hero h,int hp){
		System.out.println("heal" +h.getName()+" "+hp);
	}
	
	// 可变数量的参数
    public void heal(int hp,Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(getName() + "治疗了 " + heros[i].getName()+hp+"点血");
 
        }
    }
	
	public static void main(String[] args) {
		
		SupportHero sh = new SupportHero();
		sh.setName("巫师");
		
		Hero h1 = new Hero();
		h1.setName("潮汐");
		Hero h2 = new Hero();
		h2.setName("卡尔");
		
		int hp = 100;
		
		sh.heal();
		sh.heal(h1);
		sh.heal(h2, hp);
		sh.heal(hp,h1,h2);
	}
		
}


