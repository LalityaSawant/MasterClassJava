package com.challenge.inheritance.lsawant;

public class Vehicle {
	
	private String type;
	private int door;
	private int gears;
	private int stearing;
	private String model;
	private int speed;
			
	public Vehicle(String type, int door, int gears, int stearing, String model, int speed) {		
		this.type = type;
		this.door = door;
		this.gears = gears;
		this.stearing = stearing;
		this.model = model;
		this.speed = speed;
	}
		
	public void changingGear() {
		System.out.println("Vehicle.changingGear() called");
	}
	
	public void moving(int speed) {
		System.out.println("Vehicle.moving() called at speed " + speed);
	}
	
	public void handStearing() {
		System.out.println("Vehicle.handStreaing() called");
	}
	
	public String getType() {
		return type;
	}
	public int getDoor() {
		return door;
	}
	public int getGears() {
		return gears;
	}
	public int getStearing() {
		return stearing;
	}
	public String getModel() {
		return model;
	}
	public int getSpeed() {
		System.out.print("max speed ");
		return speed;
	}
	
	
	

}
