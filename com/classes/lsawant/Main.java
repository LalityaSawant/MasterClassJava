package com.classes.lsawant;

public class Main {

	public static void main(String[] args) {

		/*
		 * Creating car object nissan on template Car
		 * initializing with "new" key world
		 */
		Car nissan = new Car();
		nissan.color = "Red"; // just for example but not a good way to assign values
		
		System.out.println(nissan.getModel()); // null i default state of car , so before we set and try to get its value its will be null for string and 0 for int 0.0 for double
		nissan.setModel("Sentra"); // correct way to assign values or passing values to class object		
		System.out.println("Model is " + nissan.getModel()); // getting the assigned value from form get method which was set by set method
		
		//trying neagtive test for assignment
		nissan.setModel("Corola");		
		System.out.println("Model is " + nissan.getModel()); 
	}
}
