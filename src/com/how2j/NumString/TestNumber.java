package com.how2j.NumString;

public class TestNumber {
	
	/**
	 ���еĻ������ͣ����ж�Ӧ�������� 
	����int��Ӧ������Integer 
	������ͽ�����װ��
	 */

	public static void main(String[] args) {
		int i = 5;
        //��һ���������͵ı���,ת��ΪInteger����
		//��������ת��װ��
		Integer it = new Integer(i);
		//��һ��Integer����ת��Ϊһ���������͵�int
		//��װ��ת��������
		int i2 = it.intValue();
		
		//����Ҫ���ù��췽����ͨ��=�����Զ��� �������� ת��Ϊ ������ �ͽ�װ��
		Integer it2 = i;
		
		//��Ҫ����Integer��intValue������ͨ��=���Զ�ת����int���ͣ��ͽв���
		int i3 = it;
		/**
		 ���ַ�װ���� 
		Byte,Short,Integer,Long,Float,Double 
		��Щ�඼�ǳ�����Number������
		 */
		  //Integer��Number�����࣬���Դ�ӡtrue
		System.out.println(it instanceof Number);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
