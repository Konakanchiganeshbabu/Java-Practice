package com;

public class Animal {
	String name;
	String color;
	int noOfLegs;
	boolean canMakeSound;
	
	void eating() {
		System.out.println(name + " is eating...");
	}
	
	void running() {
		System.out.println(name + " is running...");
	}
	
	void sound(String animalSound) {
		System.out.println(name + " Sounds like " + animalSound + "...");
	}
}
