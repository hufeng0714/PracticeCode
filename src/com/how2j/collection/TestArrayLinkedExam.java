package com.how2j.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinkedExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> l;
		l = new ArrayList<>();
		insertLast(l,"ArrayList");
		System.out.println("++++++++++++++++++++++++++++++++");
		l = new LinkedList<>();
		insertLast(l,"LinkedList");
		System.out.println("++++++++++++++++++++++++++++++++");
		
		//ArrayList查询快，增删慢
		//LinkedList查询慢，增删快
		
		List<Integer> ll;
		ll = new ArrayList<>();
		insertMiddle(ll,"ArrayList");
		System.out.println("++++++++++++++++++++++++++++++++");
		ll = new LinkedList<>();
		insertMiddle(ll,"LinkedList");
		System.out.println("++++++++++++++++++++++++++++++++");
		
		
	}
	
	//比较 ArrayList和LinkedList 在最后面插入100000条数据，谁快谁慢？为什么？
	public static void insertLast(List<Integer> l,String type){
		int total = 1000*100;
		final int number = 5;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<total;i++){
			//这种写法也可以
			//l.add(i);
			l.add(l.size(),number);
		}

		long endTime = System.currentTimeMillis();
		System.out.printf("在%s 最后面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, endTime - startTime);
	}
	
	//在List的中间位置，插入数据，比较ArrayList快，还是LinkedList快，并解释为什么？
	public static void insertMiddle(List<Integer> l,String type){
		int total = 1000*100;
		final int number = 5;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<total;i++){
			l.add(l.size()/2,number);	
		}

		long endTime = System.currentTimeMillis();
		System.out.printf("在%s中间插入数据耗时%d毫秒！%n",type,endTime - startTime);
	}

}
