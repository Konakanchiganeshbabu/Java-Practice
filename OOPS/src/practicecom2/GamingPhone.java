package practicecom2;

public class GamingPhone extends SmartPhone{
	String refreshRate;
	String coolingSystem;
	String triggerButtons;
	String gpuName;
	String gameMode;
	
	public GamingPhone(String phRefreshRate, String phCoolingSystem, String phtTriggerButtons, String phGpuName, String phGameMode) {
		refreshRate = phRefreshRate;
		coolingSystem = phCoolingSystem;
		triggerButtons= phtTriggerButtons;
		gpuName = phGpuName;
		gameMode = phGameMode;
	}
	
	public GamingPhone() {
		
	}
	
	void playGame() {
		System.out.println("Palying game...");
	}
	
	void enableGameMode() {
		System.out.println("Game Mode is On...");
	}
	
	void displayGamingFeatures() {
		System.out.println();
		System.out.println("Gaming Features=======================");
		System.out.println("Refresh Rate : " + refreshRate);
		System.out.println("Cooling System : " + coolingSystem);
		System.out.println("Trigger Buttons : " + triggerButtons);
		System.out.println("Gpu Name : " + gpuName);
		System.out.println("Game Mode : " + gameMode);
		System.out.println("======================================");
	}
}
