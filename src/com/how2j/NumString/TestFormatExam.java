package com.how2j.NumString;

import java.util.Scanner;

public class TestFormatExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.in�������ʱ�򣬼ǵð����¼�ͷ�����к����룬�����п��ܱ���
		Scanner s = new Scanner(System.in);

        System.out.println("�����������");
        String place = s.nextLine();
         
        System.out.println("�����빫˾���ͣ�");
        String company = s.nextLine();
         
        System.out.println("�����빫˾���ƣ�");
        String companyName = s.nextLine();
         
        System.out.println("�������ϰ����֣�");
        String boos = s.nextLine();
         
        System.out.println("�������");
        int money = s.nextInt();
         
        System.out.println("�������Ʒ��");
        String rn = s.nextLine();
        String products = s.nextLine();
         
        System.out.println("������۸������λ��");
        String price = s.nextLine();
         
        String str = "%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����%d���ڣ�%n"
                + "��������С��������!����û�а취������%s�ֹ���!%n"
                + "ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���Ǯ��������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%n"
                + "%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!%n";
        System.out.format(str, place,company,companyName,boos,money,products,price,price,price,boos);

	}

}
