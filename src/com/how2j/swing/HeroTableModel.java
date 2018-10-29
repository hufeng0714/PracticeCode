package com.how2j.swing;

import javax.swing.table.AbstractTableModel;

public class HeroTableModel extends AbstractTableModel{
	
	String[] columnNames = new String[] { "id", "name", "hp", "damage" };
    String[][] heros = new String[][] { { "1", "����", "616", "100" },
            { "2", "��Ī", "512", "102" }, { "3", "����", "832", "200" } };
	
    @Override
	// ����һ���ж�����
	public int getColumnCount() {
		return columnNames.length;
	}
    
	@Override
	// ����һ���ж�����
	public int getRowCount() {
		return heros.length;
	}
	
	@Override
    // ÿһ����Ԫ�����ֵ
	public Object getValueAt(int rowIndex, int columnIndex) {
		return heros[rowIndex][columnIndex];
	}
 
    // ��ȡÿһ�е�����
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
 
    // ��Ԫ���Ƿ�����޸�
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
 
}
