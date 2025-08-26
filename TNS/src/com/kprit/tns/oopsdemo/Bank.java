package com.kprit.tns.oopsdemo;

public interface Bank {
	//final variables
		final double MINBAL=1500;
		final double DEPOSIT_LIMIT=25000;
		
		//abstract methods
		 void withdraw(Account account,double amount);
		 void deposit(Account account,double amount);
		


}
