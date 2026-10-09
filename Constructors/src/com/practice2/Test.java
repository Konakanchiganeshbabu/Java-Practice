package com.practice2;

public class Test {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empName = "Ganesh";
		emp1.empId = 123;
		emp1.salary = 100000;
		emp1.display();
		
		System.out.println("=============================");
		
		Employee emp2 = new Employee("Rahul", 125, 200000);
		emp2.display();
	}
}
