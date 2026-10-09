package com.basic;

public class ThreeSum {
	public static void main(String[] args) {
		
	}
	
	public static boolean checkThreeSum(int[] arr, int target) {
		
		for(int i=0; i<arr.length-2; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					int sum = arr[i] + arr[j] + arr[k];
				}
			}
		}
		
		return false;
	}
}
