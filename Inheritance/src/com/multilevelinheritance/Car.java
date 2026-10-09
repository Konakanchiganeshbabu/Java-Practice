package com.multilevelinheritance;

public class Car extends Vehicle{
	int numberOfDoors = 4;
	String carType = "Sierra";
	double price = 1500000;
	
	void drive() {
		System.out.println("Car is driving...");
	}
	
	void openDoors() {
		System.out.println("Open the doors...");
	}
	
	void displayCarDetails() {
		System.out.println(this.carType);
		System.out.println(this.numberOfDoors + " Doors");
		System.out.println(this.price + " rs");
	}
}
