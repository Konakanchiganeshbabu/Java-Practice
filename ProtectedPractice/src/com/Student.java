package com;

public class Student {
	public int studentId;
	public String name;
	public int age;
	
	public Student() {
		
	}
	
	public Student(int studentId, String name, int age) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
	}
	
	protected void getName() {
		System.out.println(this.name);
	}
	
	protected void getId() {
		System.out.println(this.studentId);
	}
	
	protected void getAge() {
		System.out.println(this.age);
	}
	
	public static void bye() {
		System.out.println("Byee...");
	}
	
	protected static void hi() {
		System.out.println("Hi...");
	}
	
}
