package com.how2j.exception;

public class CheckingAccount extends Account{
	private double overdraftProtection;
	public CheckingAccount() {
		super();
	}
	public CheckingAccount(double balance,double overdraftProtection) {
		super(balance);
		this.overdraftProtection=overdraftProtection;
	}
	public void printInfo() {
		System.out.println("���Ϊ��"+this.getBalance());
		System.out.println("͸֧���Ϊ��"+overdraftProtection);
		System.out.println("��ѡ��ҵ��");
		System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
	}
	public void withdraw(double money) throws OverdraftException{
		if(money<=0) {
			System.out.println("�������������������");
			System.out.println("��ѡ��ҵ��");
			System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		}
		else if(money<=this.getBalance()) {
			this.setBalance(this.getBalance()-money);
			System.out.println("��ȡ��"+money+"Ԫ");
			System.out.println("���Ϊ��"+this.getBalance()+"Ԫ");
			System.out.println("��ѡ��ҵ��");
			System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		}
		else if(money<=this.getBalance()+overdraftProtection) {
			System.out.println("��ȡ��"+money+"Ԫ");
			System.out.println("���Ϊ��0Ԫ");
			System.out.println("͸֧"+(money-getBalance())+"Ԫ");
			overdraftProtection=overdraftProtection-(money-getBalance());
			setBalance(0);
			System.out.println("͸֧���Ϊ��"+overdraftProtection);
			System.out.println("��ѡ��ҵ��");
			System.out.println("1-��ѯ���\t2-���\t3-ȡ��\t4-�˿�");
		}
		else {
			throw new OverdraftException("����ȡ�����������͸֧���֮��");
		}
	}
}
