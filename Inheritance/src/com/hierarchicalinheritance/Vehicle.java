package com.hierarchicalinheritance;

public class Vehicle {
	String brand;
	double speed;
	String fuelType;
	
	void start() {
		System.out.println("Vehicle Starts..");
	}
	
	void stop() {
		System.out.println("Vechicle Stops...");
	}
	
	void displayVehicleDetails() {
		System.out.println(this.brand + " Brand");
		System.out.println(this.speed + " Speed");
		System.out.println(this.fuelType);
	}
}

