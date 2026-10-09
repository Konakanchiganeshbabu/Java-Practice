package com.compiletimepolymorphism;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public float prod(int a, float b) {
		return a*b;
	}
	
	public double prod(double a, double b, double c) {
		return a*b*c;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		System.out.println(c.add(5, 5));
		System.out.println(c.add(5, 10, 10));
		System.out.println(c.prod(2, 5.0f));
		System.out.println(c.prod(2, 3, 5));
	}
}	
