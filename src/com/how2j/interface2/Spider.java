package com.how2j.interface2;

public class Spider extends Animal{
	
	/**
	 	1. Spider�̳�Animal�ࡣ
		2. ����Ĭ�Ϲ������������ø��๹������ָ������֩�붼��8���ȡ�
		3. ʵ��eat����
	 */
	  String name;
	    //����Ĭ�Ϲ������������ø��๹������ָ������֩�붼��8���ȡ�
	    public Spider() {
	        super(8);
	        name = "֩��";
	    }
	     
	    public void eat() {
	        System.out.println("֩�������....");
	    }
	    
	    public String getName(){
	    	return name;
	    }
	}
