package com.challenge.master.oopConcepts.lsawant;

public class Pricing {
	private String name;
	private double price;

	public double getProductPrice(String name) {
		this.name = name;
		switch (this.name.toLowerCase()) {
		case "burger":
			this.price = 5;
			break;
		case "lettuce":
			this.price = 1;
			break;
		case "tomato":
			this.price = 1;
			break;
		case "cucumber":
			this.price = 1;
			break;
		case "onion":
			this.price = 1;
			break;
		case "zukini":
			this.price = 1;
			break;
		case "bellpepper":
			this.price = 1;
			break;
		case "cheese":
			this.price = 1;
			break;
		case "chicken":
			this.price = 2;
			break;
		case "lamb":
			this.price = 3;
			break;
		case "pork":
			this.price = 3;
			break;
		case "drink":
			this.price = 5;
			break;
		case "frys":
			this.price = 5;
			break;
		default:
			this.price = 0;		
			System.out.println(name.toUpperCase() + " NOT AVAILABLE!");
			break;
		}
		if(!getName().equals("unknown")) {
			System.out.println(getName().toUpperCase() + " was charged " + price);	
		}		
		return price;
	}

	public String getName() {
		return name;
	}

}
