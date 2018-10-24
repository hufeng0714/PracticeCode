package com.how2j.jdbc;

public class Hero {
	//注意这些修饰符，至少为protect，如果为private，则外部类，无法访问
	    //增加id属性
	    public int id;
	    public String name;
	    public float hp;
	    public int damage;
	    
	    public Hero(int id,String name,float hp,int damage) {
	        this.id=id;
	        this.name=name;
	        this.hp=hp;
	        this.damage=damage;
	    }
	     
	    public Hero() {}
}
