package com.hierarchicalinheritance;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.brand = "TATA";
		c.speed = 270;
		c.fuelType = "diesel";
		
		c.displayCarDetails();
		c.start();
		
		System.out.println("============================");
		
		Bike b = new Bike();
		b.brand = "Yamaha";
		b.speed = 200;
		b.fuelType = "Petrol";
		b.displayBikeDetails();
		b.start();
	}
}
