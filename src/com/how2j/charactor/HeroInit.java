package com.how2j.charactor;

public class HeroInit {
	/*
	*//**
	 �������Գ�ʼ����3��
	1. ���������Ե�ʱ���ʼ�� 
	2. ���췽���г�ʼ��
	3. ��ʼ����
	*//*
	public String name = "some hero"; //���������Ե�ʱ���ʼ��
    protected float hp;
    float maxHP;
     
    {
        maxHP = 200; //��ʼ����
    }  
     
    public HeroInit(){
        hp = 100; //���췽���г�ʼ��
         
    }
	
    *//**
	�����Գ�ʼ����2��
	1. ���������Ե�ʱ���ʼ��
	2. ��̬��ʼ����
	 *//*
    //��Ʒ��������
    public static int itemCapacity=8; //������ʱ�� ��ʼ��
     
    static{
        itemCapacity = 6;//��̬��ʼ���� ��ʼ��
    }
  */
	
	/**
	 ����ѳ�ʼ���飬���ڹ��췽�����棬���⣺�����ַ�ʽ��˭��ִ�У�˭��ִ�У�
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

/** ˵��˳���ǣ�����--��ʼ����--���췽�� **/