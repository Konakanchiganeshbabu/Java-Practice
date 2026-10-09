package com.fi2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student(1, "Ganesh", 72));
		studentsList.add(new Student(2, "Vasavi", 68));
		studentsList.add(new Student(3, "Arjun", 90));
		studentsList.add(new Student(4, "Mahesh", 54));
		studentsList.add(new Student(5, "Raju", 62));
		
		System.out.println(studentsList);
		
		
		//Sorting based on id's
		Collections.sort(studentsList, (st1, st2) -> st1.studentId - st2.studentId);
		System.out.println(studentsList);
		
		Collections.sort(studentsList, (st1, st2) -> st1.makrs - st2.makrs);
		System.out.println(studentsList);
		
	}
}
