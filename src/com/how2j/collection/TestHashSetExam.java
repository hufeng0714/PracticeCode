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
	        System.out.println("���е��ַ���Ϊ:");
	        for(int i=0;i<100;i++){
	            str[i]="";
	            while(str[i].length()<2){                                    
	            	//����һ���ַ������޶����ɵı�����һ��Ӣ����ĸ
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
	            //�ж�add��������ֵ������false˵���Ѿ������Ԫ�����ü�������һ
	             */
	        }
	        System.out.println("HashSet�г�����:"+(100-hs.size())+"���ظ�Ԫ��");            
	        //��һ�ַ�ʽ���������100��Ԫ�ص���sizeֻ��97˵����3���ظ����Դ����ơ�
	        System.out.println(l);
	    }
}
