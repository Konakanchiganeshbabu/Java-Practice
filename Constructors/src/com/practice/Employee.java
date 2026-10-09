package com.practice;

public class Employee {
	static String compName = "Google";
	String empName;
	int empId;
	double salary;
	
	void display() {
		System.out.println("Employee Details");
		System.out.println(Employee.compName);
		System.out.println(this.empName);
		System.out.println(this.empId);
		System.out.println(this.salary);
	}
}
