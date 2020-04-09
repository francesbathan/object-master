package com.objectmaster.samurai;
import com.objectmaster.human.Human;


public class Samurai extends Human {
	
	private static int samuraiCounter;
	
	int health = 200;
	
	public Samurai() {
		samuraiCounter++;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public void deathBlow(Human human) {
		human.setHealth(0);
		this.health = this.health / 2;
	}
	
	public void meditate() {
		health = this.health + (this.health / 2);
	}
	
	public int howMany() {
		return samuraiCounter;
	}
	
}
