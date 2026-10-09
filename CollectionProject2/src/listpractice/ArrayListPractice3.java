package listpractice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListPractice3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(null);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		ListIterator<Integer> itr = li.listIterator();
		
		while(itr.hasNext()) {
			Integer num = itr.next();
			int index = li.indexOf(num);
			if(index == 1) {
				itr.set(15);
			}
			
		}
		
		System.out.println(li);
	}
}
