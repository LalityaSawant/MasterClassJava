package com.challenge.composition.lsawant;

public class Furniture {

	private String furnitureName;
	private Dimension dimensions;
	private String material;
	private Location location;

	public Furniture(String furnitureName, Dimension dimensions, String material, Location location) {
		super();
		this.furnitureName = furnitureName;
		this.dimensions = dimensions;
		this.material = material;
		this.location = location;
	}

	public void setFurniture() {
		System.out.println(furnitureName + " placed at location " + location.getLocation());
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public String getMaterial() {
		return material;
	}

}
