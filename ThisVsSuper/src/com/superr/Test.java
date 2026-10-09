package com.superr;

public class Test {
	public static void main(String[] args) {
		Dog d = new Dog();
		
		System.out.println(d.name);
		d.eat();
		System.out.println("======================");
		d.display();
		System.out.println("======================");
		d.fullDetails();
	}
}
