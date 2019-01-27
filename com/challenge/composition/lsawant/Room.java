package com.challenge.composition.lsawant;

public class Room {

	private String name;
	private Dimension roomDimension;
	private int noOfDoors;
	private int walls;
	private Furniture furniture;
	
	public Room(String name, Dimension roomDimension, int noOfDoors, int walls, Furniture furniture) {
		super();
		this.name = name;
		this.roomDimension = roomDimension;
		this.noOfDoors = noOfDoors;
		this.walls = walls;
		this.furniture = furniture;
	}
	
	public void setRoom() {
		System.out.println(walls + " Walls and " + noOfDoors + " doors build for size of room " + roomDimension.getSqfeet() + " sqfeets.");
		furniture.setFurniture();
	}
	
}