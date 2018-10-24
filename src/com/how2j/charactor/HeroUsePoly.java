package com.how2j.charactor;

import com.how2j.property.ItemPolymorphism;
import com.how2j.property.LifePotion;
import com.how2j.property.MagicPotion;

public class HeroUsePoly {

	public String name;
	protected float hp;
	/**
	 �����Ʒ�������ر�࣬��ô����Ҫ��ƺܶ�ķ���
	����useArmor,useWeapon�ȵ�

	���ʱ����ö�̬������������
	���һ����������useItem�������������Item
	�����ʹ��Ѫƿ�����ø÷���
	�����ʹ��ħƿ�����ǵ��ø÷���
	����Ӣ��Ҫʹ��ʲô������Ʒ��ֻ��Ҫһ����������
	 */
	
	public void useItem(ItemPolymorphism i){
		i.effect();
	}
	
	public void kill(Mortal m){
		m.die();
	}
	
	public static void main(String[] args) {
		
		HeroUsePoly garn = new HeroUsePoly();
		garn.name = "����";
		
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
