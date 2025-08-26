package com.kprit.tns.oopsdemo;

abstract class ATM {
	 abstract void withdraw();
		abstract void credit();
		abstract void ministatement();
		
		void display() {
			System.out.println("This is abstract class method");
		}


}
