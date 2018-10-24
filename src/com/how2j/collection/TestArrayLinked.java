package com.how2j.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	/**
	 	ArrayList ���룬ɾ��������
		LinkedList�� ���룬ɾ�����ݿ�
		ArrayList��˳��ṹ�����Զ�λ�ܿ죬ָ�����ġ� �����ӰԺλ��һ�������˵�ӰƱ��һ�¾��ҵ�λ���ˡ�
		LinkedList ������ṹ�����������һ�����飬Ҫ�ҳ���99�����飬�����һ��һ��������ȥ�����Զ�λ��
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
		System.out.printf("��%s ��ǰ�����%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, endTime - startTime);
	}
	
	public static void modify(List<Integer> l,String type){
		int total = 1000*100;
		int index = total/2;
		final int number = 5;
		
        //��ʼ��
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
        System.out.printf("%s�ܳ�����%d����λ����%d�����ݣ�ȡ��������1���ٷŻ�ȥ%n �ظ�%d�飬" +
        		"�ܹ���ʱ %d ���� %n", type,total, index,total, endTime - startTime);
        System.out.println();
	}

}
