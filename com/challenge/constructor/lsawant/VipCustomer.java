package com.challenge.constructor.lsawant;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	public VipCustomer() {
		this("Deafult Name",10000,"deafultEmail@default.com");
	}
	
	public VipCustomer(String name,String email) {
		this(name,20000,email);
	}
	
	public VipCustomer(String name,double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
		
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	

}
