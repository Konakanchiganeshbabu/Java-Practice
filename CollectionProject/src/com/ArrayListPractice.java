package com;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		li.add(10);
		li.add(20);
		li.add(15.5);
		li.add(2.3f);
		li.add("Ganesh");
		li.add('A');
		li.add(true);
		
		Student st1 = new Student(1, "Ganesh", 23);
		
		System.out.println(li);
		System.out.println(li.get(0));
		
		li.add(st1);
		System.out.println(li);
//		System.out.println(li.get(7).getName());
		
		Student st = (Student) li.get(7);
		System.out.println(st.getName());
		
		ArrayList<Integer> li2 = new ArrayList<>();
		
		li2.add(10);
		li2.add(20);
		li2.add(30);
		
		System.out.println(li2);
	
		
	}
}
