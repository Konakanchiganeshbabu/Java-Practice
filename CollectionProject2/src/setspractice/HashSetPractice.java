package setspractice;

import java.util.*;
public class HashSetPractice {
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add(10);
		h.add(20);
		h.add("Ganesh");
		h.add(112.5);
		h.add(null);
		h.add(10);
		
		System.out.println(h);

		Iterator itr = h.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
