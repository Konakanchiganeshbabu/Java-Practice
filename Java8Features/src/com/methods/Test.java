package com.methods;

public class Test {
	public static void main(String[] args) {
		SBHBranch1 branch1 = new SBHBranch1();
		System.out.println(branch1.getDailyWithdrawlLimt());
		System.out.println(SBHBank.getInterestPercentage());
		
		SBHBranch2 branch2 = new SBHBranch2();
		System.out.println(branch2.getDailyWithdrawlLimt());
	}
}
