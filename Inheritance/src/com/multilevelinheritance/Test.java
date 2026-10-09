package com.multilevelinheritance;

public class Test {
	public static void main(String[] args) {
		ElectricCar e = new ElectricCar();
		e.displayBatteryDetails();
		e.showRange();
		e.displayCarDetails();
		e.displayVehicleDetails();
	}
}
