package com.kprit.tns.oopsdemo;
//Demo for interface

public class Account{
	private int accnum;
	private String accname;
	private double balance;
	Bank bank;
	//constructor
	public Account(int accnum, String accname, double balance) {
		super();
		this.accnum = accnum;
		this.accname = accname;
		this.balance = balance;
		//this.bank = bank;
	}
	public int getAccnum() {
		return accnum;
	}
	public void setAccnum(int accnum) {
		this.accnum = accnum;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
}

