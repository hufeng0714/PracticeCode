package com.how2j.exception;

public class TestExceptionClassifyExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��������ʱ�쳣�Ƿ��ܱ���׽
		try{
			int a[]=new int[123];
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				a[i]=4;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�����±�Խ��");
		}
		
		//���Դ����ܷ񱻲�׽
		StringBuffer sb=new StringBuffer();
		try{
			for (int i = 0; i < Integer.MAX_VALUE; i++) {
				sb.append('s');
			}
		}catch(Error e){
			System.out.println("����һ������Error");
		}
		
	}
}

//�����Բ�׽��
