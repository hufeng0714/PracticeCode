package com.how2j.charactor;

public class HeroProperty {
		/**
		 如果一个属性，每个英雄都不一样，比如name，这样的属性就应该设计为对象属性，
		 因为它是跟着对象走的，每个对象的name都是不同的

		如果一个属性，所有的英雄都共享，都是一样的，那么就应该设计为类属性。
		比如血量上限，所有的英雄的血量上限都是 9999，不会因为英雄不同，而取不同的值。 这样的属性，就适合设计为类属性
		 */
	    public String name; //实例属性，对象属性，非静态属性
	    protected float hp;
	    static String copyright;//类属性,静态属性
	     
	    public static void main(String[] args) {
	    	HeroProperty garen =  new HeroProperty();
	           garen.name = "盖伦";
	            
	           HeroProperty.copyright = "版权由Riot Games公司所有";
	            
	           System.out.println(garen.name);
	           System.out.println(garen.copyright);//对象.类属性
	           /**
	            * 通过garen.copyright修改其值
	            * garen.copyright = "Blizzard Entertainment Enterprise";
	            * 然后打印teemo.copyright，观察是否有变化
	            */
	           garen.copyright = "Blizzard Entertainment Enterprise";
	            
	           HeroProperty teemo =  new HeroProperty();
	           teemo.name = "提莫";
	           System.out.println(teemo.name);    
	           System.out.println(teemo.copyright);//类.类属性
	        
	     
	}
}
