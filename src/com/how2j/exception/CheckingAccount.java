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
		System.out.println("余额为："+this.getBalance());
		System.out.println("透支额度为："+overdraftProtection);
		System.out.println("请选择业务：");
		System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
	}
	public void withdraw(double money) throws OverdraftException{
		if(money<=0) {
			System.out.println("输入错误，请输入正数！");
			System.out.println("请选择业务：");
			System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		}
		else if(money<=this.getBalance()) {
			this.setBalance(this.getBalance()-money);
			System.out.println("您取出"+money+"元");
			System.out.println("余额为："+this.getBalance()+"元");
			System.out.println("请选择业务：");
			System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		}
		else if(money<=this.getBalance()+overdraftProtection) {
			System.out.println("您取出"+money+"元");
			System.out.println("余额为：0元");
			System.out.println("透支"+(money-getBalance())+"元");
			overdraftProtection=overdraftProtection-(money-getBalance());
			setBalance(0);
			System.out.println("透支额度为："+overdraftProtection);
			System.out.println("请选择业务：");
			System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		}
		else {
			throw new OverdraftException("错误！取款金额大于余额和透支金额之和");
		}
	}
}
