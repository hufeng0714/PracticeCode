package com.how2j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.how2j.charactor.Hero;

		/*
		 准备一个ArrayList其中存放3000000(三百万个)Hero对象，其名称是随机的,格式是hero-[4位随机数]
		hero-3229
		hero-6232
		hero-9365
		...
		
		因为总数很大，所以几乎每种都有重复，把名字叫做 hero-5555的所有对象找出来
		要求使用两种办法来寻找
		1. 不使用HashMap，直接使用for循环找出来，并统计花费的时间
		2. 借助HashMap，找出结果，并统计花费的时间
		 */

public class TestHashMapExam {
	public static int random(){
		return (int)(Math.random()*9000+1000);
	}
	public static void main(String[] args) {
		
		List<Hero> hs = new ArrayList<>();
		System.out.println("初始化开始");
		for(int i=0;i<3000000;i++){
			Hero h = new Hero("hero-"+random());
			hs.add(h);
		}
		//System.out.println(hs);
		//名字作为key
        //名字相同的hero，放在一个List中，作为value
		
		//创建HashMap，键值对存放的是h.name和相同h.name集合起来的list
		HashMap<String,List<Hero>> heroMap = new HashMap();
		for(Hero h:hs){
			//第一次循环的时候list是空的
			//第二次循环，当h.name已经是前面存在过的，直接跳到list.add(h)，将h加入到list中，
			//这样就将相同h.name的对象都放到同一个list中
			
			List<Hero> list = heroMap.get(h.name);
			if(list == null){
				//如果list为空，则新建，然后put到hashMap中，即map中的value指向了list的地址
				list = new ArrayList<>();
				heroMap.put(h.name, list);
			}
			//将h加入到list中，hashMap中的值存放的是list的地址，之后可以不断的往list中add对象
			list.add(h);
		}
		
        System.out.println("初始化结束");
        System.out.println("开始查找");
        findByIteration(hs);
        findByMap(heroMap);
	}
	
//	private static List<Hero> findByMap(HashMap<String, List<Hero>> heroMap) {
//		
//		List<Hero> result = heroMap.get("hero-555");  


    private static List<Hero> findByMap(HashMap<String,List<Hero>> heroMap) {
        long startTime =System.currentTimeMillis();
        List<Hero> result = heroMap.get("hero-5555");
        long endTime =System.currentTimeMillis();
        System.out.printf("通过map查找，一共找到%d个英雄，耗时%d 毫秒%n",result.size(),endTime-startTime);
        return result;
    }
	
	private static List<Hero> findByIteration(List<Hero> hs) {
		
		long startTime = System.currentTimeMillis();
		List<Hero> result = new ArrayList<>();
        for (Hero h : hs) {
            if(h.name.equals("hero-5555")){
                result.add(h);
            }
        }  
		long endTime = System.currentTimeMillis();
		System.out.printf("通过for查找，一共找到%d个英雄，耗时%d 毫秒%n", result.size(),endTime-startTime);
        return result;
	}
}
