package com.how2j.NumString;

public class TestChar {

	/**
	 * ����һ���ַ���ʱ��ʹ��char
	 */
	public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '1';//�ַ�1,��������1
        char c3 = '��';//�����ַ�
        //char c4 = 'ab'; //ֻ�ܷ�һ���ַ�
        
        Character c = c1;
        c1 = c;
        //Character��������
        System.out.println(Character.isLetter('a'));//�ж��Ƿ�Ϊ��ĸ
        System.out.println(Character.isDigit('a')); //�ж��Ƿ�Ϊ����
        System.out.println(Character.isWhitespace(' ')); //�Ƿ��ǿհ�
        System.out.println(Character.isUpperCase('a')); //�Ƿ��Ǵ�д
        System.out.println(Character.isLowerCase('a')); //�Ƿ���Сд
         
        System.out.println(Character.toUpperCase('a')); //ת��Ϊ��д
        System.out.println(Character.toLowerCase('A')); //ת��ΪСд
 
        //String a = 'a'; //���ܹ�ֱ�Ӱ�һ���ַ�ת�����ַ���
        String a2 = Character.toString('a'); //ת��Ϊ�ַ���
        
        //����ת��
        System.out.println("ʹ�ÿո��޷��ﵽ�����Ч��");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");
          
        System.out.println("ʹ��\\t�Ʊ�����Դﵽ�����Ч��");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");
         
        System.out.println("һ��\\t�Ʊ��������8");
        System.out.println("12345678def");
          
        System.out.println("���з� \\n");
        System.out.println("abc\ndef");
 
        System.out.println("������ \\'");
        System.out.println("abc\'def");
        System.out.println("˫���� \\\"");
        System.out.println("abc\"def");
        System.out.println("��б�ܱ��� \\");
        System.out.println("abc\\def");

	}

}
