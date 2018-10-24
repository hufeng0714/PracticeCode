package com.how2j.charactor;

public class EnumSeasonTest {

	public static void main(String[] args) {
		
		EnumSeason es = EnumSeason.SPRING;
		
		switch(es){
			case SPRING:
				System.out.println("春天");
				break;
			case SUMMER:
				System.out.println("夏天");
				break;
			case AUTUMN:
				System.out.println("秋天");
				break;
			case WINTER:
				System.out.println("冬天");
				break;
		}
		/**
		 * 增强型for
		 * 
		 for(元素类型 ele : 数组名/Iterable 实例){}
		 */
		for(EnumSeason s:EnumSeason.values()){
			System.out.println(s);
		}
	}

}
