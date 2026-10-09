package com.methods;

public interface SBHBank {
	
	static double getInterestPercentage() {
		return 8.0;
	}
	
	default long getDailyWithdrawlLimt() {
		return 2500000;
	}
}
