package com.composition.lsawant;

/*
 * Below is an example of Composition
 * PC - has a monitor, has a case, has a mother board
 * this is also called as "has a" relationship or composition
 * and inheritance is called "is a" relationship or parent child relationship or inheritance
 */
public class Pc {
	private Monitor monitor;
	private Case theCase;
	private Motherboard motherboard;
	
	public Pc(Monitor monitor, Case theCase, Motherboard motherboard) {
		this.monitor = monitor;
		this.theCase = theCase;
		this.motherboard = motherboard;
	}
	
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
	
	private void drawLogo() {
		// Fancy graphics
		monitor.drawPixelAt(1200, 50, "yellow");
	}

	/*
	 * these are not required unless we have any validation in these getters required
	 * removing this make code less complex . so use only if required
	 */
	/*  private Monitor getMonitor() {
		return monitor;
	}

	private Case getTheCase() {
		return theCase;
	}

	private Motherboard getMotherboard() {
		return motherboard;
	}*/
		
}
