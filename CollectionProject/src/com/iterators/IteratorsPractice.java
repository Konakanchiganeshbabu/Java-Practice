package com.iterators;

import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.ListIterator;

public class IteratorsPractice {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(40);
		
		li.add(2, 30);
		
		li.add(null);
		li.add(1, null);
		
		System.out.println(li);
		
	}
}
