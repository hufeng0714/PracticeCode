package com.how2j.exception;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("请选择业务：");
		System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		CheckingAccount cacc=new CheckingAccount(10000,2000);
		int a;
		do {
			a=s.nextInt();
			switch(a) {
			case 1:
				cacc.printInfo();
				break;
			case 2:
				System.out.println("请输入存款金额");
				double moneyIn=s.nextDouble();
				cacc.deposit(moneyIn);
				break;
			case 3:
				System.out.println("请输入取款金额");
				double moneyOut=s.nextDouble();
				try {
					cacc.withdraw(moneyOut);
				}catch(OverdraftException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("请收好您的卡，注意尾随！");
				break;
				default:
					System.out.println("输入错误，请重新输入！");
					System.out.println("请选择业务：");
					System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
					break;
		}
		}while(a!=4);
	}
}
