package com.inheritance.lsawant;

//Extends keyword is used to inherit from Animal(parent) class
public class Dog extends Animal {
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	/*
	 * for having dog constructor we have to initialize all parameters for this class as a well as its parent class
	 * also we can define default values for few parent class variables while initializing its value through super key word as shown below
	 */
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight); // super key word is used to call for the fields or method or constructor from the class we are extending -- here Animal
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	/*
	 * super keyword will always go to parent class and call its method
	 * even if we override in this calls it will go to parent call
	 * so we may or may not use super key word depending on what we need to do example here are two methods walk and run 
	 */
	
	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(5);
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	private void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}

	/*
	 *  while over riding method as below it is important to use "super" key word
	 *  as not using the keywords it will call the same method (from child class) over and over again making it recursive call
	 *  until the memory is fully used  (Note- **this is harmful in programing if complete memory is used) 
	 */
	
   @Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
	
	

}
