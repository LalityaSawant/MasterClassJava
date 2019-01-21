package com.challange.classes.lsawant;

public class BankAccount {
	private String number;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
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
