package com.practice3;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	public Animal() {
		System.out.println("Animal Constructor...");
	}
	
	void eat() {
		System.out.println("Animal eats");
	}
}
