package com.how2j.charactor;

public class ADHero extends Hero implements AD,Mortal{

	//实例化一个ADHero(), 其构造方法会被调用 
	//其父类的构造方法也会被调用 
	//并且是父类构造方法先调用 
	//子类构造方法会默认调用父类的 无参的构造方法
	//所以ADHero ad = new ADHero();//调用的是父类的无参构造方法
	public void ADHero(){
		System.out.println("子类的构造方法");
	}
	
	public void physicAttack(){
		System.out.println("重写接口方法");
	}
	
	/**
	 * 方法的重载指的是方法名一样，但是参数类型不一样
	 */

	public void attack(){
		System.out.println(getName() + " 进行了一次攻击 ，但是不确定打中谁了");
	}
	public void attack(Hero h1){
		System.out.println(getName() + "对" + h1.getName() + "进行了一次攻击 ");
	}
	public void attack(Hero h1,Hero h2){
		System.out.println(getName() + "同时对" + h1.getName() + "和" + h2.getName() + "进行了攻击 ");
	}
	/**
	 如果要攻击更多的英雄，就需要设计更多的方法，这样类会显得很累赘，像这样：
	public void attack(Hero h1)
	public void attack(Hero h1,Hero h2)
	public void attack(Hero h1,Hero h2,Hero 3)
	
	这时，可以采用可变数量的参数
	只需要设计一个方法
	public void attack(Hero ...heros)
	即可代表上述所有的方法了
	在方法里，使用操作数组的方式处理参数heros即可
	 */
	
	// 可变数量的参数
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(getName() + " 攻击了 " + heros[i].getName());
 
        }
    }
    
    //隐藏
    //与重写类似，方法的重写是子类覆盖父类的对象方法
    //隐藏，就是子类覆盖父类的类方法
    
    public static void battleWin(){
    	System.out.println("AD Hero battle Win");
    }
    
    
	public static void main(String[] args) {
		
        ADHero bh = new ADHero();
        bh.setName("赏金猎人");
 
        Hero h1 = new Hero();
        h1.setName("盖伦");
        Hero h2 = new Hero();
        h2.setName("提莫");
        Hero h3 = new Hero();
        h3.setName("潮汐");
        
        bh.attack();
        bh.attack(h1);
        bh.attack(h1, h2);
        bh.attack(h1,h2,h3);
        
        //隐藏
        //子类不会继承类方法的，因为继承说的很明白是子类继承父类的实例方法和实例对象，
        //所以如果子类不隐藏父类类方法，子类对象调用时就是调用父类类方法，如果隐藏，就是调用子类类方法，
        //而父类对象不管隐不隐藏都是调用父类类方法
        Hero.battleWin();
        ADHero.battleWin();
        h1.battleWin();
        bh.battleWin();

	}

	@Override
	public void die() {

		System.out.println("ADHero die");
		
	}

}
