package com.challange.master.oopConcepts.lsawant;

public class DeluxBurger extends Burger {
	private boolean frys;
	private boolean drinks;

	public DeluxBurger(String breadRollType, String meat) {
		super("Delux", breadRollType, meat);
		this.frys = true;
		this.drinks = true;
	}

	@Override
	public double getBurgerTotalPrice() {
		Pricing price = new Pricing();
		double burgerTotalPrice = super.getBurgerTotalPrice() + price.getProductPrice("drink")
				+ price.getProductPrice("frys");
		System.out.println("Total charges for " + super.getBurgerName() + " with " + super.getBreadRollType()
				+ " bread and meat " + super.getMeat() + " is : " + burgerTotalPrice);
		return burgerTotalPrice;
	}

}
