package com.multilevelinheritance;

public class Vehicle {
	String brand = "TATA";
	double speed;
	String fuelType = "Diesel";
	
	void start() {
		System.out.println("Vehicle Starts...");
	}
	
	void stop() {
		System.out.println("Vehicle Stops...");
	}
	
	void displayVehicleDetails() {
		System.out.println("Vehicle Details...");
		System.out.println(this.brand + " Car");
		System.out.println(this.speed);
		System.out.println(this.fuelType);
	}
}
