package com.how2j.charactor;

public class EnumSeasonTest {

	public static void main(String[] args) {
		
		EnumSeason es = EnumSeason.SPRING;
		
		switch(es){
			case SPRING:
				System.out.println("����");
				break;
			case SUMMER:
				System.out.println("����");
				break;
			case AUTUMN:
				System.out.println("����");
				break;
			case WINTER:
				System.out.println("����");
				break;
		}
		/**
		 * ��ǿ��for
		 * 
		 for(Ԫ������ ele : ������/Iterable ʵ��){}
		 */
		for(EnumSeason s:EnumSeason.values()){
			System.out.println(s);
		}
	}

}
