package com.challenge.inheritance.lsawant;

public class Nissan extends Car {
		
	private String subModel;
	private String transmission;
		
	public Nissan(int stearing, int speed, String subModel) {
		super(stearing, "Nissan", speed, "Sentra");
		this.subModel = subModel;
		this.transmission = "automatic";
	}


	@Override
	public void moving(int Speed) {
		System.out.println("Nissan.moving() called");
		super.moving(Speed);
	}
	

	@Override
	public void changingGear() {
		System.out.println("Nissan.ChangingGear() called. AUTOMATIC transmission");
		super.changingGear();
	}


	public String getSubModel() {
		return subModel;
	}
	public String getTransmission() {
		return transmission;
	}
	
	
	

}
