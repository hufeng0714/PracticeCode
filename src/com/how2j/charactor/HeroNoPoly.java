package com.how2j.charactor;

import com.how2j.property.LifePotion;
import com.how2j.property.MagicPotion;

public class HeroNoPoly {
	
	public String name;
	protected float hp;
	/**
	 如果不使用多态，
	假设英雄要使用血瓶和魔瓶，就需要为Hero设计两个方法
	useLifePotion
	useMagicPotion


	除了血瓶和魔瓶还有很多种物品，那么就需要设计很多很多个方法，比如
	usePurityPotion 净化药水
	useGuard 守卫
	useInvisiblePotion 使用隐形药水等等等等
	 */
	
	public void useLifePotion(LifePotion lp){
		lp.effect();
	}
	
	public void useMagicPotion(MagicPotion mp){
		mp.effect();
	}
	
	public static void main(String[] args) {

		HeroNoPoly garn = new HeroNoPoly();
		garn.name = "盖伦";
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		garn.useLifePotion(lp);
		garn.useMagicPotion(mp);
	}

}
