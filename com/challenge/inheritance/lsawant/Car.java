package com.challenge.inheritance.lsawant;

public class Car extends Vehicle{
	
	private String name;

	public Car(int stearing, String model, int speed, String name) {
		super("Car", 4, 6, stearing, model, speed);
		this.name = name;
	}		
	
	@Override
	public void moving(int speed) {
		System.out.println("Car.moving() called");
		super.moving(speed);
	}

	public String getName() {
		return name;
	}	

}
