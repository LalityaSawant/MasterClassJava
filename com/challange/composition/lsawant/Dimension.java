package com.challange.composition.lsawant;

public class Dimension {

	private int width;
	private int length;
	private int height;
	private String shape;

	public Dimension(int width, int length, int height, String shape) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
		this.shape = shape;
	}

	public int getSqfeet() {
		int sqfeet = width * height * length;
		return sqfeet;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	public String getShape() {
		return shape;
	}

}
