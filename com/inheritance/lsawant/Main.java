package com.inheritance.lsawant;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("Dogie", 8, 8, 2, 4, 1, 20, "Silky");
		
		dog.eat();
		dog.walk();
		dog.run();
		
		Fish fish = new Fish("Fishy", 2, 2, 2, 2, 2);
		
		fish.swim(3);

	}

}
