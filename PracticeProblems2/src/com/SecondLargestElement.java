package com;

public class SecondLargestElement {
	public static void main(String[] args) {
		
		int[] arr = {10, 8, 12, 15, 22, 9, 7, 16, 17, 45};
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);
	}
}
