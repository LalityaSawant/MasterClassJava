package com.encapsulation.lsawant;

public class Main {

	public static void main(String[] args) {

		/*
		 * Encapsulation - allows to restricts access to certain components in the created object
		 * its not security only hiding inner working logic
		 */
		
/*		Player player = new Player();
		
		//player.name = "Tim";// changing internal name to full name in class will affect at this place if its public and called directly from here
		player.fullname = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaing health " + player.healthRemaining());
		
		damage = 11;
		//player.health = 200; // this can be over written if the class has public modifier
		player.loseHealth(damage);
		System.out.println("Remaing health " + player.healthRemaining());
*/
		
		EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
		System.out.println("Initial health of the player is " + player.getHealth());
	}

}
