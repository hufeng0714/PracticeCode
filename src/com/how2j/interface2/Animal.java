package com.how2j.interface2;

public abstract class Animal {
	
	/**
	 	1. ����Animal�࣬�������ж���ĳ����ࡣ
		2. ����һ���ܱ�����������������legs������¼������ȵ���Ŀ��
		3. ����һ���ܱ����Ĺ�������������ʼ��legs���ԡ�
		4. �������󷽷�eat��
		5. �������巽��walk����ӡ������������ߵģ������ȵ���Ŀ��
	 */
	    String name;
	    protected int legs;
	     
	    public Animal() {
	    	System.out.println("AnimalĬ�Ϲ�����");
	    }
	     
	    protected Animal(int legs) {
	        this.legs = legs;
	    }
	    
	     
	    public abstract void eat();
	     
	    public void walk() {
	    	System.out.println("������");
	        System.out.println("����"+this.legs+"������·��~");
	    }
	    
	}
