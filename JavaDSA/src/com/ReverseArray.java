package com;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(reverseArray(arr1)));
		
		int[] arr2 = {1, 2, 3, 4, 5, 6};
		System.out.println(Arrays.toString(reverseArray2(arr2)));
		
	}
	
	public static int[] reverseArray(int[] arr) {
		int end = arr.length - 1;
		
		for(int i=0; i<arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;
			end -= 1;
		}
		
		return arr;
	}
	
	public static int[] reverseArray2(int[] arr) {
		int index = 0;
		int[] resArray = new int[arr.length];
		
		for(int i=arr.length-1; i>=0; i--) {
			resArray[index] = arr[i];
			index++;
		}
		
		
		return resArray;
	}
}
