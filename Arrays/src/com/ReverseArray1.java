package com;

import java.util.Arrays;
public class ReverseArray1 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		
//		for(int i=0; i<arr.length/2; i++) {
//			int temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}
//		System.out.println(Arrays.toString(arr));
		
		revserseArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void revserseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start<end){
			int t = arr[start];
			arr[start] = arr[end];
			arr[end] = t;
			start++;
			end--;
		}
	}
}
