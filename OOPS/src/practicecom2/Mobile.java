package practicecom2;

public class Mobile {
	String brand;
	String model;
	long price;
	String ram;
	String storage;
	
	public Mobile(String phBrand, String phModel, long phPrice, String phRam, String phStorage) {
		brand = phBrand;
		model = phModel;
		price = phPrice;
		ram = phRam;
		storage = phStorage;
	}
	
	public Mobile() {
		
	}
	
	void call() {
		System.out.println("Calling...");
	}
	
	void sendMsg() {
		System.out.println("Sending msg...");
	}
	
	void chargePhone() {
		System.out.println("Phone is in charge");
	}
	
	void displayPhoneDetails() {
		System.out.println();
		System.out.println("Phone Details======================");
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println("Ram : " + ram);
		System.out.println("Storage : " + storage);
		System.out.println("====================================");
	}
	
}

