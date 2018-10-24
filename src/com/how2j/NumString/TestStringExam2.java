package com.how2j.NumString;

import java.util.Arrays;

public class TestStringExam2 {

	/**
	����һ��������5������ַ���������ַ��п��������֣���д��ĸ����Сд��ĸ
	������ʾ: ���ֺ��ַ�֮�����ͨ������ת��
	char c = 'A';
	short s = (short) c;
	ͨ������ֶξ��ܹ�֪���ַ� a-z A-Z 0-9 ����Ӧ�����ֵ�������
	��Ҫ�õ�ASCII����ձ�
	 * @return 
	 * @return 
	 */
	
	public String randomString(){
		char[] cs = new char[3];
		String str = "";
		for(int i=0;i<cs.length;i++){
			int m1 = 65 + (int) (Math.random()* (90-65));//��д��ĸ
			int m2 = 97 + (int) (Math.random()* (122-97));//Сд��ĸ
			int m3 = 48 + (int) (Math.random()* (57-48));//����
			int[] m ={m1,m2,m3};
			//System.out.println(m.length);
			//�������0,1,2��,����Math.random���ɵ�������ҿ������ʣ�����ʹ��Math.floor������ȡ��
			int index = (int)Math.floor((Math.random()*(m.length)));
			//System.out.println(index);
			cs[i] =(char)(m[index]);
			str+=cs[i];
		}
		System.out.println(str);
		return str;
	}
	
		/**
		 ����һ��������8���ַ�������
		ʹ��8��������5������ַ�����ʼ���������
		���������������򣬰���ÿ���ַ���������ĸ����(���Ӵ�Сд)

		ע1�� ����ʹ��Arrays.sort() Ҫ�Լ�д
		ע2�� ���Ӵ�Сд���� Axxxx �� axxxxx û���Ⱥ�˳��
		 */
	 
	public void randomStringArraySort(){
        String[] str = new String[8];
        for (int i = 0; i < str.length; i++) {
             str[i]= randomString();
        }
        System.out.println("����ǰ��");
        System.out.println(Arrays.toString(str));
        
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length - j -1; j++) {
                char char1 = str[j].charAt(0);
                char char2 = str[j + 1].charAt(0);
                 
                char1 = Character.toLowerCase(char1);
                char2 = Character.toLowerCase(char2);
                 
                if(char1 > char2) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
        System.out.println("�����");
        System.out.println(Arrays.toString(str));
	}
	
	/**
	 	1. ����һ��������3������ַ�����������ַ�����Ϊ��������
		2. ʹ����ٷ����ɳ�����3���ַ�����ƥ���������ɵ�����
		Ҫ�� �ֱ�ʹ�ö��forѭ�� �� �ݹ�����������
	 */
	
	public void matchThree(){
        String pass = randomString();
        System.out.println(pass);
        System.out.println("-----------------");
        char[] str = new char[3];
        outLoop:
        for (short i = '0'; i <= 'z'; i++) {
            for (short j = '0'; j <='z'; j++) {
                for (short k = '0'; k <= 'z'; k++) {
                    if(!isLetterOrDigit(i,j,k)) {
                        continue;
                    }
                    str[0] = (char)i;
                    str[1] = (char)j;
                    str[2] = (char)k;
                    String rpass= String.valueOf(str);
                    //System.out.println(rpass);
                     
                    if(rpass.equals(pass)) {
                        System.out.println("�ҵ����룺" + rpass);
                        break outLoop;
                    }
                }
            }
        }
	}
	
    private static boolean isLetterOrDigit(short i, short j, short k) {
        return Character.isLetterOrDigit(i) && Character.isLetterOrDigit(j) && Character.isLetterOrDigit(k);
    }
	
	
	public static void main(String[] args) {
		
		TestStringExam2 tse2 = new TestStringExam2();
		tse2.randomString();
		
		tse2.randomStringArraySort();
		
		tse2.matchThree();

	}

}
