package com;

public class Student implements Comparable<Student>{
	public int studentId;
	public String name;
	public int marks;
	
	public Student(int studentId, String name, int marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student student) {
		return this.studentId - student.studentId;
	}
	
	
	
}
