package com.composition.lsawant;

public class Main {

	public static void main(String args[]) {

		// defining composition class can be done in 2 ways as below 
		Dimensions dimensions = new Dimensions(20, 20, 5); 
		Case theCase = new Case("2200", "Dell", "240V", dimensions); //1
		
		Monitor theMonitor = new Monitor("17Inch", "AMD", 27, new Resolution(2540, 1440)); //2

		Motherboard theMotherboard = new Motherboard("Intel core i7", "Intel", "3 Ram slots", 6, "7th Gen");

		Pc myPc = new Pc(theMonitor, theCase, theMotherboard);
		
		myPc.powerUp();
		
		// this is also one way to use the composition methods
		/*myPc.getTheCase().pressPowerButton();
		myPc.getMotherboard().loadProgram("Windows 10");
		myPc.getMonitor().drawPixelAt(10, 15, "red");*/

	}

}
