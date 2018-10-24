package com.how2j.charactor;

import com.how2j.property.ItemPolymorphism;
import com.how2j.property.LifePotion;
import com.how2j.property.MagicPotion;

public class HeroUsePoly {

	public String name;
	protected float hp;
	/**
	 如果物品的种类特别多，那么就需要设计很多的方法
	比如useArmor,useWeapon等等

	这个时候采用多态来解决这个问题
	设计一个方法叫做useItem，其参数类型是Item
	如果是使用血瓶，调用该方法
	如果是使用魔瓶，还是调用该方法
	无论英雄要使用什么样的物品，只需要一个方法即可
	 */
	
	public void useItem(ItemPolymorphism i){
		i.effect();
	}
	
	public void kill(Mortal m){
		m.die();
	}
	
	public static void main(String[] args) {
		
		HeroUsePoly garn = new HeroUsePoly();
		garn.name = "盖伦";
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		garn.useItem(lp);
		garn.useItem(mp);
		
		ADHero ad = new ADHero();
		APHero ap = new APHero();
		ADAPHero adap = new ADAPHero();
		
		garn.kill(ad);
		garn.kill(ap);
		garn.kill(adap);
	}

}
