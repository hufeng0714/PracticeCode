package com.how2j.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectiosExam {

    /*
 	���ȳ�ʼ��һ��List,������10��ֵ��0-9��
	Ȼ�󲻶ϵ�shuffle��ֱ��ǰ3λ����
	3 1 4
	
	//���ָ���
	
	if(numbers.get(1).equals(3)&&numbers.get(2).equals(1)&&numbers.get(3).equals(4)) {
                n++;
            }
	
     */
	
	public static void main(String[] args) {
        
		List<Integer> numbers = new ArrayList<>();
		for(int i=0;i<10;i++){
			numbers.add(i);
		}

        String a,b,c,d,e;
        int n = 0;
	        while(true){
	        Collections.shuffle(numbers);
	         a = String.valueOf(numbers.get(0));
	         b = String.valueOf(numbers.get(1));
	         c = String.valueOf(numbers.get(2));
	         d = a+b+c;
	         e = "314";
	         n++;
	        if(d.equals(e)){
	        	break;
	        }
        }
	        System.out.println(numbers);
	        System.out.println(n);

	     Collections.sort(numbers);
	     
	     int m =0;
		//shuffle 1000,000 �Σ�ͳ�Ƴ��ֵĸ���
		for(int i=0;i<1000000;i++){
	        Collections.shuffle(numbers);
	         a = String.valueOf(numbers.get(0));
	         b = String.valueOf(numbers.get(1));
	         c = String.valueOf(numbers.get(2));
	         d = a+b+c;
	         e = "314";
		        if(d.equals(e)){
		        	m++;
		     }
		}
		double per = m/1000000.0;
		System.out.println(per);
	}

}
