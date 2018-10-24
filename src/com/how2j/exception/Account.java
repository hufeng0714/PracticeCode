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
			System.out.println("输入错误，请输入正数！");
			System.out.println("请选择业务：");
			System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		}
		else {
			balance=balance+money;
			System.out.println("您存入"+money+"元");
			System.out.println("余额为："+balance+"元");
			System.out.println("请选择业务：");
			System.out.println("1-查询余额\t2-存款\t3-取款\t4-退卡");
		}
	}
	public void withdraw(double money) throws OverdraftException{
		if(money<=0) System.out.println("输入错误，请输入正数！");
		else if(money<=balance) {
			balance-=money;
			System.out.println("您取出"+money+"元");
			System.out.println("余额为："+balance+"元");
		}
		else {
			throw new OverdraftException("错误！取款金额大于余额。");
		}
	}
}
