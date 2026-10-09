package com.fi;

public class Test {
	public static void main(String[] args) {
		
		//Traditional Way
		Vehicle bike = new Bike();
		bike.start();
		
		
		//anonymous way
		Vehicle car = new Vehicle() {
			@Override
			public void start() {
				System.out.println("Car Started...");
				
			}
		};
		car.start();
		
		//using lambda
		Vehicle lorry = () -> {System.out.println("Lorry read to start..");
								System.out.println("Lorry Started");
								};
		lorry.start();
	}
}
