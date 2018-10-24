package com.how2j.collection;

import java.util.LinkedList;

import com.how2j.charactor.Hero;


public class MyStack implements Stack{

	/**
	 ��FIFO(�����ȳ���)�������Ƶ�һ�����ݽṹ��FILO������ջStack
	���ݽӿ�Stack ��
	ʵ���ࣺMyStack
	public class MyStack implements Stack	
	�������ջ�У�ѹ��5��Ӣ�ۣ����ŵ���5��Ӣ��
	�ٽ���һ��ջ: ջ�Ľṹ���������������ӵ�һ��������ӵ��ӵ����ͷ����������棬����ǹ��ʱ��ֻ�ܴ�������ȡ�ӵ���
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
		System.out.println(h.getName());//�鿴���һ��Hero����
		
		System.out.println("---------------------");
		ms.pull();//ȡ�����һ��Ӣ�۶���
		Hero h1 = ms.peek();
		System.out.println(h1.getName());//�鿴���һ��Hero����
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
