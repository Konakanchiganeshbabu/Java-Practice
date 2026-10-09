package com.practice;

public class Student {
	int age;
	static String clgName = "SRM";
	
	void display() {
		System.out.println(clgName);
	}
	
	public static void getAge() {
		System.out.println(clgName);
	}
	
	public static void main(String[] args) {
		getAge();
	}
}
