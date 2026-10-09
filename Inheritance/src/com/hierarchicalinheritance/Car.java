package com.hierarchicalinheritance;

public class Car extends Vehicle{
	int numberOfDoors = 4;
	String carType = "Tata Punch";
	double price = 1000000;
	
	void start() {
		System.out.println("Start the " + this.brand + " car" );
	}
	
	void drive() {
		System.out.println("Drive the car...");
	}
	
	
	void openDoors() {
		System.out.println("Open the doors...");
	}
	
	void displayCarDetails() {
		this.displayVehicleDetails();
		System.out.println(this.numberOfDoors + " No of doors");
		System.out.println(this.carType);
		System.out.println(this.price + " rs");
	}
}
