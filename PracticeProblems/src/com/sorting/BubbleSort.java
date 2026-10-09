package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 1, 2};
		int arrLength = arr.length;
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arrLength-1; j++) {
				int temp = arr[j];
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			arrLength--;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
