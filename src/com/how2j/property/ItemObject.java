package com.how2j.property;

public class ItemObject {

	/**
	 重写Item的 toString(), finalize()和equals()方法
	toString() 返回Item的name + price
	finalize() 输出当前对象正在被回收
	equals(Object o) 首先判断o是否是Item类型，然后比较两个Item的price是否相同
	 */
	String name;
	int price;
	
	public void buy(){
		System.out.println("购买");
	}
	
	public void effect(){
		System.out.println("物品使用后，可以有效果");
	}
	
	public String toString(){
		return (name + price);
	}
	
	public void finalize(){
		System.out.println(this.name + "当前对象正在被回收");
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
		io1.name = "大刀";
		ItemObject io2 = new ItemObject();
		io2.price = 400;
		io2.name = "长矛";
		
		ItemObject io3 = new ItemObject();
		io3.price = 300;
		io3.name = "宝剑";
		
		System.out.println(io1.equals(io2));
		System.out.println(io1.equals(io3));
		
		System.out.println(io1);
		
		io1.finalize();
		io2.finalize();
		io3.finalize();

	}

}
