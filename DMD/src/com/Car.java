package com;

public class Car extends Vehicle{
	
	@Override
	public void start() {
		System.out.println("Car Starts..");
	}
	
	public void fuelType() {
		System.out.println("Petrol...");
	}
}
