package com.how2j.collection;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		//Set中的元素，不能重复
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		//第二次插入同样的数据，是插不进去的，容器中只会保留一个
		names.add("gareen");
		System.out.println(names);
		
		 System.out.println("+++++++++++++++++++++++++++++++");
		//Set中的元素，没有顺序。 
		//严格的说，是没有按照元素的插入顺序排列
		//同样是插入0-9到HashSet中， 在JVM的不同版本中，看到的顺序都是不一样的。
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(90);
		numbers.add(50);
		numbers.add(10);
		System.out.println(numbers);
		System.out.println("+++++++++++++++++++++++++++++++");
		//Set不提供get()来获取指定位置的元素 
		//所以遍历需要用到迭代器，或者增强型for循环
		
		HashSet<Integer> num = new HashSet<Integer>();
		for(int i=20;i>0;i--){
			num.add(i);
		}
        //Set不提供get方法来获取指定位置的元素
        //numbers.get(0)
         
        //遍历Set可以采用迭代器iterator
        for (Iterator<Integer> iterator = num.iterator(); iterator.hasNext();) {
            Integer i = (Integer) iterator.next();
            System.out.println(i);
        }
        
        System.out.println("+++++++++++++++++++++++++++++++");
        
        //或者采用增强型for循环
        for (Integer i : num) {
            System.out.println(i);
        }	
        
        
        
        //生成50个 0-9999之间的随机数，要求不能有重复的
        HashSet<Integer> number = new HashSet<Integer>();
        int n=0;
        
        /*
        //这个更精简
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
