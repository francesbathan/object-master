package com.objectmaster.human;

import com.objectmaster.wizard.*;
import com.objectmaster.ninja.*;
import com.objectmaster.samurai.*;


public class HumanTest {

	public static void main(String[] args) {
		Human lilly = new Human();
		Wizard smooch = new Wizard();
		Ninja chewie = new Ninja();
		Samurai artie = new Samurai();
		Samurai zapatos = new Samurai();
		Samurai girlsam = new Samurai();
		
		System.out.println(artie.howMany());
		
		lilly.attack(chewie);
		System.out.println("Lilly attacked Chewie! Chewie now has " + chewie.getHealth() + " remaining health.");
		
		smooch.heal(chewie);
		System.out.println("Smooch healed Chewie. Chewie now has " + chewie.getHealth() + " health");
		
		smooch.fireball(artie);
		System.out.println("Smooch threw a fireball at Artie! Artie now has " + artie.getHealth() + " remaining health.");
		
		artie.deathBlow(smooch);
		System.out.println("Artie delivered a death blow to Smooch! Smooch now has " + smooch.getHealth() + " health. Goodbye. Artie's health is now at " + artie.getHealth() + ".");
	
		artie.meditate();
		System.out.println("Artie travels halfway around the world to heal. Artie now has " + artie.getHealth() + " health.");
		
		lilly.attack(zapatos);
		lilly.attack(zapatos);
		System.out.println("Lilly attacked Zapatos! Zapatos now has " + zapatos.getHealth() + " remaining health.");
	}
}
