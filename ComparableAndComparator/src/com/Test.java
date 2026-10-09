package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student(72, "Ganesh", 97));
		studentsList.add(new Student(66, "Rohan", 82));
		studentsList.add(new Student(23, "Vasu", 92));
		studentsList.add(new Student(45, "komali", 87));
		
		Collections.sort(studentsList);
		
		System.out.println(studentsList);
		
	}
}
