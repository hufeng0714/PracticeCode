package com.how2j.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.how2j.charactor.Hero;


/*
 * ��ArrayListһ����LinkedListҲʵ����List�ӿڣ�����add,remove,contains�ȵȷ�����
 * ����ʵ����List�ӿ��⣬LinkedList��ʵ����˫������ṹDeque�����Ժܷ������ͷβ����ɾ������
 * ʲô������ṹ: ������ṹ��Ƚϣ�����ṹ���ͺ����ǵ�ӰԺ��ÿ��λ�ö��б�ʾ��ÿ��λ��֮��ļ������һ���ġ� 
 * ��������൱�ڷ��飬ÿ�����ӣ�ֻ����ǰһ���ͺ�һ�������ù��ĳ���֮����������������
 */
public class TestLinkedList {
	
	public static void main(String[] args) {
		//LinkedList��һ��˫������ṹ��list
		LinkedList<Hero> ll = new LinkedList<Hero>();
        //���Կ��Ժܷ������ͷ����β����������
        //���������µ�Ӣ��
		ll.addLast(new Hero("hero1"));
		ll.addLast(new Hero("hero2"));
		ll.addLast(new Hero("hero3"));
		System.out.println(ll);
		//����ǰ������µ�Ӣ��
		ll.addFirst(new Hero("heroX"));
		System.out.println(ll);
		//�鿴��ǰ���Ӣ��
		System.out.println(ll.getFirst());
		//�鿴������Ӣ��
		System.out.println(ll.getLast());
		//�鿴���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
		//ȡ����ǰ���Ӣ��
		System.out.println(ll.removeFirst());
		//ȡ��������Ӣ��
		System.out.println(ll.removeLast());
		//ȡ���ᵼ��Ӣ�۱�ɾ��
		System.out.println(ll);
		
		/*
		LinkedList ����ʵ����List��Deque�⣬��ʵ����Queue�ӿ�(����)��
		Queue���Ƚ��ȳ����� FIFO�����÷�����
		offer ��������Ԫ��
		poll ȡ����һ��Ԫ��
		peek �鿴��һ��Ԫ��
		 */
		
		//��ArrayListһ����LinkedListҲʵ����List�ӿ�
		List<Hero> ll2 = new LinkedList<Hero>();
		//����ͬ����LinkedList��ʵ����Deque��������ʵ����Queue����ӿ�
        //Queue����FIFO �Ƚ��ȳ��Ķ���
		Queue<Hero> q = new LinkedList<Hero>();
		//���ڶ��е������
        System.out.print("��ʼ�����У�\t");
        q.offer(new Hero("hero1"));
        q.offer(new Hero("hero2"));
        q.offer(new Hero("hero3"));
        System.out.println(q);
        
        System.out.print("�ѵ�һ��Ԫ��ȡpoll()����:\t");
        //ȡ����һ��Hero��FIFO �Ƚ��ȳ�
        Hero h = q.poll();
        System.out.println(h);
        System.out.print("ȡ����һ��Ԫ��֮��Ķ���:\t");
        System.out.println(q);
        //�ѵ�һ���ó�����һ�������ǲ�ȡ����
        h = q.peek();
        System.out.print("�鿴peek()��һ��Ԫ��:\t");
        System.out.println(h);
        System.out.print("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
        System.out.println(q);
		
	}

}
