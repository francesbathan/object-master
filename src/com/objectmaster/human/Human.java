package com.objectmaster.human;

public class Human {
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	public int health = 100;
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void attack(Human human) {
		human.setHealth(human.getHealth() - this.strength);
	}
}
