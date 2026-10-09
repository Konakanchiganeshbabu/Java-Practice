package com;

public class Student {
	String name;
	int age;
	int clgId;
	
	public Student(String name, int age, int clgId) {
		this.name = name;
		this.age = age;
		this.clgId = clgId;
	}
	
	
	public Student() {
		System.out.println("HI...");
	}
	
	
	void display() {
		System.out.println("Student Details_________________________");
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.clgId);
	}
	
}
