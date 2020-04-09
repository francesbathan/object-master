package com.objectmaster.wizard;
import com.objectmaster.human.Human;

public class Wizard extends Human {
	int health = 50;
	int intelligence = 8;
	
	public void heal(Human human) {
		human.setHealth(human.getHealth() + this.intelligence);
	}
	
	public void fireball(Human human) {
		human.setHealth(human.getHealth() - (this.intelligence * 3));
	}
}
