package com.how2j.collection;

import java.util.HashMap;

import com.how2j.charactor.Hero;


	//HashMap�������ݵķ�ʽ�ǡ��� ��ֵ��
public class TestHashMap {
	
	public static void main(String[] args) {
		HashMap<String,String> dictionary = new HashMap();
		dictionary.put("adc", "����Ӣ��");
		dictionary.put("apc", "ħ��Ӣ��");
		dictionary.put("t", "̹��");
		
		System.out.println(dictionary.get("t"));
		
		/*
		 ����HashMap���ԣ�key��Ψһ�ģ��������ظ��ġ� 
		���ԣ�����ͬ��key �Ѳ�ͬ��value���뵽 Map�лᵼ�¾�Ԫ�ر����ǣ�ֻ�����������Ԫ�ء� 
		������ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
		 */
		
		HashMap<String,Hero> heroMap = new HashMap();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
        //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
        heroMap.put("gareen", new Hero("gareen2"));
        System.out.println(heroMap);
        //���map
        heroMap.clear();
        System.out.println(heroMap);
        Hero gareen = new Hero("gareen");
      //ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
        heroMap.put("hero1", gareen);
        heroMap.put("hero2", gareen);
         
        System.out.println(heroMap);
	}
	
}
