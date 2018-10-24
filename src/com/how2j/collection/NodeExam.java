package com.how2j.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.how2j.charactor.Hero;
import com.how2j.collection.Node;

public class NodeExam {

	/**
	根据上面的学习和理解，设计一个Hero二叉树，HeroNode. 
	可以向这个英雄二叉树插入不同的Hero对象，并且按照Hero的血量倒排序。
	随机生成10个Hero对象，每个Hero对象都有不同的血量值，插入这个HeroNode后，把排序结果打印出来。
	 */
	public static void main(String[] args) {
		
		int[] random = {67,7,5,30,73,10,0,78,12,81,10,74};
		Node node = new Node();
		for(int each : random){
			node.add(each);
		}
		System.out.println("----------------------------------------");
		node.preOrder(node);
		System.out.println("----------------------------------------");
		node.inOrder(node);
		System.out.println("----------------------------------------");
		node.postOrder(node);
		System.out.println("----------------------------------------");
		System.out.println(node.values());
		System.out.println("----------------------------------------");

		
		//生成十个随机血量的英雄
		HeroNode heroNode = new HeroNode();
		for(int i=0;i<10;i++){
			Hero h = new Hero("hero"+i);
			h.hp = (int)(Math.random()*1000);
			System.out.println(h);
			heroNode.add(h);
		}
		
		System.out.println(heroNode.value);
		System.out.println("----------------------------------------");
		System.out.println(heroNode.value + " " + heroNode.value.hp);
		System.out.println(heroNode.leftNode.value + " " + heroNode.leftNode.value.hp);
		System.out.println(heroNode.rightNode.value + " " + heroNode.rightNode.value.hp);
		System.out.println("----------------------------------------");
		
		System.out.println(heroNode.values());
		System.out.println(heroNode.values2());
		System.out.println("----------------------------------------");
		
		int [] data1 = new int[40000];
		int [] data2 = new int[40000];
		int [] data3 = new int[40000];
		
		Node roots = new Node();
		
		for(int i=0;i<40000;i++){
			int randomNum = (int)(Math.random()*40000);
			data1[i] = randomNum;
			data2[i] = randomNum;
			data3[i] = randomNum;
			roots.add(data3[i]);
		}
		
		long startTime = System.currentTimeMillis();
		roots.values();
		long endTime = System.currentTimeMillis();
		System.out.println("二叉树排序耗时："+(endTime - startTime)+"毫秒");
		
		startTime = System.currentTimeMillis();
		selectsort(data1);
		endTime = System.currentTimeMillis();
		System.out.println("选择排序耗时："+(endTime - startTime)+"毫秒");
		
		startTime = System.currentTimeMillis();
		bubbleSort(data2);
		endTime = System.currentTimeMillis();
		System.out.println("冒泡排序耗时："+(endTime - startTime)+"毫秒");
	}
	
    //冒泡排序
    public static void bubbleSort(int[] value) {
        for(int i = 0; i < value.length; i++) {
            for(int j = i + 1;j < value.length; j++) {
                if(value[i] > value[j]) {
                    int temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
    }
    
    //选择排序
    public static void selectsort(int[] value) {
        for(int i = 0; i < value.length; i++) {
            int minIndex = i;
            for(int j = i+1; j < value.length; j++) {
                if(value[j] < value[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = value[minIndex];
            value[minIndex] = value[i];
            value[i] = temp;
        }
    }

}
