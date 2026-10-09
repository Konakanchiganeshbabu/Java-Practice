package practicecom3;

public class Test1 {
	public static void main(String[] args) {
		Employee employee1 = new Employee("TM123", "Software Development", 100000);
		employee1.name = "Ganesh";
		employee1.age = 23;
		employee1.city = "Hyderabad";
		employee1.displayDetails();
		
		employee1.showParentDetails();
	}
}
