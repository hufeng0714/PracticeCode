package com.how2j.NumString;

import java.util.Locale;

public class TestFormat {

	/**
	 �����ʹ�ø�ʽ�����������Ҫ�����ַ������ӣ���������Ƚ϶࣬ƴ�Ӿͻ��Ե÷���
	ʹ�ø�ʽ��������Ϳ��Լ������

	%s ��ʾ�ַ���
	%d ��ʾ����
	%n ��ʾ����
	 */
	public static void main(String[] args) {
        String name ="����";
        int kill = 8;
        String title="����";
         
        //ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�,�׶��Բ�
        String sentence = name+ " �ڽ��������� " + kill + " �λ�ɱ�󣬻���� " + title +" �ĳƺ�";
         
        System.out.println(sentence);
         
        //ʹ�ø�ʽ�����
        //%s��ʾ�ַ�����%d��ʾ����,%n��ʾ����
        String sentenceFormat ="%s �ڽ��������� %d �λ�ɱ�󣬻���� %s �ĳƺ�%n";
        System.out.printf(sentenceFormat,name,kill,title);
        
        //printf��format�ܹ��ﵽһģһ����Ч��
        //ʹ��printf��ʽ�����
        System.out.printf(sentenceFormat,name,kill,title);
        //ʹ��format��ʽ�����
        System.out.format(sentenceFormat,name,kill,title);
       
        /**
		        ��ͬ�Ĳ���ϵͳ�����з��ǲ�һ����
		        ��1����DOS��Windows�У�ÿ�н�β�� ��\r\n����
		        ��2��Linuxϵͳ�ÿ�н�βֻ�� ��\n����
		        ��3��Macϵͳ�ÿ�н�β��ֻ�� "\r"��
		        Ϊ��ʹ��ͬһ��java����Ļ��з������еĲ���ϵͳ�ж���һ���ı��֣�ʹ��%n���Ϳ�������ƽ̨�޹صĻ���
        */
        System.out.printf("���ǻ��з�%n");
        System.out.printf("���ǻ��з�%n");
        
        /**
         �ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
         */
        
        int year = 2020;
        //�ܳ��ȣ�����룬��0��ǧλ�ָ�����С����λ�������ػ����
          
        //ֱ�Ӵ�ӡ����
        System.out.format("%d%n",year);
        //�ܳ�����8,Ĭ���Ҷ���
        System.out.format("%8d%n",year);
        //�ܳ�����8,�����
        System.out.format("%-8d%n",year);
        //�ܳ�����8,������0
        System.out.format("%08d%n",year);
        //ǧλ�ָ���
        System.out.format("%,8d%n",year*10000);
  
        //С����λ��
        System.out.format("%.2f%n",Math.PI);
          
        //��ͬ���ҵ�ǧλ�ָ���
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);
	}

}
