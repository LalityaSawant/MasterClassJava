package com.pollymorphism.lsawant;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}

}

class Jaws extends Movie {
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "Shark eats lots of people";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("IndependenceDay");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie {
	public MazeRunner() {
		super("MazeRunner");
	}

	@Override
	public String plot() {
		return "Kids try and escape Maze";
	}
}

class StartWars extends Movie {
	public StartWars() {
		super("StartWars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to takeover unniverse";
	}
}

class ForgettableMovie extends Movie {
	public ForgettableMovie() {
		super("ForgettableMovie");
	}
	// No plot method
}

public class Main {

	public static void main(String[] args) {
		/*
		 * Explaining myself
		 */
		Movie movie1 = new Movie("IndependenceDay");
		System.out.println("Movie: " + 
                movie1.getName() + "\n" + 
	            "Plot: " + movie1.plot() + "\n");
		
		IndependenceDay movie2 = new IndependenceDay();
		System.out.println("Movie: " + 
                movie2.getName() + "\n" + 
	            "Plot: " + movie2.plot() + "\n");
		
		/*
		 * actual example
		 */
		for (int i = 1; i < 11; i++) {
			Movie movie = randoMmovie();
			System.out.println("Movie #" + i + " : " + 
			                    movie.getName() + "\n" + 
					            "Plot: " + movie.plot() + "\n");
		}
	}

	public static Movie randoMmovie() {
		int randomnNumber = (int) (Math.random() * 5) + 1;
		System.out.println("Random Number Generated was " + randomnNumber);
		switch (randomnNumber) {
		case 1:
			return new Jaws();

		case 2:
			return new IndependenceDay();

		case 3:
			return new MazeRunner();

		case 4:
			return new StartWars();

		case 5:
			return new ForgettableMovie();
		}

		return null;
	}
}
