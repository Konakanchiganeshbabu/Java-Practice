package setspractice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		
		l.add(50);
		l.add(10);
		l.add(10);
		l.add(null);
		l.add(null);
		l.add(20);
		l.add(30);
		
		System.out.println(l);
		
		Iterator<Integer> itr = l.iterator();
		
		while(itr.hasNext()) {
			Integer val = itr.next();
			if(val == null) {
				itr.remove();
			}
		}
		
		System.out.println(l);
	}
}
