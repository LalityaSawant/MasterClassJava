package com.challange.master.oopConcepts.lsawant;

public class HealthyBurger extends Burger {

	private String additionalItem5 = "unknown";
	private String additionalItem6 = "unknown";

	public HealthyBurger(String meat) {
		super("Healthy", "Brown Bun", meat);
		this.additionalItem5 = additionalItem5;
		this.additionalItem5 = additionalItem6;
	}

	public String getAdditionalItem5() {
		return additionalItem5;
	}

	public void setAdditionalItem5(String additionalItem5) {
		this.additionalItem5 = additionalItem5;
	}

	public String getAdditionalItem6() {
		return additionalItem6;
	}

	public void setAdditionalItem6(String additionalItem6) {
		this.additionalItem6 = additionalItem6;
	}

	@Override
	public double getBurgerTotalPrice() {
		Pricing price = new Pricing();
		double burgerTotalPrice = super.getBurgerTotalPrice() + price.getProductPrice(getAdditionalItem5())
				+price.getProductPrice(getAdditionalItem6());
		System.out.println("Total charges for " + super.getBurgerName() + " with " + super.getBreadRollType()
				+ " bread and meat " + super.getMeat() + " is : " + burgerTotalPrice);
		return burgerTotalPrice;
	}

}
