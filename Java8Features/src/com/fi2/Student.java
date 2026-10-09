package com.fi2;

public class Student {
	int studentId;
	String name;
	int makrs;
	
	
	public Student(int studentId, String name, int makrs) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.makrs = makrs;
	}
	
	public Student(){
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", makrs=" + makrs + "]";
	}
	
	
	
	
}
