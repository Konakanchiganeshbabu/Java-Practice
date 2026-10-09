package com.practice2;

public class Employee {
	static String compName = "TCS";
	
	String empName;
	int empId;
	double salary;
	
	public Employee(String empName, int empId, double salary) {
		this.empName = empName;
		this.empId = empId;
		this.salary = 50000;
	}
	
	public Employee() {
		
	}
	
	public void display() {
		System.out.println("Employee Details....");
		System.out.println(Employee.compName);
		System.out.println(this.empName);
		System.out.println(this.empId);
		System.out.println(this.salary);
	}
}
