package com.how2j.collection;

import java.util.ArrayList;
import java.util.List;

import com.how2j.charactor.Hero;

public class HeroNode {
	
	public HeroNode leftNode;
	public HeroNode rightNode;
	public Hero value;
	
	public void add(Hero h){
		if(value == null)
			value = h;
		else{
			if(h.hp < (int)value.hp){
				if(leftNode == null)
					leftNode = new HeroNode();
					leftNode.add(h);
				
			}else{
				if(rightNode == null)
					rightNode = new HeroNode();
					rightNode.add(h);
			}
		}
	}
	
	 // ����������еĽڵ�(��С����)
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
  
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values());
        // ��ǰ�ڵ�
        values.add(value);
        // �ҽڵ�ı������
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    
    // ����������еĽڵ�(�Ӵ�С)
    public List<Object> values2() {
        List<Object> values = new ArrayList<>();
  
        // �ҽڵ�ı������
        if (null != rightNode)
            values.addAll(rightNode.values2());
        // ��ǰ�ڵ�
        values.add(value);
        // ��ڵ�ı������
        if (null != leftNode)
            values.addAll(leftNode.values2());
        return values;
    }
}
