package practicecom3;

public class Person {
	String name;
	int age;
	String city;
	
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public Person() {
		
	}
	
	void displayDetails() {
		System.out.println("PERSON DETAILS================");
		System.out.println("Person's Name : " + this.name);
		System.out.println("Person's Age : " + this.age);
		System.out.println("Person's City : " + this.city);
	}
	
	void sleep() {
		System.out.println(this.name + " is sleeping...");
	}
	
	void eat() {
		System.out.println(this.name + " is eating...");
	}
}
