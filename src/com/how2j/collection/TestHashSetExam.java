package com.how2j.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class TestHashSetExam {

	 public static void main(String[] args){
	        HashSet<String>hs=new HashSet<>();
	        String[] str=new String[100];
	        int n=0;
	        List<String> l = new ArrayList<String>();
	        System.out.println("所有的字符串为:");
	        for(int i=0;i<100;i++){
	            str[i]="";
	            while(str[i].length()<2){                                    
	            	//生成一个字符串，限定生成的必须是一个英文字母
	                char ch=(char)(Math.random()*123);
	                if(Character.isLetter(ch)){
	                    str[i]+=ch;
	                }
	            }
	            System.out.print(str[i]+" ");
	            if(i%10==9){
	                System.out.println();
	            }              
	            boolean flag = true;
	            flag = hs.add(str[i]);
	            if(!flag){
	            	l.add(str[i]);
	            }
	            /*
	            n=(hs.add(str[i]))?n:++n;              
	            //判断add方法返回值，返回false说明已经有这个元素了让计数器加一
	             */
	        }
	        System.out.println("HashSet中出现了:"+(100-hs.size())+"个重复元素");            
	        //另一种方式，如果加入100个元素但是size只有97说明有3个重复，以此类推。
	        System.out.println(l);
	    }
}
