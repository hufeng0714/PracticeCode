package com.how2j.collection;

import com.how2j.charactor.Hero;

public interface Stack {
	//��Ӣ�����뵽���λ��
	public void push(Hero h);
	//�����һ��Ӣ��ȡ����
	public Hero pull();
	//�鿴���һ��Ӣ��
	public Hero peek();
}