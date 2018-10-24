package com.how2j.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.how2j.charactor.Hero;

public class TestCollectionExam {

	/**
	 *如果就是要判断集合里是否存在一个 name等于 "hero 1"的对象，应该怎么做？
	 */
	public static void main(String[] args) {
		
		ArrayList heros = new ArrayList();
		for(int i=0;i<5;i++){
			heros.add(new Hero("hero "+i));
		}
		System.out.println(heros);
		
		String heroName = "hero 1";

		boolean foundIt = false;
		
		for(int j=0;j<heros.size();j++){
			//将容器类转化为具体英雄对象以便调用
			Hero hh = (Hero)heros.get(j);
			if(heroName.equals(hh.getName())){
				foundIt = true;
				System.out.printf("%d,%s",heros.indexOf(hh),hh.getName());
				break;
			}
		}
		
		if(foundIt == false){
			System.out.println("not found");
		}
		
		System.out.println();
		
		/*
		 * 通过遍历的手段，删除掉名字编号是8的倍数的对象
		 */
		
		/*
		 * 遍历方法1
		 */
		List<Hero> herosA = new ArrayList<Hero>();
		
		for(int k=0;k<100;k++){
			herosA.add(new Hero("1hero"+k));
		}
		System.out.println(herosA);
		System.out.println(herosA.size());
		
        for (int a=0;a<herosA.size();a++) {
        	
            Hero hh = (Hero)herosA.get(a);
            String herosAName = hh.getName();
            int num = Integer.parseInt(herosAName.substring(5));
            if(num!=0&&num%8==0){
            	herosA.remove(a);
            }
        }
		System.out.println(herosA);
		System.out.println(herosA.size());
		
		/*
		 * 遍历方法2
		 */		
		
		List<Hero> herosB = new ArrayList<Hero>();
		
		for(int k=0;k<100;k++){
			herosB.add(new Hero("2hero"+k));
		}
		System.out.println(herosB);
		System.out.println(herosB.size());
		
		Iterator<Hero> it = herosB.iterator();
		while(it.hasNext()){
			Hero h = it.next();
			int id = Integer.parseInt(h.toString().substring(5));
			if(id!=0&&id%8==0){
				it.remove();
			}
		}
		System.out.println(herosB);
		System.out.println(herosB.size());
		
		/*
		 * 遍历方法3
		 */	
		List<Hero> herosC = new ArrayList<Hero>();
		
		for(int k=0;k<100;k++){
			herosC.add(new Hero("3hero"+k));
		}
		System.out.println(herosC);
		System.out.println(herosC.size());
		
		List<Hero> remove_Hero = new ArrayList<Hero>();
		
		for(Hero each:herosC){
			int id = Integer.parseInt(each.toString().substring(5));
			if(id!=0&&id%8==0){
				remove_Hero.add(each);
			}
		}
		herosC.removeAll(remove_Hero);
		
		System.out.println(herosC);
		System.out.println(herosC.size());
		
	}

}
