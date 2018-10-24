package com.how2j.charactor;

public class HeroStructureMethod {

	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	/**
	 通过一个类创建一个对象，这个过程叫做实例化 
	实例化是通过调用构造方法(又叫做构造器)实现的
	 */
	
	/**
	 方法名和类名一样（包括大小写）
	没有返回类型
	实例化一个对象的时候，必然调用构造方法
	如果不写，就会默认提供一个
	 */
	public HeroStructureMethod(){
		System.out.println("默认的构造方法");
	}
	
	/**
	 一旦提供了一个有参的构造方法 
	同时又没有显式的提供一个无参的构造方法 
	那么默认的无参的构造方法，就“木有了“
	 */
	
	public HeroStructureMethod(String heroName){
		name = heroName;
		System.out.println("-----------------");
	}
	
	public HeroStructureMethod(String name,float hp){
		this.name=name;
		this.hp = hp;
		System.out.println("被调用的构造方法");
	}
	
	public HeroStructureMethod(float armor,int moveSpeed){
		this("潮汐",1000);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("调用构造方法");
	}
	
	public HeroStructureMethod(String heroName,float heroHP,float heroArmor,int heroMoveSpeed){
		//不加this也行，一般加上this，这样少敲代码也不容易出错
		this.name = heroName;
		this.hp = heroHP;
		this.armor = heroArmor;
		this.moveSpeed = heroMoveSpeed;
		
		System.out.println("**************");
	}
	
	//复活
    public void revive(HeroStructureMethod h){
        h = new HeroStructureMethod("提莫",383);//引用h指向了新的对象 "新的提莫"
    }

	public static void main(String[] args) {
		
		HeroStructureMethod hsm1 = new HeroStructureMethod();
		HeroStructureMethod hsm2 = new HeroStructureMethod("盖伦");
		HeroStructureMethod hsm3 = new HeroStructureMethod("卡尔",360,144,50);
		
		HeroStructureMethod teemo =  new HeroStructureMethod("提莫",383);
        
        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;
         
        teemo.revive(teemo);// 调用revive的时候,teemo指向的是main方法中的"提莫"对象
         
        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp); // 而原来的对象，没有做任何修改，血量依然是负数
        /**所以旧的对象跟新的对象没有半毛钱关系！**/
	}

}
