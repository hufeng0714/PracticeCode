package com.how2j.InnerClass;

public class HeroUseStatic {

	/**
	��һ������������һ����̬�ڲ���
	����з�ˮ�������з�ˮ��û��Ѫ��ʱ�򣬼�������Ӣ�۶�ȡ��ʤ��������ֻ��ĳһ�������Ӣ��ȡ��ʤ����
	��Ǿ�̬�ڲ��಻ͬ����̬�ڲ���ˮ�����ʵ���� ����Ҫһ���ⲿ���ʵ��Ϊ����������ֱ��ʵ����
	�﷨��new �ⲿ��.��̬�ڲ���();
	��Ϊû��һ���ⲿ���ʵ���������ھ�̬�ڲ������治���Է����ⲿ���ʵ�����Ժͷ���
	���˿��Է����ⲿ���˽�о�̬��Ա�⣬��̬�ڲ������ͨ��ûʲô�������
	 */
	
	public String name;
	float hp;
	float armor;
	int moveSpeed;
	
	private static void battleWin(){
		System.out.println("battle win!");
	}
	
	//�з���ˮ��
	static class EnemyCrystal{
		int hp = 5000;
		//���ˮ����Ѫ��Ϊ0��������ʤ��
		public void checkIfVictory(){
			if(hp==0){
				HeroUseStatic.battleWin();
				
				//��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
				//System.out.println(name + "win this game!");
			}
			else{
				System.out.println("not win");
			}
		}
	}
	
	
	public static void main(String[] args) {
		 //ʵ������̬�ڲ���
		HeroUseStatic.EnemyCrystal crystal = new HeroUseStatic.EnemyCrystal();
		crystal.checkIfVictory();
	}

}
