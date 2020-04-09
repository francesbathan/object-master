package com.objectmaster.ninja;
import com.objectmaster.human.Human;

public class Ninja extends Human {
	int stealth = 10;
	
	public void setNinjaHealth(int health) {
		this.health = health;
	}
	
	public int getNinjaHealth() {
		return health;
	}
	
	public void steal(Human human) {
		human.setHealth(human.getHealth() - this.stealth);
		setNinjaHealth(getNinjaHealth() + this.stealth);
	}
	
	public void runAway() {
		setNinjaHealth(getNinjaHealth() - 10);
	}
}

