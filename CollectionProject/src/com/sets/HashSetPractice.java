package com.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {
	public static void main(String[] args) {
		
		HashSet<Integer> h = new HashSet<>();
		
		h.add(10);
		h.add(20);
		h.add(null);
		h.add(15);
		
		for(Integer num : h) {
			System.out.println(num);
		}
		
		System.out.println(h);
		
		System.out.println("================================");
		
		Iterator<Integer> itr = h.iterator();
		
		while(itr.hasNext()) {
			Integer num = itr.next();
			if(num == null) {
				itr.remove();
			}
		}
		
		System.out.println(h);
	}
}
