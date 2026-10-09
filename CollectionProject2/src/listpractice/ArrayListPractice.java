package listpractice;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList li = new ArrayList();
		
		Student s = new Student("Ganesh", 23, 72);
		
		li.add(10);
		li.add(20);
		li.add(true);
		li.add(null);
		li.add(null);
		li.add("Ganesh");
		li.add(12.5);
		li.add(s);
		li.add(2, 30);
		li.set(2, 25);
		
		System.out.println(li);
		System.out.println(li.indexOf(s));
		System.out.println(li.get(8));
		
		Object obj = li.get(8);
		System.out.println(obj);
		
		Student st = (Student) li.get(8);
		System.out.println(st);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getId());
	}
}
