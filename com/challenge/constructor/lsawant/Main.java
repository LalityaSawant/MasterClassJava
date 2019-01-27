package com.challenge.constructor.lsawant;

public class Main {

	public static void main(String[] args) {
		
		VipCustomer myaccount = new VipCustomer();
		
		System.out.println("By 0 paramter constructor - " + myaccount.getName() +" "+ myaccount.getCreditLimit());
		
		VipCustomer myNewAccount = new VipCustomer("Lsawant","lsawant@lsawant.com");
		
		System.out.println("By 2 paramter constructor - " + myNewAccount.getName() +" " +myNewAccount.getCreditLimit());
		
		VipCustomer myLatestAccount = new VipCustomer("Sawant",50000,"sawant@lsawant.com");
		
		System.out.println("By 3 parameter constructor - " + myLatestAccount.getName() +" "+ myLatestAccount.getCreditLimit());

	}

}
