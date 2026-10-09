package com;

public class BinarySearch {

    public static void main(String[] args) {
		int[] nums = {5,9, 12, 17, 22, 28, 32, 45};
		int target = 45;
		boolean found = false;
		
		int left = 0;
		int right = nums.length-1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(nums[mid] == target) {
				System.out.println("Target found at index : " + mid);
				found = true;
				break;
			}else if(target < nums[mid]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		if(!found) {
			System.out.println("Not Found the Target in the given array");
		}
	}
}


