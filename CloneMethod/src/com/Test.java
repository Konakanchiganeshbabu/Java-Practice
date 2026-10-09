package com;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address adr1 = new Address(123456, "Hyderabad");
		Employee emp1 = new Employee(72, "Ganesh", 25000, adr1);
		
		Employee emp2 = (Employee) emp1.clone();
		System.out.println(emp1);
		System.out.println(emp2);
		
		emp1.setEmpId(66);
		emp1.setName("Vasavi");
		emp1.getAddress().setCity("Vijayawada");
		emp1.getAddress().setPinCode(654321);
		emp1.setSalary(30000);
		System.out.println("===========================");
		System.out.println(emp1);
		System.out.println(emp2);
	}
}
