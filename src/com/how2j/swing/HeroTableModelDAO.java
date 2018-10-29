package com.how2j.swing;

		/*
		 通过TableModel与DAO结合显示数据库中Hero信息。
		DAO使用HeroDAO
		在TableModel中，使用从DAO返回的List作为TableModel的数据
		
		只需要修改HeroTableModel，无需修改TestGUI。 这正好演绎了Model设计思想中的数据分离的好处，当只需要数据发生变化的时候，修改Model即可，界面GUI部分，不需要做任何改动
		 */

import java.util.List;

import javax.swing.table.AbstractTableModel;
import com.how2j.jdbc.Hero;
import com.how2j.jdbc.HeroDAO;

public class HeroTableModelDAO extends AbstractTableModel{

	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
	 
    // 使用从DAO返回的List作为TableModel的数据
 
    public List<Hero> heros = new HeroDAO().list();
 
    // heros.size返回一共有多少行
    public int getRowCount() {
        // TODO Auto-generated method stub
        return heros.size();
    }
 
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return columnNames.length;
    }
 
    public String getColumnName(int columnIndex) {
        // TODO Auto-generated method stub
        return columnNames[columnIndex];
    }
 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
    // 先通过heros.get(rowIndex)获取行对应的Hero对象
    // 然后根据columnIndex返回对应的属性
    public Object getValueAt(int rowIndex, int columnIndex) {
        Hero h = heros.get(rowIndex);
        if (0 == columnIndex)
            return h.id;
        if (1 == columnIndex)
            return h.name;
        if (2 == columnIndex)
            return h.hp;
        if (3 == columnIndex)
            return h.damage;
        return null;
    }

}
