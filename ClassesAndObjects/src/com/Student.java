package com;

public class Student {
	static String clgName = "SRM";
	String name;
	int age;
	
	void study() {
		System.out.println("Student is studying...");
	}
	
	void exam() {
		System.out.println(this.name + " is writing the exam...");
	}
	
	void display() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(Student.clgName);
	}
}

