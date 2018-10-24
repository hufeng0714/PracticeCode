package com.how2j.NumString;

public class TestStringOption {


	public static void main(String[] args) {
		
		//charAt(int index)��ȡָ��λ�õ��ַ�
        String sentence = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ� ";
        char c = sentence.charAt(0);
        System.out.println(c);

        //toCharArray() ��ȡ��Ӧ���ַ�����
        

        char[] cs = sentence.toCharArray(); //��ȡ��Ӧ���ַ�����
        System.out.println(sentence.length() == cs.length);
        
        //subString ��ȡ���ַ���
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        String subString1 = sentence.substring(3);
        System.out.println(subString1);
         
        //��ȡ�ӵ�3����ʼ���ַ��� ����0��
        //��5-1��λ�õ��ַ���
        //����ҿ�
        String subString2 = sentence.substring(3,5);
        System.out.println(subString2);
        
        //split���ݷָ������зָ�
        //����,���зָ�õ�3�����ַ���
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }
        
        //trim ȥ����β�ո�
        String sentence2 = "   ����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�     ";
        System.out.println(sentence2);
        //ȥ����β�ո�
        System.out.println(sentence2.trim());
        
        //toLowerCase ȫ�����Сд 
        //toUpperCase ȫ����ɴ�д
        String sentence3 = "Garen";
        //ȫ�����Сд
        System.out.println(sentence3.toLowerCase());
        //ȫ����ɴ�д
        System.out.println(sentence3.toUpperCase());
        
        //indexOf �ж��ַ��������ַ������ֵ�λ��
        //contains �Ƿ�������ַ���
        System.out.println(sentence.indexOf('8')); //�ַ���һ�γ��ֵ�λ��   
        System.out.println(sentence.indexOf("����")); //�ַ�����һ�γ��ֵ�λ��          
        System.out.println(sentence.lastIndexOf("��")); //�ַ��������ֵ�λ��         
        System.out.println(sentence.indexOf(',',5)); //��λ��5��ʼ�����ֵĵ�һ��,��λ��          
        System.out.println(sentence.contains("��ɱ")); //�Ƿ�����ַ���"��ɱ"
        
        //replaceAll �滻���е� 
        //replaceFirst ֻ�滻��һ��
        
        String temp = sentence.replaceAll("��ɱ", "����ɱ"); //�滻���е�        
        temp = temp.replaceAll("����", "����");         
        System.out.println(temp);         
        temp = sentence.replaceFirst(",","");//ֻ�滻��һ��         
        System.out.println(temp);        
	}

}
