package com;

public class Cat extends Animal{
	int numOfLegs;
	String name;
	
	void run() {
		System.out.println("Cat is Running...");
	}
	
	Cat(int numOfLegs, String name){
		this.numOfLegs = numOfLegs;
		this.name = name;
	}
	
	Cat(){
		this(4, "Leo");
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
