package com.how2j.jdbc;

public class Hero {
	//ע����Щ���η�������Ϊprotect�����Ϊprivate�����ⲿ�࣬�޷�����
	    //����id����
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
