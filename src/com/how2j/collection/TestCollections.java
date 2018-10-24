package com.how2j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	/**
	 * Collections��һ���࣬�����Ĺ�����,����ͬArrays������Ĺ�����
	 */
public class TestCollections {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=0;i<10;i++){
			numbers.add(i);
		}
		
        System.out.println("�����е�����:");
        System.out.println(numbers);
        //��ת
        //reverse ʹList�е����ݷ�����ת
        
        Collections.reverse(numbers);
        
        System.out.println("��ת�󼯺��е�����:");
        System.out.println(numbers);
        
        //����
        //shuffle ����List�����ݵ�˳��
        
        Collections.shuffle(numbers);
        System.out.println("�����󼯺��е�����:");
        System.out.println(numbers);
        
        //����
        //sort ��List�е����ݽ�������
        Collections.sort(numbers);
        System.out.println("����󼯺��е�����:");
        System.out.println(numbers);
        
        //����
        //swap �����������ݵ�λ��
        Collections.swap(numbers, 0, 5);
        System.out.println("�����󼯺��е�����:");
        System.out.println(numbers);
        
        Collections.sort(numbers);
        System.out.println("����󼯺��е�����:");
        System.out.println(numbers);
        
        //����
        //rotate ��List�е����ݣ����ҹ���ָ����λ�ĳ���       
        Collections.rotate(numbers, 2);
        System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
        System.out.println(numbers);

        
	}
}
