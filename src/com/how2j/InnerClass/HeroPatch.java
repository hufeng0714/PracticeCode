package com.how2j.InnerClass;

public abstract class HeroPatch {
 
    public abstract void attack();
      
	public static void main(String[] args) {
 
        //����������ʹ���ⲿ�ľֲ��������ⲿ�ľֲ�������������Ϊfinal
        final int damage = 5;
         
        HeroPatch h = new HeroPatch(){
            public void attack() {
                System.out.printf("�µĽ����ֶΣ����%d���˺�",damage );
            }
        };
        
        h.attack();
 
    }
      
}