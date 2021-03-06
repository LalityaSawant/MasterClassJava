package com.encapsulation.lsawant;

public class EnhancedPlayer {
	private String name;
	private int playerHealth = 100;
	private String weapon;
	
	public EnhancedPlayer(String name, int health, String weapon) {
		this.name = name;
		if (health >0 && health <= 100) {
			this.playerHealth = health;	
		}		
		this.weapon = weapon;
	}
	
	public void loseHealth(int damage) {
		this.playerHealth = this.playerHealth - damage;
		if (this.playerHealth <= 0) {
			System.out.println("Player knocked out");
			// Reduce number of lives remaining for the player
		}
	}
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return playerHealth;
	}
	public String getWeapon() {
		return weapon;
	}
	
	

}
