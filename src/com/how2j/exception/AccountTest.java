package com.how2j.exception;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("��ѡ��ҵ��");
		System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		CheckingAccount cacc=new CheckingAccount(10000,2000);
		int a;
		do {
			a=s.nextInt();
			switch(a) {
			case 1:
				cacc.printInfo();
				break;
			case 2:
				System.out.println("����������");
				double moneyIn=s.nextDouble();
				cacc.deposit(moneyIn);
				break;
			case 3:
				System.out.println("������ȡ����");
				double moneyOut=s.nextDouble();
				try {
					cacc.withdraw(moneyOut);
				}catch(OverdraftException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("���պ����Ŀ���ע��β�棡");
				break;
				default:
					System.out.println("����������������룡");
					System.out.println("��ѡ��ҵ��");
					System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
					break;
		}
		}while(a!=4);
	}
}
