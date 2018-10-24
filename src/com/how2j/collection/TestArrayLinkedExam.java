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
		
		//ArrayList��ѯ�죬��ɾ��
		//LinkedList��ѯ������ɾ��
		
		List<Integer> ll;
		ll = new ArrayList<>();
		insertMiddle(ll,"ArrayList");
		System.out.println("++++++++++++++++++++++++++++++++");
		ll = new LinkedList<>();
		insertMiddle(ll,"LinkedList");
		System.out.println("++++++++++++++++++++++++++++++++");
		
		
	}
	
	//�Ƚ� ArrayList��LinkedList ����������100000�����ݣ�˭��˭����Ϊʲô��
	public static void insertLast(List<Integer> l,String type){
		int total = 1000*100;
		final int number = 5;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<total;i++){
			//����д��Ҳ����
			//l.add(i);
			l.add(l.size(),number);
		}

		long endTime = System.currentTimeMillis();
		System.out.printf("��%s ��������%d�����ݣ��ܹ���ʱ %d ���� %n", type, total, endTime - startTime);
	}
	
	//��List���м�λ�ã��������ݣ��Ƚ�ArrayList�죬����LinkedList�죬������Ϊʲô��
	public static void insertMiddle(List<Integer> l,String type){
		int total = 1000*100;
		final int number = 5;
		long startTime = System.currentTimeMillis();
		for(int i=0;i<total;i++){
			l.add(l.size()/2,number);	
		}

		long endTime = System.currentTimeMillis();
		System.out.printf("��%s�м�������ݺ�ʱ%d���룡%n",type,endTime - startTime);
	}

}
