package com.runtimepolymorphism;

public class Test {
	public static void main(String[] args) {
		TvRemote t = new TvRemote();
		t.turnOn();
		t.increaseVolume();
		
		AcRemote ac = new AcRemote();
		ac.turnOn();
		ac.increaseTemp();
		
		Remote r = new Remote();
		r.turnOn();
	}
}
