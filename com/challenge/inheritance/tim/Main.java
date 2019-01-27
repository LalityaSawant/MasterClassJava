package com.challenge.inheritance.tim;

public class Main {
	
	public static void main(String args[]) {
		Nissan nissan = new Nissan(36);
		nissan.steer(30);
		nissan.accelerate(30);
		nissan.accelerate(20);
		nissan.steer(10);
		nissan.accelerate(-42);
		nissan.stop();
	}

}
