package com.how2j.charactor;

public class HeroInit {
	/*
	*//**
	 对象属性初始化有3种
	1. 声明该属性的时候初始化 
	2. 构造方法中初始化
	3. 初始化块
	*//*
	public String name = "some hero"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;
     
    {
        maxHP = 200; //初始化块
    }  
     
    public HeroInit(){
        hp = 100; //构造方法中初始化
         
    }
	
    *//**
	类属性初始化有2种
	1. 声明该属性的时候初始化
	2. 静态初始化块
	 *//*
    //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化
     
    static{
        itemCapacity = 6;//静态初始化块 初始化
    }
  */
	
	/**
	 故意把初始化块，放在构造方法下面，问题：这三种方式，谁先执行？谁后执行？
	 */
    public String name = "some hero"; 
    
    public HeroInit(){
        name = "one hero";
    }
    {
        name = "the hero";
    }
	
	public static void main(String[] args) {
		
		HeroInit hi = new HeroInit();
		System.out.println(hi.name);

	}

}

/** 说明顺序是：声明--初始化块--构造方法 **/