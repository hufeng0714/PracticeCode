package com.how2j.NumString;

public class TestMathExam {

	/**
	 ���ͼ����Ȼ�����ļ��㷽ʽ��(��n���������ʱ��1+1/n����n�η�=e)
	����Math�ķ���������Ȼ����������������������Լ��������Ȼ������Math.E�������ж��
	 */
	
	/**
	 ͳ���ҳ�һǧ�����ڣ�һ���ж�������

	��������: ֻ�ܱ�1���Լ���������
	����:
	5ֻ�ܱ� 1��5����������������
	8���Ա�2���������Բ�������
	 */
	public static void main(String[] args) {
		
		int n = Integer.MAX_VALUE;
		double db = Math.pow((1+1.0/n),n);
		System.out.println(Math.E);
		System.out.println(db);
		
		float i = 66.4f;
		int j = (int)i;
		System.out.println(j);
		
		int count = 0;
		for(int a=2;a<10000000;a++){
			if(pd(a))
				count++;
		}
		
		System.out.println(count);
		
			
	}
	
	static boolean pd(int n){
		int k = (int) Math.sqrt(n) + 1;
		if(n==2){
			return true;
		}
		for(int m=2;m<k;m++){
			if(n%m==0)
				return false;
		}
		return true;
	}

}
