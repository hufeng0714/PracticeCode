package com.how2j.swing;

import javax.swing.table.AbstractTableModel;

public class HeroTableModel extends AbstractTableModel{
	
	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
    String[][] heros = new String[][] { { "1", "盖伦", "616", "100" },
            { "2", "提莫", "512", "102" }, { "3", "奎因", "832", "200" } };
	
    @Override
	// 返回一共有多少列
	public int getColumnCount() {
		return columnNames.length;
	}
    
	@Override
	// 返回一共有多少行
	public int getRowCount() {
		return heros.length;
	}
	
	@Override
    // 每一个单元格里的值
	public Object getValueAt(int rowIndex, int columnIndex) {
		return heros[rowIndex][columnIndex];
	}
 
    // 获取每一列的名称
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
 
    // 单元格是否可以修改
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
}
