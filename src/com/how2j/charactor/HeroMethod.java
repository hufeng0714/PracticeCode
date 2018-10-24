package com.how2j.charactor;

public class HeroMethod {

	/**
	类方法： 又叫做静态方法
	对象方法： 又叫实例方法，非静态方法

	访问一个对象方法，必须建立在有一个对象的前提的基础上
	访问类方法，不需要对象的存在，直接就访问
	 */
    public String name;
    protected float hp;
 
    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
        System.out.println("die");
        
        //++++++相反对象方法中是可以调用类方法的。
        
        this.battleWin();
    }
     
    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
        //+++类方法不能调用对象方法，因为没有实例化对象；
        //this.die();	//报错
    }
     
    public static void main(String[] args) {
    	HeroMethod garen =  new HeroMethod();
           garen.name = "盖伦";
           //必须有一个对象才能调用
           garen.die();
            
           HeroMethod teemo =  new HeroMethod();
           teemo.name = "提莫";
            
           //无需对象，直接通过类调用
           HeroMethod.battleWin();
         
    }

}
