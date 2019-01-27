package com.challenge.inheritance.tim;

public class Vehicle {
	
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currrentDirection;
	
	public Vehicle (String name, String size) {
		this.name = name;
		this.size = size;
		
		this.currentVelocity = 0;
		this.currrentDirection = 0;
	}
	
	public void steer(int direction) {
		this.currrentDirection += direction;
		System.out.println("Vehicle.steer(): steering at " + currrentDirection + " degrees.");
	}
	
	public void move(int velocity, int direction) {
		this.currentVelocity= velocity;
		this.currrentDirection = direction;
		
		System.out.println("Vehicle.move(): moving at " + currentVelocity + " velocity in "+ currrentDirection + " direction");
		
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}

	public int getCurrentVelocity() {
		return currentVelocity;
	}

	public int getCurrrentDirection() {
		return currrentDirection;
	}	
	
	public void stop() {
		this.currentVelocity = 0;
		System.out.println("Vechle.stop(): velocity " + getCurrentVelocity() + " direction " +  getCurrrentDirection());
	}
		
}
