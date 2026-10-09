package com.practice3;

public class Dog extends Animal{
	String name = "Dog";
	int noOfLegs = 4;
	
	public Dog() {
		super();
		System.out.println(super.age);
		super.eat();
		System.out.println("Dogs Constructor...");
	}
	
	void bark() {
		System.out.println("Dog Barks...");
	}
	
	
	void display() {
		System.out.println("Dog details...");
		System.out.println(this.name);
		System.out.println(this.noOfLegs);
		System.out.println(super.name);
		this.bark();
	}
}
