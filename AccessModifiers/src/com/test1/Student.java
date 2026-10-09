package com.test1;

public class Student {
//	private int a = 10;
//	
//	private void display() {
//		System.out.println(this.a);
//	}
//	
//	private void hi() {
//		System.out.println("Hi...");
//	}
//	
//	Student() {
//		System.out.println("Hello Student...");
//	}
	
//	int a = 10;
//	
//	void hi() {
//		System.out.println("Hi...");
//	}
	
	protected int a = 10;
	protected void hi() {
		System.out.println("Hi...");
	}
	
	protected Student() {
		System.out.println("Hello Student...");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.a);
		s.hi();
	}
}
