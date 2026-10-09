package practicecom4;

public class Cat extends Animal{
	String food;
	String color;
	
	public Cat(String food, String color) {
		this.food = food;
		this.color = color;
	}
	
	public Cat() {
		this("Milk", "White");
	}

	void sound() {
		System.out.println(this.color + " Cat sounds meow meow...");
		System.out.println(this.age);
	}

}
