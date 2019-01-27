package com.challenge.encapsulation.lsawant;

public class Main {

	public static void main(String[] args) {
		Printer myPrinter = new Printer("Epson", 100, true);
		
		myPrinter.printJob(50, false);
		myPrinter.printJob(50, true);
		myPrinter.printJob(24, false);
		myPrinter.printJob(1, false);
		myPrinter.printJob(1, false);
		myPrinter.fillToner(150);		
		myPrinter.fillToner(100);
		myPrinter.printJob(200, true);
		myPrinter.printJob(1, false);
	}
}
