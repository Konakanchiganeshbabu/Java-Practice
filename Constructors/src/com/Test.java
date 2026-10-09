package com;

public class Test {
	public static void main(String[] args) {
		
		Student s1 = new Student("Ganesh", 23, 72);
		System.out.println(s1.name);
		s1.display();
		
		Student s2 = new Student();
		s2.name = "Rohan";
		s2.age = 22;
		s2.clgId = 68;
		
		System.out.println(s2.name);
		s2.display();
	}
}	
