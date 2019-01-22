package com.challange.master.oopConcepts.lsawant;

public class Burger {
	private String burgerName;
	private String breadRollType;
	private String meat;
	private String additionalItem1 = "unknown";
	private String additionalItem2 = "unknown";
	private String additionalItem3 = "unknown";
	private String additionalItem4 = "unknown";
	private String additionalItem5 = "unknown";
	private String additionalItem6 = "unknown";
	
	public Burger(String burgerName, String breadRollType, String meat) {
		this.burgerName = burgerName;
		this.breadRollType = breadRollType;
		this.meat = meat;
	}
	
	public double getBurgerBasePrice() {
		Pricing price = new Pricing();		
		double burgerBasePrice = price.getProductPrice("burger");
		if(!meat.isEmpty()) {
			burgerBasePrice += price.getProductPrice(meat);
		}		 
		return burgerBasePrice;
	}
	
	public double getBurgerTotalPrice() {
		Pricing price = new Pricing();
		double totalPrice = getBurgerBasePrice()
		+ price.getProductPrice(getAdditionalItem1())
		+ price.getProductPrice(getAdditionalItem2())
		+ price.getProductPrice(getAdditionalItem3())
		+ price.getProductPrice(getAdditionalItem4());		
		return totalPrice;	
	}

	private String getAdditionalItem1() {
		return additionalItem1;
	}

	private String getAdditionalItem2() {
		return additionalItem2;
	}

	private String getAdditionalItem3() {
		return additionalItem3;
	}

	private String getAdditionalItem4() {
		return additionalItem4;
	}
	
	private String getAdditionalItem5() {
		return additionalItem5;
	}
	
	private String getAdditionalItem6() {
		return additionalItem6;
	}

	public void setAdditionalItem1(String additionalItem1) {
		this.additionalItem1 = additionalItem1;
	}

	public void setAdditionalItem2(String additionalItem2) {
		this.additionalItem2 = additionalItem2;
	}

	public void setAdditionalItem3(String additionalItem3) {
		this.additionalItem3 = additionalItem3;
	}

	public void setAdditionalItem4(String additionalItem4) {
		this.additionalItem4 = additionalItem4;
	}
	
	public void setAdditionalItem5(String additionalItem5) {
		System.out.println("Cannot be used for this type of burger");
	}
	
	public void setAdditionalItem6(String additionalItem6) {
		System.out.println("Cannot be used for this type of burger");
	}

	public String getBurgerName() {
		return burgerName;
	}

	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}

	public String getBreadRollType() {
		return breadRollType;
	}

	public void setBreadRollType(String breadRollType) {
		this.breadRollType = breadRollType;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}	
	
	
	
}
