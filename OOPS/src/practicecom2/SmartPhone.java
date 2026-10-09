package practicecom2;

public class SmartPhone extends Mobile{
	String cameraMP;
	String batteryCapacity;
	String operatingSystem;
	boolean has5G;
	boolean fingerprintSensor;
	
	public SmartPhone(String phCameraMP, String phBatteryCapacity, String phOperatingSystem, boolean phHas5G, boolean phFingerprintSensor) {
		cameraMP = phCameraMP;
		batteryCapacity = phBatteryCapacity;
		operatingSystem = phOperatingSystem;
		has5G = phHas5G;
		fingerprintSensor = phFingerprintSensor;
	}
	
	public SmartPhone() {
		
	}
	
	void takePhoto() {
		System.out.println("Clicking photo...");
	}
	
	void browseInternet() {
		System.out.println("Searching about something in the browser...");
	}
	
	void installApp() {
		System.out.println("Installing the app...");
	}
	
	void displaySmartFeatures() {
		System.out.println();
		System.out.println("Mobile Smart Features======================");
		System.out.println("cameraMP : " + cameraMP);
		System.out.println("batteryCapacity : " + batteryCapacity);
		System.out.println("operatingSystem : " + operatingSystem);
		System.out.println("has5G : " + has5G);
		System.out.println("fingerprintSensor : " + fingerprintSensor);
		System.out.println("===========================================");
	}

}
