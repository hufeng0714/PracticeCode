package com.how2j.InnerClass;


public class HeroUnStatic {
		/**
		 �Ǿ�̬�ڲ��� BattleScore ��ս���ɼ���
		�Ǿ�̬�ڲ������ֱ����һ�������涨��
		
		���磺
		ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
		����ʵ����BattleScore ��ʱ�򣬱��뽨����һ�����ڵ�Ӣ�۵Ļ�����
		�﷨: new �ⲿ��().new �ڲ���()
		��ΪHero�ķǾ�̬�ڲ��࣬�ǿ���ֱ�ӷ����ⲿ���privateʵ������name��
		 */
	
	private String name;
	float hp;
	float armor;
	int moveSpeed;
	
    // �Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ�������ڵ�ʱ�򣬲�������
    // ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
	class BattleScore{
		int kill;
		int die;
		int assit;
		
		public void legendary(){
			if(kill>8)
				System.out.println(name + "����");
			else
				System.out.println(name + "δ����");
		}
		
	}
	
	public static void main(String[] args) {
		HeroUnStatic garn = new HeroUnStatic();
		garn.name = "����";
        // ʵ�����ڲ���
        // BattleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ���������
        // ������ʵ�������뽨����һ���ⲿ�����Ļ���֮��
		BattleScore bs = garn.new BattleScore();
		bs.kill = 9;
		bs.legendary();
		
	}
}
