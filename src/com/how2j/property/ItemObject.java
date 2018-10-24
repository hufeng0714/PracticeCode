package com.how2j.property;

public class ItemObject {

	/**
	 ��дItem�� toString(), finalize()��equals()����
	toString() ����Item��name + price
	finalize() �����ǰ�������ڱ�����
	equals(Object o) �����ж�o�Ƿ���Item���ͣ�Ȼ��Ƚ�����Item��price�Ƿ���ͬ
	 */
	String name;
	int price;
	
	public void buy(){
		System.out.println("����");
	}
	
	public void effect(){
		System.out.println("��Ʒʹ�ú󣬿�����Ч��");
	}
	
	public String toString(){
		return (name + price);
	}
	
	public void finalize(){
		System.out.println(this.name + "��ǰ�������ڱ�����");
	}
	
	public boolean equals(Object o){
		if(o instanceof ItemObject){
			ItemObject io = (ItemObject) o;
			return this.price == price;
		}
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		ItemObject io1 = new ItemObject();
		io1.price = 300;
		io1.name = "��";
		ItemObject io2 = new ItemObject();
		io2.price = 400;
		io2.name = "��ì";
		
		ItemObject io3 = new ItemObject();
		io3.price = 300;
		io3.name = "����";
		
		System.out.println(io1.equals(io2));
		System.out.println(io1.equals(io3));
		
		System.out.println(io1);
		
		io1.finalize();
		io2.finalize();
		io3.finalize();

	}

}
