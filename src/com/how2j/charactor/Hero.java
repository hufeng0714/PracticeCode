package com.how2j.charactor;

//Weapon类在其他包里，使用必须进行import
import com.how2j.property.Weapon;

public class Hero {
	
	public String name;
	public float hp;
	float armor;
	int moveSpeed;
	
    //装备一把武器
    public void equip(Weapon w){
         
    }

	public Hero(){
		System.out.println("父类默认的构造方法");
	}
	
	public Hero(String heroName){
		
		this.name = heroName;
		/*
		this.setName(heroName);
		System.out.println("Hero的有一个参数的构造方法");
		System.out.println("-----------------");
		 */
	}
	
	public Hero(String name,float hp){
		this.setName(name);
		this.hp = hp;
		System.out.println("被调用的构造方法");
	}
	
	public Hero(float armor,int moveSpeed){
		this("潮汐",1000);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("调用构造方法");
	}
	
	public Hero(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
		//不加this也行，一般加上this，这样少敲代码也不容易出错
		this.setName(heroName);
		this.hp = heroHP;
		this.armor = heroArmor;
		this.moveSpeed = heroMoveSpeed;
		
		System.out.println("**************");
	}
	
	   //复活
    public void revive(Hero h){
        h = new Hero("提莫",383);
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
