package com.practice;

public class Test {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empName = "Ganesh";
		emp1.empId = 123;
		emp1.salary = 50000;
		
		Employee emp2 = new Employee();
		emp2.empName = "Rohan";
		emp2.empId = 124;
		emp2.salary = 60000;
		
		emp1.display();
		System.out.println("=========================");
		emp2.display();
		
	}
}
