package com.runtimepolymorphism;

public class TvRemote extends Remote{
	int volume;
	
	void increaseVolume() {
		volume++;
		System.out.println("Volume : " + this.volume);
	}
	
	@Override
	void turnOn() {
		System.out.println("Turning On TvRemote...");
	}
}
