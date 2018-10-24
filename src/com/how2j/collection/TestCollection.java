package com.how2j.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.how2j.charactor.Hero;

public class TestCollection {

	
	/*
	 如果要存放多个对象，可以使用数组，但是数组有局限性
	比如 声明长度是10的数组
	不用的数组就浪费了
	超过10的个数，又放不下
	 */
	public static void main(String[] args) {
		//使用数组的局限性
		Hero[] heros = new Hero[10];
		/*
		 声明长度是10的数组
		不用的数组就浪费了
		超过10的个数，又放不下
		 */
		heros[0] = new Hero("盖伦");
		//放不下要报错
		//heros[20] = new Hero("提莫");
		
		//ArrayList存放对象
		/*
		 为了解决数组的局限性，引入容器类的概念。 最常见的容器类就是 
		ArrayList 
		容器的容量"capacity"会随着对象的增加，自动增长 
		只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。
		*/
		ArrayList herosA = new ArrayList();
		herosA.add(new Hero("盖伦"));
		System.out.println(herosA.size());
		herosA.add(new Hero("提莫"));
		System.out.println(herosA.size());
		
		ArrayList herosB = new ArrayList();
		
		//增加
		//把5个对象加入到ArrayList中去
		//第一种是直接add对象，把对象加在最后面
		for(int i=0;i<5;i++){
			herosB.add(new Hero("hero"+i));
		}
		System.out.println(herosB);
		//第二种是在指定位置加对象
		Hero specialHero = new Hero("special Hero");
		herosB.add(3,specialHero);
		System.out.println(herosB );
		
		//判断是否存在
		//通过方法contains 判断一个对象是否在容器中
		//判断标准： 是否是同一个对象，而不是name是否相同
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(herosB.contains(new Hero("hero 1")));
        System.out.print("而对specialHero的判断，contains的返回是:");
        System.out.println(herosB.contains(specialHero));
        
        //获取指定位置的对象
        //通过get获取指定位置的对象，如果输入的下标越界，一样会报错
        //获取指定位置的对象
        System.out.println(herosB.get(5));
        //如果超出了范围，依然会报错
        //System.out.println(herosB.get(6));
        
        //获取对象所处的位置
        //indexOf用于判断一个对象在ArrayList中所处的位置
        //与contains一样，判断标准是对象是否相同，而非对象的name值是否相等
        System.out.println("specialHero所处的位置:"+herosB.indexOf(specialHero));
        System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:"+herosB.indexOf(new Hero("hero 1")));
        
        //删除
        //remove用于把对象从ArrayList中删除
        //remove可以根据下标删除ArrayList的元素
        //也可以根据对象删除
        System.out.println(herosB);
        herosB.remove(2);
        System.out.println("删除下标是2的对象");
        System.out.println(herosB);
        System.out.println("删除special hero");
        herosB.remove(specialHero);
        System.out.println(herosB);
        
        //替换
        //set用于替换指定位置的元素
        ArrayList herosC = new ArrayList();
		for(int i=0;i<5;i++){
			herosC.add(new Hero("hero"+i));
		}
		herosC.add("special Hero");
		System.out.println(herosC);
        System.out.println("把下标是5的元素，替换为\"hero 5\"");
        herosC.set(5, new Hero("hero 5"));
        System.out.println(herosC);
        
        //获取大小
        //size 用于获取ArrayList的大小
        System.out.println("获取ArrayList的大小：");
        System.out.println(herosC.size());
        
        
        //转换为数组
        //toArray可以把一个ArrayList对象转换为数组。
        //需要注意的是，如果要转换为一个Hero数组，
        //那么需要传递一个Hero数组类型的对象给toArray()，
        //这样toArray方法才知道，你希望转换为哪种类型的数组，否则只能转换为Object数组
        Hero hs[] = (Hero[])herosC.toArray(new Hero[]{});
        System.out.println("数组："+hs);
        
        //把另一个容器所有对象都加进来
        //addAll 把另一个容器所有对象都加进来
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros : " + anotherHeros);
        herosC.addAll(anotherHeros);
        System.out.println(herosC);
        
        //清空
        //clear 清空一个ArrayList
        ArrayList empHeros = new ArrayList();
        for(int i=0;i<5;i++){
        	empHeros.add(new Hero("hero "+i));
        }
        System.out.println(empHeros);
        empHeros.clear();
        System.out.println(empHeros);
        
        //泛型
        List<Hero> herosD = new ArrayList<Hero>();
        
        for(int i=0;i<5;i++){
        	herosD.add(new Hero("hero "+i));
        }
        
        //第一种遍历 for循环
        System.out.println("--------for 循环-------");
        for (int i = 0; i < herosD.size(); i++) {
            Hero h = herosD.get(i);
            System.out.println(h);
        }
        
        //第二种遍历，使用迭代器
        System.out.println("--------使用while的iterator-------");
        Iterator<Hero> it= herosD.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直到"下一个"位置没有数据
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //迭代器的for写法
        System.out.println("--------使用for的iterator-------");
        for (Iterator<Hero> iterator = herosD.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
        
        // 第三种，增强型for循环
        System.out.println("--------增强型for循环-------");
        for (Hero h : herosD) {
            System.out.println(h);
        }
        
	}
}
