package com.how2j.NumString;

public class TestStringBuffer {

	/**
	 * StringBuffer�ǿɱ䳤���ַ���
	 * append׷�� 
	 * delete ɾ��
	 * insert ����
	 * reverse ��ת
	 */
	public static void main(String[] args) {

		String str1 = "let there ";
		StringBuffer sb = new StringBuffer(str1);//����str1����һ��StringBuffer����
		sb.append("be light"); //�����׷��
		System.out.println(sb);
        
		sb.delete(4, 10);//ɾ��4-10֮����ַ�
        System.out.println(sb);
         
        sb.insert(4, "there ");//��4���λ�ò��� there
        System.out.println(sb);
         
        sb.reverse(); //��ת
        System.out.println(sb);
        
        /**
         * ΪʲôStringBuffer���Ա䳤��
			��String�ڲ���һ���ַ�����һ����StringBufferҲά����һ���ַ����顣 ���ǣ�����ַ����飬�������೤��
			����˵new StringBuffer("the")�����ڲ����ַ�����ĳ��ȣ���19��������3���������ò����׷�ӣ����ֳɵ�����Ļ����ϾͿ�������ˡ�
			���׷�ӵĳ��ȳ�����19���ͻ����һ���µ����飬���ȱ�ԭ����һЩ����ԭ�������ݸ��Ƶ��µ������У�����ȥ ���鳤�Ⱦͱ䳤�� �ο�MyStringBuffer
			length: ��the���ĳ��� 3
			capacity: ������ܿռ� 19
			ע�� 19�����������ͬ��JDK�����ǲ�һ����
         */
        
        String str2 = "the";
        
        StringBuffer sb1 = new StringBuffer(str2);
        System.out.println(sb1.length()); //���ݳ���
        System.out.println(sb1.capacity());//�ܿռ�
	}

}
