package practicecom2;

public class Test1 {
	public static void main(String[] args) {
		Mobile mobObj = new Mobile("ASUS", "ROG Phone 8", 79999, "16 GB", "512 GB");
		SmartPhone smPhObj = new SmartPhone("50 MP", "6000 mAh", "Android 15", true, true);
		GamingPhone gamePhObj = new GamingPhone("165 Hz", "AeroActive Cooling", "Air Triggers", "Adreno 750", "X Mode");
		
		System.out.println(mobObj.brand);
		System.out.println(smPhObj.batteryCapacity);
		
		gamePhObj.displayPhoneDetails();
		gamePhObj.displaySmartFeatures();
		gamePhObj.call();
	}
}
