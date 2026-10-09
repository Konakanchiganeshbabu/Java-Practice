package com.multilevelinheritance;

public class ElectricCar extends Car{
	float batteryCapacity = 100.0f;
	int chargingTime = 80;
	double range = 220;
	
	void charge() {
		System.out.println("Car is Charging...");
	}
	
	void displayBatteryDetails() {
		System.out.println(this.batteryCapacity + "%");
		System.out.println(this.chargingTime + "Min");
	}
	
	void showRange() {
		System.out.println(this.range + "km");
	}
	
}
