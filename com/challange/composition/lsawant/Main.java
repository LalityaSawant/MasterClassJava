package com.challange.composition.lsawant;

import com.composition.lsawant.Dimensions;

public class Main {

	public static void main(String[] args) {
		
		Room bedroom = new Room("bedroom", new Dimension(12, 11, 10, "rectangle"), 4, 4, new Furniture("bed", new Dimension(6, 7, 3, "rectangle"), "wood", new Location(3, 1)));

		bedroom.setRoom();
		
		

	}

}
