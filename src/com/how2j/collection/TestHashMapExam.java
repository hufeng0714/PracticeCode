package com.how2j.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.how2j.charactor.Hero;

		/*
		 ׼��һ��ArrayList���д��3000000(�������)Hero�����������������,��ʽ��hero-[4λ�����]
		hero-3229
		hero-6232
		hero-9365
		...
		
		��Ϊ�����ܴ����Լ���ÿ�ֶ����ظ��������ֽ��� hero-5555�����ж����ҳ���
		Ҫ��ʹ�����ְ취��Ѱ��
		1. ��ʹ��HashMap��ֱ��ʹ��forѭ���ҳ�������ͳ�ƻ��ѵ�ʱ��
		2. ����HashMap���ҳ��������ͳ�ƻ��ѵ�ʱ��
		 */

public class TestHashMapExam {
	public static int random(){
		return (int)(Math.random()*9000+1000);
	}
	public static void main(String[] args) {
		
		List<Hero> hs = new ArrayList<>();
		System.out.println("��ʼ����ʼ");
		for(int i=0;i<3000000;i++){
			Hero h = new Hero("hero-"+random());
			hs.add(h);
		}
		//System.out.println(hs);
		//������Ϊkey
        //������ͬ��hero������һ��List�У���Ϊvalue
		
		//����HashMap����ֵ�Դ�ŵ���h.name����ͬh.name����������list
		HashMap<String,List<Hero>> heroMap = new HashMap();
		for(Hero h:hs){
			//��һ��ѭ����ʱ��list�ǿյ�
			//�ڶ���ѭ������h.name�Ѿ���ǰ����ڹ��ģ�ֱ������list.add(h)����h���뵽list�У�
			//�����ͽ���ͬh.name�Ķ��󶼷ŵ�ͬһ��list��
			
			List<Hero> list = heroMap.get(h.name);
			if(list == null){
				//���listΪ�գ����½���Ȼ��put��hashMap�У���map�е�valueָ����list�ĵ�ַ
				list = new ArrayList<>();
				heroMap.put(h.name, list);
			}
			//��h���뵽list�У�hashMap�е�ֵ��ŵ���list�ĵ�ַ��֮����Բ��ϵ���list��add����
			list.add(h);
		}
		
        System.out.println("��ʼ������");
        System.out.println("��ʼ����");
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
        System.out.printf("ͨ��map���ң�һ���ҵ�%d��Ӣ�ۣ���ʱ%d ����%n",result.size(),endTime-startTime);
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
		System.out.printf("ͨ��for���ң�һ���ҵ�%d��Ӣ�ۣ���ʱ%d ����%n", result.size(),endTime-startTime);
        return result;
	}
}
