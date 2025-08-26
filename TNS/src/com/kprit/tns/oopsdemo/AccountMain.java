package com.kprit.tns.oopsdemo;

public class AccountMain {

	public static void main(String[] args) {
		 Account account=new Account(134,"kalyani",9600);
	      
	       BankImplementation bank=new BankImplementation();
	      
			bank.withdraw(account,2000);
			
			bank.deposit(account, 30000);
			

	}

}
