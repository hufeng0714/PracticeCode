package com.how2j.charactor;

//Weapon�����������ʹ�ñ������import
import com.how2j.property.Weapon;

public class Hero {
	
	public String name;
	public float hp;
	float armor;
	int moveSpeed;
	
    //װ��һ������
    public void equip(Weapon w){
         
    }

	public Hero(){
		System.out.println("����Ĭ�ϵĹ��췽��");
	}
	
	public Hero(String heroName){
		
		this.name = heroName;
		/*
		this.setName(heroName);
		System.out.println("Hero����һ�������Ĺ��췽��");
		System.out.println("-----------------");
		 */
	}
	
	public Hero(String name,float hp){
		this.setName(name);
		this.hp = hp;
		System.out.println("�����õĹ��췽��");
	}
	
	public Hero(float armor,int moveSpeed){
		this("��ϫ",1000);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("���ù��췽��");
	}
	
	public Hero(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
		//����thisҲ�У�һ�����this���������ô���Ҳ�����׳���
		this.setName(heroName);
		this.hp = heroHP;
		this.armor = heroArmor;
		this.moveSpeed = heroMoveSpeed;
		
		System.out.println("**************");
	}
	
	   //����
    public void revive(Hero h){
        h = new Hero("��Ī",383);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public float getHp(){
		return hp;
	}
	
	public void setHp(float hp){
		this.hp = hp;
	}
	
	public static void battleWin(){
		System.out.println("hero battle win");
	}
	
	public String toString(){
		return name;
	}
	
/*	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name="garen";
		garen.hp=650;
		garen.armor=790;
		garen.moveSpeed=65;
		
		System.out.println(garen.name);
		System.out.println(garen.hp);
		System.out.println(garen.armor);
		System.out.println(garen.moveSpeed);
		
	}*/

}
