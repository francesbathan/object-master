package com.objectmaster.human;

public class Human {
	int strength = 3;
	int stealth = 3;
	int intelligence = 3;
	private int health = 100;
	
	public int getHumanHealth() {
		return health;
	}

	public void setHumanHealth(int health) {
		this.health = health;
	}

	public void attack(Human human) {
		human.setHumanHealth(human.getHumanHealth() - this.strength);
	}
}
