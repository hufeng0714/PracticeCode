package com.how2j.collection;

import java.util.LinkedList;

import com.how2j.charactor.Hero;


public class MyStack implements Stack{

	/**
	 与FIFO(先入先出的)队列类似的一种数据结构是FILO先入后出栈Stack
	根据接口Stack ：
	实现类：MyStack
	public class MyStack implements Stack	
	并向这个栈中，压入5个英雄，接着弹出5个英雄
	再解释一下栈: 栈的结构，就像给弹夹添加子弹一样，先添加的子弹，就放在了最下面，打手枪的时候，只能从最上面取子弹。
	 */
	
	LinkedList<Hero> ll = new LinkedList<Hero>();
	
	public static void main(String[] args) {
		
		MyStack ms = new MyStack();
		
		for(int i=0;i<10;i++){
			Hero h = new Hero("hero "+i);
			ms.push(h);
		}
		//System.out.println(ms);
		System.out.println("---------------------");
		Hero h = ms.peek();
		System.out.println(h.getName());//查看最后一个Hero对象
		
		System.out.println("---------------------");
		ms.pull();//取出最后一个英雄对象
		Hero h1 = ms.peek();
		System.out.println(h1.getName());//查看最后一个Hero对象
		System.out.println("---------------------");
		
	}

	@Override
	public void push(Hero h) {
		ll.addLast(h);
	}

	@Override
	public Hero pull() {
		return ll.remove();
	}

	@Override
	public Hero peek() {
		return ll.getLast();
	}
}
