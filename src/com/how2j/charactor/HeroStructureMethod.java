package com.how2j.charactor;

public class HeroStructureMethod {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	/**
	 ͨ��һ���ഴ��һ������������̽���ʵ���� 
	ʵ������ͨ�����ù��췽��(�ֽ���������)ʵ�ֵ�
	 */
	
	/**
	 ������������һ����������Сд��
	û�з�������
	ʵ����һ�������ʱ�򣬱�Ȼ���ù��췽��
	�����д���ͻ�Ĭ���ṩһ��
	 */
	public HeroStructureMethod(){
		System.out.println("Ĭ�ϵĹ��췽��");
	}
	
	/**
	 һ���ṩ��һ���вεĹ��췽�� 
	ͬʱ��û����ʽ���ṩһ���޲εĹ��췽�� 
	��ôĬ�ϵ��޲εĹ��췽�����͡�ľ���ˡ�
	 */
	
	public HeroStructureMethod(String heroName){
		name = heroName;
		System.out.println("-----------------");
	}
	
	public HeroStructureMethod(String name,float hp){
		this.name=name;
		this.hp = hp;
		System.out.println("�����õĹ��췽��");
	}
	
	public HeroStructureMethod(float armor,int moveSpeed){
		this("��ϫ",1000);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("���ù��췽��");
	}
	
	public HeroStructureMethod(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
		//����thisҲ�У�һ�����this���������ô���Ҳ�����׳���
		this.name = heroName;
		this.hp = heroHP;
		this.armor = heroArmor;
		this.moveSpeed = heroMoveSpeed;
		
		System.out.println("**************");
	}
	
	//����
    public void revive(HeroStructureMethod h){
        h = new HeroStructureMethod("��Ī",383);//����hָ�����µĶ��� "�µ���Ī"
    }

	public static void main(String[] args) {
		
		HeroStructureMethod hsm1 = new HeroStructureMethod();
		HeroStructureMethod hsm2 = new HeroStructureMethod("����");
		HeroStructureMethod hsm3 = new HeroStructureMethod("����",360,144,50);
		
		HeroStructureMethod teemo =  new HeroStructureMethod("��Ī",383);
        
        //�ܵ�400�˺�������
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);// ����revive��ʱ��,teemoָ�����main�����е�"��Ī"����
         
        //���⣺ System.out.println(teemo.hp); ������٣� ��ô��⣿
        System.out.println(teemo.hp); // ��ԭ���Ķ���û�����κ��޸ģ�Ѫ����Ȼ�Ǹ���
        /**���ԾɵĶ�����µĶ���û�а�ëǮ��ϵ��**/
	}

}
