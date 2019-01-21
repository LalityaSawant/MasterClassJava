package com.challange.inheritance.lsawant;

public class Main {

	public static void main(String[] args) {
		Nissan sentra = new Nissan(1, 180, "SE");
		
		sentra.moving(90);
		System.out.println(sentra.getSpeed());
		System.out.println();//blank line
		sentra.changingGear();
		System.out.println(sentra.getTransmission());
	}

}
