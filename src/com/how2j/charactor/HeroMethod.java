package com.how2j.charactor;

public class HeroMethod {

	/**
	�෽���� �ֽ�����̬����
	���󷽷��� �ֽ�ʵ���������Ǿ�̬����

	����һ�����󷽷������뽨������һ�������ǰ��Ļ�����
	�����෽��������Ҫ����Ĵ��ڣ�ֱ�Ӿͷ���
	 */
    public String name;
    protected float hp;
 
    //ʵ������,���󷽷����Ǿ�̬����
    //�����ж�����ܹ�����
    public void die(){
        hp = 0;
        System.out.println("die");
        
        //++++++�෴���󷽷����ǿ��Ե����෽���ġ�
        
        this.battleWin();
    }
     
    //�෽������̬����
    //ͨ����Ϳ���ֱ�ӵ���
    public static void battleWin(){
        System.out.println("battle win");
        //+++�෽�����ܵ��ö��󷽷�����Ϊû��ʵ��������
        //this.die();	//����
    }
     
    public static void main(String[] args) {
    	HeroMethod garen =  new HeroMethod();
           garen.name = "����";
           //������һ��������ܵ���
           garen.die();
            
           HeroMethod teemo =  new HeroMethod();
           teemo.name = "��Ī";
            
           //�������ֱ��ͨ�������
           HeroMethod.battleWin();
         
    }

}
