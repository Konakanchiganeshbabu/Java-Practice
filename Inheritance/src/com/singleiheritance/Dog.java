package com.singleiheritance;

public class Dog extends Animal{
	int age;
	
	void barks() {
		System.out.println("The Dog barks...");
	}
	
	void display() {
		System.out.println("Animal Details...");
		System.out.println(this.name);
		System.out.println(this.age);
	}
}
