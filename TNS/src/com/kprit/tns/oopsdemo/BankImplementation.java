package com.kprit.tns.oopsdemo;

public class BankImplementation implements Bank{

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance()-amount>MINBAL)
		       //3000-1000=2000	>1500
			{
				account.setBalance(account.getBalance()-amount);
				//3000-1000 =2000
				System.out.println("The balance after withdraw"
									+account.getBalance());
			}
			
			else {
				System.out.println("Insufficient balance to withdraw");
			}

				
	}

	@Override
	public void deposit(Account account, double amount) {
		 if(amount>DEPOSIT_LIMIT) {
		    	//30000>25000 -- true if will get executed
		    	//20000>25000 -- false else will get executed
		    System.out.println("The amount is exceeding to deposit..");
		    }
		
		    else {
		    	
		    	account.setBalance(account.getBalance()+amount);
		    	//3000+20000 =23000
		    	System.out.println("The amount after deposit"
		    						+account.getBalance());
		    	
		    }
		
	}

	

}
