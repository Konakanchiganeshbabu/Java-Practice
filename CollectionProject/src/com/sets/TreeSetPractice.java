package com.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPractice {
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<>();
		t.add(10);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
		
		Iterator<Integer> itr = t.iterator();
		
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(num == 5) {
				itr.remove();
			}
		}
		
		System.out.println(t);
	}
}
