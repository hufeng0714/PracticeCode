package com.how2j.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		//Set�е�Ԫ�أ������ظ�
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		//�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
		names.add("gareen");
		System.out.println(names);
		
		 System.out.println("+++++++++++++++++++++++++++++++");
		//Set�е�Ԫ�أ�û��˳�� 
		//�ϸ��˵����û�а���Ԫ�صĲ���˳������
		//ͬ���ǲ���0-9��HashSet�У� ��JVM�Ĳ�ͬ�汾�У�������˳���ǲ�һ���ġ�
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(90);
		numbers.add(50);
		numbers.add(10);
		System.out.println(numbers);
		System.out.println("+++++++++++++++++++++++++++++++");
		//Set���ṩget()����ȡָ��λ�õ�Ԫ�� 
		//���Ա�����Ҫ�õ���������������ǿ��forѭ��
		
		HashSet<Integer> num = new HashSet<Integer>();
		for(int i=20;i>0;i--){
			num.add(i);
		}
        //Set���ṩget��������ȡָ��λ�õ�Ԫ��
        //numbers.get(0)
         
        //����Set���Բ��õ�����iterator
        for (Iterator<Integer> iterator = num.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }
        
        System.out.println("+++++++++++++++++++++++++++++++");
        
        //���߲�����ǿ��forѭ��
        for (Integer i : num) {
            System.out.println(i);
        }	
        
        
        
        //����50�� 0-9999֮����������Ҫ�������ظ���
        HashSet<Integer> number = new HashSet<Integer>();
        int n=0;
        
        /*
        //���������
        while(hs.size()<50) {
            hs.add((int)(Math.random()*10000));
        }
         */
        
        while(true){
        	if(number.size()<50){
        	number.add(rand());
        	}else{
        		break;
        	}
        }
        for(Integer i : number){
        	System.out.print(i + " ");
        	if(n%10==9){
        		System.out.println();
        	}
        	n++;
        } 
	}
	
	public static int rand(){
		return (int)(Math.random()*9000+1000);
	}

}
