package com.superr;

public class Dog extends Animal{
	String name = "Dog";
	
	void eat() {
		System.out.println("Dog eats...");
	}
	
	void display() {
		super.eat();
	}
	
	void fullDetails() {
		System.out.println(this.name);
		System.out.println(super.name);
		super.eat();
		this.eat();
	}
}
