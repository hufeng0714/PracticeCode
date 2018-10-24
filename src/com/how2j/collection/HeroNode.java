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
	
	 // 中序遍历所有的节点(从小到大)
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
  
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values());
        // 当前节点
        values.add(value);
        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values());
        return values;
    }
    
    // 中序遍历所有的节点(从大到小)
    public List<Object> values2() {
        List<Object> values = new ArrayList<>();
  
        // 右节点的遍历结果
        if (null != rightNode)
            values.addAll(rightNode.values2());
        // 当前节点
        values.add(value);
        // 左节点的遍历结果
        if (null != leftNode)
            values.addAll(leftNode.values2());
        return values;
    }
}
