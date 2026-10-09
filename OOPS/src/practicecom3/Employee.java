package practicecom3;

public class Employee extends Person{
	String employeeId;
	String department;
	double salary;
	
	public Employee(String employeeId, String department, double salary) {
		this.employeeId = employeeId;
		this.department = department;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	
	void displayDetails() {
//		System.out.println("PERSON DETAILS=====================");
//		System.out.println("Person Name : " + this.name);
//		System.out.println("Person Age : " + this.age);
//		System.out.println("Person City : " + this.city);
		super.displayDetails();
		System.out.println();
		System.out.println("PERSONS EMPLOYEE DETAILS===========");
		System.out.println("Employee ID : " + this.employeeId);
		System.out.println("Employee Department : " + this.department);
		System.out.println("Employee Salary : " + this.salary);
		System.out.println("====================================");
	}
	
	void work() {
		System.out.println(this.name + " Is working...");
	}
	
	void attendMeeting() {
		System.out.println(this.name + " Is attending the meeting...");
	}
	
	void showParentDetails() {
		super.displayDetails();;
	}

}
