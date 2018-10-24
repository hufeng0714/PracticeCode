package com.how2j.InnerClass;

public abstract class HeroPatch {
 
    public abstract void attack();
      
	public static void main(String[] args) {
 
        //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
        final int damage = 5;
         
        HeroPatch h = new HeroPatch(){
            public void attack() {
                System.out.printf("新的进攻手段，造成%d点伤害",damage );
            }
        };
        
        h.attack();
 
    }
      
}