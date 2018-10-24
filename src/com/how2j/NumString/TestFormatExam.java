package com.how2j.NumString;

import java.util.Scanner;

public class TestFormatExam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//System.in在输入的时候，记得按向下箭头，换行后输入，否则有可能报错
		Scanner s = new Scanner(System.in);

        System.out.println("请输入地名：");
        String place = s.nextLine();
         
        System.out.println("请输入公司类型：");
        String company = s.nextLine();
         
        System.out.println("请输入公司名称：");
        String companyName = s.nextLine();
         
        System.out.println("请输入老板名字：");
        String boos = s.nextLine();
         
        System.out.println("请输入金额：");
        int money = s.nextInt();
         
        System.out.println("请输入产品：");
        String rn = s.nextLine();
        String products = s.nextLine();
         
        System.out.println("请输入价格计量单位：");
        String price = s.nextLine();
         
        String str = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%d个亿，%n"
                + "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!%n"
                + "原价都是一%s多、两%s多、三%s多的钱包，现在全部只卖二十块，统统只要二十块!%n"
                + "%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!%n";
        System.out.format(str, place,company,companyName,boos,money,products,price,price,price,boos);

	}

}
