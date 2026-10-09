package com;

public class Test1 {
	public static void main(String[] args) {
		
		Animal cat= new Animal();
		cat.name = "Cat";
		cat.color = "White";
		cat.canMakeSound = true;
		cat.noOfLegs = 4;
		
		System.out.println(cat.name);
		System.out.println(cat.color);
		System.out.println(cat.canMakeSound);
		System.out.println(cat.noOfLegs);
		
		cat.eating();
		cat.running();
		cat.sound("Meow Meow");
		
		System.out.println("----------------------------------");
		
		Animal animal2 = new Animal();
		animal2.name = "Cow";
		animal2.color = "White";
		animal2.canMakeSound = true;
		animal2.noOfLegs = 4;
		
		System.out.println(animal2.name);
		System.out.println(animal2.color);
		System.out.println(animal2.canMakeSound);
		System.out.println(animal2.noOfLegs);
		
		animal2.eating();
		animal2.running();
		animal2.sound("Amba Amba");
		
	}
	
}
