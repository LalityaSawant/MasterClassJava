package com.constructor.lsawant;

public class BankAccount {
	private String number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	/*
	 * This is a constructor
	 * Its a special method which has exact name as Class and only have access modifier
	 */
	public BankAccount() {
		this("Default000",0.0,"Default Customer name","Default email","(000) 000-0000"); 
		/*
		 * This is a special use of "this" keyword
		 * used to call other constructor with some default values if need to be set, when no parameters are passed
		 * not been used always but can be used for required scenario
		 * ***While using this key word this should be the first statement in constructor body
		 */
		System.out.println("Empty constructor called");
	}
	
	
	/*
	 * One more example of over loading constructor where values are defaulted partially
	 * and its calling another constructor for remaining values
	 */
	public BankAccount(String customerName, String email, String phoneNumber) {
		this("Default000",0.0,customerName,email,phoneNumber);		
	}



	/*
	 * This is also an constructor with parameters
	 * also called as constructor overloading
	 */
	public BankAccount(String number,double balance,String customerName, String email, String phoneNumber) {
		System.out.println("Account constructor with parameters called");
		this.balance = balance;
		this.customerName = customerName;
		this.number = number;
		this.email = email;
		this.phoneNumber = phoneNumber;			
		/* even below method can be used for setting values but with constructors 
		 * but its always better to assign values to fields directly by using this keyword
		*/
		//setPhoneNumber(phoneNumber); 
		
	}
	
	public void deposit(double depositAmount) {
		this.balance += depositAmount;
		System.out.println("Your new Balance after depositing " + depositAmount +" is " + this.balance);
	}
	
	public void withdraw(double withdrawAmount) {
		if ((this.balance - withdrawAmount) >= 0) {
			this.balance -= withdrawAmount;
			System.out.println("Your new Balance after withdrawing "+ withdrawAmount +" is " + this.balance);
		} 
		else {
			System.out.println("Insufficient funds for withdrawal");
		}
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}		

}
