package com.challange.pollymorphism.lsawant;

class Car {
	private boolean engine;
	private int cylinders;
	private int wheels;
	private String name;
	
	public Car(String name,boolean engine) {
		this.engine = engine;
		this.cylinders = 6;
		this.wheels = 4;
		this.name = name;
	}
	
	public String startengine() {
		return "Car.startengine()";
	}
	
	public String accelerate() {
		return "Car.accelerate()";
	}
	
	public String brake() {
		return "Car.brake()";
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public int getWheels() {
		return wheels;
	}

	public String getName() {
		return name;
	}	
}

class Nissan extends Car{
	private String ModelName;

	public Nissan() {
		super("Nissan", true);
		ModelName = "Sentra";
	}
	
	private String getModelName() {
		return ModelName;
	}		

	public String startengine() {
		return "Nissan.startengine()";
	}
	
	public String accelerate() {
		return "Nissan.accelerate()";
	}
	
	public String brake() {
		return "Nissan.brake()";
	}	
}

class Honda extends Car{
	private String ModelName;

	public Honda() {
		super("Honda", true);
		ModelName = "Civic";
	}
	
	private String getModelName() {
		return ModelName;
	}	

	public String startengine() {
		return "Honda.startengine()";
	}
	
	public String accelerate() {
		return "Honda.accelerate()";
	}
	
	public String brake() {
		return "Honda.brake()";
	}	
}

class Toyota extends Car{
	private String ModelName;

	public Toyota() {
		super("Toyota", true);
		ModelName = "Corola";
	}

}

public class Main {

	public static void main(String[] args) {
		for (int i =1; i < 11; i ++) {
			Car car = randomCar();
			System.out.println("Cars# " + i + " " + car.getName() +" " + car.startengine() + " " +car.accelerate() + " " + car.brake() + "\n");
		}

	}
	
	public static Car randomCar() {
		int randomCar = (int) (Math.random() * 3) + 1;
		//System.out.println("Random Number Generated was " + randomnCar);
		switch (randomCar) {
		case 1:
			return new Nissan();

		case 2:
			return new Honda();

		case 3:
			return new Toyota();

		}
		return null;
	}
}


