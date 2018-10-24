package com.how2j.exception;

public class Account {
	private double balance=0;
	public Account() {
		
	}
	public Account(double balance) {
		this.balance=balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double money) {
		if(money<=0) {
			System.out.println("�������������������");
			System.out.println("��ѡ��ҵ��");
			System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		}
		else {
			balance=balance+money;
			System.out.println("������"+money+"Ԫ");
			System.out.println("���Ϊ��"+balance+"Ԫ");
			System.out.println("��ѡ��ҵ��");
			System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		}
	}
	public void withdraw(double money) throws OverdraftException{
		if(money<=0) System.out.println("�������������������");
		else if(money<=balance) {
			balance-=money;
			System.out.println("��ȡ��"+money+"Ԫ");
			System.out.println("���Ϊ��"+balance+"Ԫ");
		}
		else {
			throw new OverdraftException("����ȡ���������");
		}
	}
}
