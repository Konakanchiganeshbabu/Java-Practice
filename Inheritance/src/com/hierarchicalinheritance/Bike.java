package com.hierarchicalinheritance;

public class Bike extends Vehicle{
	int numberOfWheels = 2;
	String bikeType = "Sports Bike";
	String engineCC = "1000cc";
	
//	void start() {
//		System.out.println("Start the " + this.brand + " bike");
//	}
	
	public Bike() {
		this(4, "Normal", "125");
	}
	
	public Bike(int numberOfWheels, String bikeType, String engineCC) {
		this.numberOfWheels = numberOfWheels;
		this.bikeType = bikeType;
		this.engineCC = engineCC;
	}
	
	
	
	void ride() {
		System.out.println("Riding the bike...");
	}
	
	void applyBrake() {
		System.out.println("Vehicle Stopped...");
	}
	
	void displayBikeDetails() {
		this.displayVehicleDetails();
		System.out.println(this.bikeType);
		System.out.println(this.numberOfWheels);
		System.out.println(this.engineCC);
	}
}
