package com.how2j.charactor;

import com.how2j.property.LifePotion;
import com.how2j.property.MagicPotion;

public class HeroNoPoly {
	
	public String name;
	protected float hp;
	/**
	 �����ʹ�ö�̬��
	����Ӣ��Ҫʹ��Ѫƿ��ħƿ������ҪΪHero�����������
	useLifePotion
	useMagicPotion


	����Ѫƿ��ħƿ���кܶ�����Ʒ����ô����Ҫ��ƺܶ�ܶ������������
	usePurityPotion ����ҩˮ
	useGuard ����
	useInvisiblePotion ʹ������ҩˮ�ȵȵȵ�
	 */
	
	public void useLifePotion(LifePotion lp){
		lp.effect();
	}
	
	public void useMagicPotion(MagicPotion mp){
		mp.effect();
	}
	
	public static void main(String[] args) {

		HeroNoPoly garn = new HeroNoPoly();
		garn.name = "����";
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		garn.useLifePotion(lp);
		garn.useMagicPotion(mp);
	}

}
