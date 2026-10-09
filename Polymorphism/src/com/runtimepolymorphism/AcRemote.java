package com.runtimepolymorphism;

public class AcRemote extends Remote{
	int temp = 18;
	
	public void increaseTemp() {
		temp++;
		System.out.println("Temperature : " + this.temp);
	}
	
	@Override
	void turnOn() {
		System.out.println("Turning On AcRemote...");
	}
	
}
