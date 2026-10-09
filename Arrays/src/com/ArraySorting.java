package com;

import java.util.Arrays;
public class ArraySorting {
	public static void main(String[] args) {
		int[] arr = {10, 9, 2, 13, 16, 32, 0};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
