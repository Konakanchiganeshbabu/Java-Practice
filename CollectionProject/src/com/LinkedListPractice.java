package com;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		
		l.add(10);
		l.add(20);
		l.add(null);
		l.add(30);
		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(num == null) {
				itr.remove();
			}
		}
		
		System.out.println(l);
	}
}
