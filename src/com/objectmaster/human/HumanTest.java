package com.objectmaster.human;

import com.objectmaster.wizard.*;


public class HumanTest {

	public static void main(String[] args) {
		Human lilly = new Human();
		Wizard chewie = new Wizard();
		
//		lilly.attack(chewie);
//		System.out.println("Health remaining: " + chewie.getHumanHealth());
		
		chewie.fireball(lilly);
		System.out.println("Health remaining: " + lilly.getHumanHealth());
		
		chewie.heal(lilly);
		System.out.println("Health remaining: " + lilly.getHumanHealth());
	}

}
