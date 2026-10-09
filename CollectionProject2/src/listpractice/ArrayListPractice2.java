package listpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(60);
		li.remove(4);
		
		li.add(50);
		
		System.out.println(li);
		
		Iterator<Integer> itr = li.iterator();
		while(itr.hasNext()) {
			Integer num = itr.next();
			int index = li.indexOf(num);
			if(index == 4) {
				itr.remove();
			}
		}
		
		System.out.println(li);
		
	}
}
