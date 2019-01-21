package com.constructor.lsawant;

public class Main {

	public static void main(String[] args) {
		
		//Constructor used to create object and assigned values
		BankAccount myAccount = new BankAccount("BOA001",100,"Lsawant","myemail@lsawant.com","(123) 456-7890");
		
		/* Constructor and setter use for creating object and assigning values
		BankAccount myAccount = new BankAccount();
		myaccount.setBalance(0);
		myaccount.setCustomerName("Lsawant");
		myaccount.setEmail("myemail@lsawant.com");
		myaccount.setNumber("BOA001");
		myaccount.setPhoneNumber("(123) 456-7890");*/

		System.out.println(myAccount.getNumber());
		System.out.println(myAccount.getBalance());
		System.out.println(myAccount.getCustomerName());
		
		System.out.println("----------Default value call----------------------");
		/*
		 * Constructor in constructor call example
		 */
		BankAccount myNewAccount = new BankAccount();
		System.out.println(myNewAccount.getNumber());
		System.out.println(myNewAccount.getBalance());
		System.out.println(myNewAccount.getCustomerName());
		
		
		System.out.println("----------Partially defauly value constructor called----------------------");
		BankAccount myLatestAccount = new BankAccount("Sawant","myemail@sawant.com","(123) 456-7890");
		System.out.println(myLatestAccount.getNumber());
		System.out.println(myLatestAccount.getBalance());
		System.out.println(myLatestAccount.getCustomerName());
		
	}

}
