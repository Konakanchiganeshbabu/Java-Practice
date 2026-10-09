package listpractice.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListPractice1 {
	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(null);
		li.add(20);
		li.add(30);
		li.add(null);
		
		System.out.println(li);
		
		ListIterator<Integer> itr = li.listIterator();
		
		while(itr.hasNext()) {
			Integer val = itr.next();
			if(val == null) {
				itr.remove();
			}
		}
		
		System.out.println(li);
	}
}
