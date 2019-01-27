package com.challenge.classes.lsawant;

public class Main {

	public static void main(String[] args) {
		
		BankAccount myaccount = new BankAccount();
		
		myaccount.setBalance(0);
		myaccount.setCustomerName("Lsawant");
		myaccount.setEmail("myemail@lsawant.com");
		myaccount.setNumber("BOA001");
		myaccount.setPhoneNumber("(123) 456-7890");
		
		
		myaccount.withdraw(100);
		myaccount.deposit(101);
		myaccount.withdraw(100);
		myaccount.withdraw(1);
		myaccount.withdraw(1);
		
	}

}
