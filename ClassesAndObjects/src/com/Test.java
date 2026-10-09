package com;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.name = "Ganesh";
		s1.age = 23;
		System.out.println(Student.clgName);
		s1.study();
		s1.exam();
		System.out.println("======================");
		s1.display();
		
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Student s2 = new Student();
		s2.name = "Rohan";
		s2.age = 22;
		s2.study();
		System.out.println(Student.clgName);
		s2.exam();
		System.out.println("====================");
		s2.display();
//		
//		s2.clgName ="VIT";
//		System.out.println(s1.clgName);
//		System.out.println(s2.clgName);
		
	}
}
