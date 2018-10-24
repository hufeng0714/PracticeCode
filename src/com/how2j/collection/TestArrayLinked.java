package com.how2j.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	/**
	 	ArrayList 插入，删除数据慢
		LinkedList， 插入，删除数据快
		ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
		LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢
	 */
	public static void main(String[] args) {
		
		List<Integer> l;
		l = new ArrayList<>();
		insertFirst(l,"ArrayList");
		System.out.println("++++++++++++++++++++++++++++++++");
		l = new LinkedList<>();
		insertFirst(l,"LinkedList");
		System.out.println("++++++++++++++++++++++++++++++++");
		
		List<Integer> ll;
		ll = new ArrayList<>();
		modify(ll,"ArrayList");
		System.out.println("++++++++++++++++++++++++++++++++");
		
		ll = new LinkedList<>();
		modify(ll,"LinkedList");
		System.out.println("++++++++++++++++++++++++++++++++");

	}
	
	public static void insertFirst(List<Integer> l,String type){
		int total = 1000*100;
		final int number = 5;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<total;i++){
			l.add(0,number);
		}

		long endTime = System.currentTimeMillis();
		System.out.printf("在%s 最前面插入%d条数据，总共耗时 %d 毫秒 %n", type, total, endTime - startTime);
	}
	
	public static void modify(List<Integer> l,String type){
		int total = 1000*100;
		int index = total/2;
		final int number = 5;
		
        //初始化
        for (int i = 0; i < total; i++) {
            l.add(number);
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            int n = l.get(index);
            n++;
            l.set(index, n);
       }
        
        long endTime = System.currentTimeMillis();
        System.out.printf("%s总长度是%d，定位到第%d个数据，取出来，加1，再放回去%n 重复%d遍，" +
        		"总共耗时 %d 毫秒 %n", type,total, index,total, endTime - startTime);
        System.out.println();
	}

}
