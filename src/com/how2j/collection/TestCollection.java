package com.how2j.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.how2j.charactor.Hero;

public class TestCollection {

	
	/*
	 ���Ҫ��Ŷ�����󣬿���ʹ�����飬���������о�����
	���� ����������10������
	���õ�������˷���
	����10�ĸ������ַŲ���
	 */
	public static void main(String[] args) {
		//ʹ������ľ�����
		Hero[] heros = new Hero[10];
		/*
		 ����������10������
		���õ�������˷���
		����10�ĸ������ַŲ���
		 */
		heros[0] = new Hero("����");
		//�Ų���Ҫ����
		//heros[20] = new Hero("��Ī");
		
		//ArrayList��Ŷ���
		/*
		 Ϊ�˽������ľ����ԣ�����������ĸ�� �������������� 
		ArrayList 
		����������"capacity"�����Ŷ�������ӣ��Զ����� 
		ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
		*/
		ArrayList herosA = new ArrayList();
		herosA.add(new Hero("����"));
		System.out.println(herosA.size());
		herosA.add(new Hero("��Ī"));
		System.out.println(herosA.size());
		
		ArrayList herosB = new ArrayList();
		
		//����
		//��5��������뵽ArrayList��ȥ
		//��һ����ֱ��add���󣬰Ѷ�����������
		for(int i=0;i<5;i++){
			herosB.add(new Hero("hero"+i));
		}
		System.out.println(herosB);
		//�ڶ�������ָ��λ�üӶ���
		Hero specialHero = new Hero("special Hero");
		herosB.add(3,specialHero);
		System.out.println(herosB );
		
		//�ж��Ƿ����
		//ͨ������contains �ж�һ�������Ƿ���������
		//�жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
        System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
        System.out.println(herosB.contains(new Hero("hero 1")));
        System.out.print("����specialHero���жϣ�contains�ķ�����:");
        System.out.println(herosB.contains(specialHero));
        
        //��ȡָ��λ�õĶ���
        //ͨ��get��ȡָ��λ�õĶ������������±�Խ�磬һ���ᱨ��
        //��ȡָ��λ�õĶ���
        System.out.println(herosB.get(5));
        //��������˷�Χ����Ȼ�ᱨ��
        //System.out.println(herosB.get(6));
        
        //��ȡ����������λ��
        //indexOf�����ж�һ��������ArrayList��������λ��
        //��containsһ�����жϱ�׼�Ƕ����Ƿ���ͬ�����Ƕ����nameֵ�Ƿ����
        System.out.println("specialHero������λ��:"+herosB.indexOf(specialHero));
        System.out.println("�µ�Ӣ�ۣ�����������\"hero 1\"������λ��:"+herosB.indexOf(new Hero("hero 1")));
        
        //ɾ��
        //remove���ڰѶ����ArrayList��ɾ��
        //remove���Ը����±�ɾ��ArrayList��Ԫ��
        //Ҳ���Ը��ݶ���ɾ��
        System.out.println(herosB);
        herosB.remove(2);
        System.out.println("ɾ���±���2�Ķ���");
        System.out.println(herosB);
        System.out.println("ɾ��special hero");
        herosB.remove(specialHero);
        System.out.println(herosB);
        
        //�滻
        //set�����滻ָ��λ�õ�Ԫ��
        ArrayList herosC = new ArrayList();
		for(int i=0;i<5;i++){
			herosC.add(new Hero("hero"+i));
		}
		herosC.add("special Hero");
		System.out.println(herosC);
        System.out.println("���±���5��Ԫ�أ��滻Ϊ\"hero 5\"");
        herosC.set(5, new Hero("hero 5"));
        System.out.println(herosC);
        
        //��ȡ��С
        //size ���ڻ�ȡArrayList�Ĵ�С
        System.out.println("��ȡArrayList�Ĵ�С��");
        System.out.println(herosC.size());
        
        
        //ת��Ϊ����
        //toArray���԰�һ��ArrayList����ת��Ϊ���顣
        //��Ҫע����ǣ����Ҫת��Ϊһ��Hero���飬
        //��ô��Ҫ����һ��Hero�������͵Ķ����toArray()��
        //����toArray������֪������ϣ��ת��Ϊ�������͵����飬����ֻ��ת��ΪObject����
        Hero hs[] = (Hero[])herosC.toArray(new Hero[]{});
        System.out.println("���飺"+hs);
        
        //����һ���������ж��󶼼ӽ���
        //addAll ����һ���������ж��󶼼ӽ���
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        System.out.println("anotherHeros : " + anotherHeros);
        herosC.addAll(anotherHeros);
        System.out.println(herosC);
        
        //���
        //clear ���һ��ArrayList
        ArrayList empHeros = new ArrayList();
        for(int i=0;i<5;i++){
        	empHeros.add(new Hero("hero "+i));
        }
        System.out.println(empHeros);
        empHeros.clear();
        System.out.println(empHeros);
        
        //����
        List<Hero> herosD = new ArrayList<Hero>();
        
        for(int i=0;i<5;i++){
        	herosD.add(new Hero("hero "+i));
        }
        
        //��һ�ֱ��� forѭ��
        System.out.println("--------for ѭ��-------");
        for (int i = 0; i < herosD.size(); i++) {
            Hero h = herosD.get(i);
            System.out.println(h);
        }
        
        //�ڶ��ֱ�����ʹ�õ�����
        System.out.println("--------ʹ��while��iterator-------");
        Iterator<Hero> it= herosD.iterator();
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
        while(it.hasNext()){
            Hero h = it.next();
            System.out.println(h);
        }
        //��������forд��
        System.out.println("--------ʹ��for��iterator-------");
        for (Iterator<Hero> iterator = herosD.iterator(); iterator.hasNext();) {
            Hero hero = (Hero) iterator.next();
            System.out.println(hero);
        }
        
        // �����֣���ǿ��forѭ��
        System.out.println("--------��ǿ��forѭ��-------");
        for (Hero h : herosD) {
            System.out.println(h);
        }
        
	}
}
