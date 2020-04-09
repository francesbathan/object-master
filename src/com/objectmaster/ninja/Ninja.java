package com.objectmaster.ninja;
import com.objectmaster.human.Human;

public class Ninja {
	int stealth = 10;
	
	public void steal(Human human) {
		human.setHumanHealth(human.getHumanHealth() + this.stealth);
		setHumanHealth = this.stealth + this.stealth;
	}
	
//	public void fireball(Human human) {
//		human.setHumanHealth(human.getHumanHealth() - (this.intelligence * 3));
//	}
}

